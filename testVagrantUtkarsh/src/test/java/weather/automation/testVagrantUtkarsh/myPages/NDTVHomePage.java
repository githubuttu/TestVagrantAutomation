package weather.automation.testVagrantUtkarsh.myPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NDTVHomePage extends BasePage {
	public NDTVHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy( xpath ="//a[text()='No Thanks']")
	private WebElement newsAlertNotNow;
	
	@FindBy(xpath = "//a[@id ='h_sub_menu']")
	private WebElement expandLink;
	
	@FindBy(xpath="//div[@class='topnav_cont']/a[text()='WEATHER']")
	private WebElement weatherLink;
	
	public void navigateToWeatherPage()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if (newsAlertNotNow.isDisplayed()) {
			newsAlertNotNow.click();
		}
		isWebElementLoaded(expandLink);
		expandLink.click();
		isWebElementLoaded(weatherLink);
//		weatherLink.click();
		clickJS(weatherLink);
		waitForPageToLoad();
	}

}
