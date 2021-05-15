package weather.automation.testVagrantUtkarsh.myPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public boolean isWebElementLoaded(WebElement e)
	{
		boolean check=false;
		try {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		check=wait.until(ExpectedConditions.visibilityOf(e)).isDisplayed();
		}
		catch (NoSuchElementException a) {
			check = false;
		} catch (NullPointerException a) {
			check = false;
		} catch (TimeoutException a) {
			check = false;
		}
		return check;
	}
	
	public void waitForPageToLoad()
	{
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver input) {
				return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
			}
			
		};
		try {
		WebDriverWait wait =new WebDriverWait(driver, 200);
		wait.until(expectation);
		}
		catch (NoSuchElementException a) {
			a.printStackTrace();
		} catch (NullPointerException a) {
			a.printStackTrace();
		} catch (TimeoutException a) {
			a.printStackTrace();
		}
	}
	
	public void enterText(WebElement element, String textValue)
	{
		try {
		if (isWebElementLoaded(element)) {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			element.sendKeys(Keys.DELETE);
			element.sendKeys(textValue);
			element.sendKeys(Keys.TAB);
		}
		}
		catch(Exception e)
		{
			System.out.println("Not able to enter text in the textbox!!");
	}
	}
	
	public void clickJS(WebElement element) {
		try {
			isWebElementLoaded(element);
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void selectCheckBox(WebElement element) throws InterruptedException {
		try {
			if (element.isSelected()) {
				Actions actions = new Actions(driver);
				actions.doubleClick(element).perform();
			} else {
				element.click();
			}

		} catch (Exception e) {
			System.out.println("Checkbox is not visible" + e);
		}

	}
}
