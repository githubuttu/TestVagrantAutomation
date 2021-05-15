package weather.automation.testVagrantUtkarsh.myPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	public static WebDriver driver;
	long wait = 100;

	public BasePage(WebDriver d) {
		this.driver = d;
	}
	
	public BasePage()
	{
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	Properties propertyFile=new Properties();
	FileInputStream file = null;


	
	public boolean loadWebElement(WebElement element) {
		// TODO Auto-generated method stub
		return false;
	}


	public void scrollToElement(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	
	public String getPropertyFileData(String key) {
		try {
			file = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/weather/automation/testVagrantUtkarsh/myConfig/weatherData.properties");
			propertyFile.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propertyFile.getProperty(key);
	}

}
