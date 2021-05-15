package weather.automation.testVagrantUtkarsh.myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import weather.automation.testVagrantUtkarsh.myPages.BasePage;
import weather.automation.testVagrantUtkarsh.myPages.NDTVHomePage;

public class NDTVHomePageTest extends BasePage {

WebDriver driver;
	@BeforeMethod
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
	
	@Test
	public void collectWeatherData()
	{
		NDTVHomePage nHP=PageFactory.initElements(driver, NDTVHomePage.class);
		nHP.navigateToWeatherPage();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
//		driver.close();
//		driver.quit();
	}

}
