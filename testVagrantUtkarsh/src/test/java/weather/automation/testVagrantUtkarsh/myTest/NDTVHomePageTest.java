package weather.automation.testVagrantUtkarsh.myTest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import weather.automation.testVagrantUtkarsh.myAPIPages.APIPage;
import weather.automation.testVagrantUtkarsh.myPages.BasePage;
import weather.automation.testVagrantUtkarsh.myPages.NDTVHomePage;
import weather.automation.testVagrantUtkarsh.myPages.NDTVWeatherPage;
import weather.automation.testVagrantUtkarsh.myResponse.ResponseOjectDataTransfer;

public class NDTVHomePageTest extends BasePage {
ResponseOjectDataTransfer responseObject= new ResponseOjectDataTransfer();
LinkedHashMap<String, String> weatherDataUI;

WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", getPropertyFileData("chromeDriverPath"));
			driver = new ChromeDriver();
			driver.get(getPropertyFileData("url"));
			driver.manage().window().maximize();
		}
	}
	
	@Test(priority=1)
	@Parameters({"expectedCityUI"})
	public void collectWeatherDataUI(String expectedCityUI)
	{
		NDTVHomePage nHP=PageFactory.initElements(driver, NDTVHomePage.class);
		nHP.navigateToWeatherPage();
		NDTVWeatherPage nWP=PageFactory.initElements(driver, NDTVWeatherPage.class);
		weatherDataUI = nWP.extractWeatherDetailsFromUI(expectedCityUI);
		for(Map.Entry<String, String> entry : weatherDataUI.entrySet())
		{
			System.out.println("Key==>"+entry.getKey());
			System.out.println("Value==>"+entry.getValue());
		}
	}
	@Test(priority=2)
	@Parameters({"expectedCityAPI"})
	public void collectWeatherDataAPI(String expectedCityAPI)
	{
		APIPage apiPage = PageFactory.initElements(driver, APIPage.class);
		responseObject = apiPage.extractWeatherDetailsFromAPI(expectedCityAPI);
		//Verify expected city in query param and actual city in response
		String actualCityAPI = responseObject.getName();
		Assert.assertEquals(actualCityAPI, expectedCityAPI);
	}
	
	@Test(priority=3)
	@Parameters({"expectedCityAPI"})
	public void verifyUIAndAPIData()
	{
		float tempKelvinAPI = responseObject.getMain().getTemp();
		String cityAPI = responseObject.getName();
		System.out.println("tempKelvinAPI------>"+tempKelvinAPI);
		System.out.println("cityAPI------>"+cityAPI);
		String tempFarenhietUI=weatherDataUI.get("Temp in Degrees");
		String cityUI=weatherDataUI.get("cityUI");
		int tempCelsiusUI = Math.round(Float.parseFloat(tempFarenhietUI));
		int tempCelsiusAPI = Math.round(tempKelvinAPI - 273.15F);
		System.out.println("tempCelsiusUI--------------------->"+tempCelsiusUI);
		System.out.println("tempCelsiusAPI------------------->"+tempCelsiusAPI);
		Assert.assertEquals(cityUI, cityAPI);
		int tempDifference=Math.subtractExact(tempCelsiusUI, tempCelsiusAPI);
		if(tempDifference<=2 || tempDifference>=-2)
		{
			Assert.assertTrue(true, "UI and API temperature are same!!");
		}
		else if(tempCelsiusUI==tempCelsiusAPI)
		{
			Assert.assertTrue(true, "UI and API temperature are same!!");	
		}
		else
		{
			Assert.assertFalse(true, "UI and API temperature are not same!!");  
		}
		
		
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
