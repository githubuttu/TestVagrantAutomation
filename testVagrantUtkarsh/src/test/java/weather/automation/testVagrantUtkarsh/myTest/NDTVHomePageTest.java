package weather.automation.testVagrantUtkarsh.myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import weather.automation.testVagrantUtkarsh.myPages.BasePage;

public class NDTVHomePageTest extends BasePage {

WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
//		if(browser.equalsIgnoreCase("chrome"))
//		{
			System.setProperty("webdriver.chrome.driver", getPropertyFileData("chromeDriverPath"));
			driver = new ChromeDriver();
			driver.get(getPropertyFileData("url"));
			driver.manage().window().maximize();
//		}
	}
	
	@Test
	public void test()
	{
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
