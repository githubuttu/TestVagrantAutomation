package weather.automation.testVagrantUtkarsh.myPages;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class NDTVWeatherPage extends BasePage {
	String mapShowCityText;
	public NDTVWeatherPage(WebDriver driver)
	{
		super();
	}
	
	@FindBy(xpath = "//input[@id='searchBox']")
	private WebElement searchTxtBox;
	
	@FindBy(xpath = "//span[@class='heading']/b")
	List<WebElement> weatherDetailsList;

	public LinkedHashMap<String, String> extractWeatherDetailsFromUI(String expectedCity)
	{
		try {
		enterText(searchTxtBox, expectedCity);
		WebElement checkBx = driver.findElement(By.xpath("//*[@id='"+expectedCity+"']"));
		String checkBoxCitySelectedTxt = checkBx.getText();
		selectCheckBox(checkBx);
		WebElement expandcityDetail=driver.findElement(By.xpath("//*[@class='cityText' and text()='"+expectedCity+"']"));
		mapShowCityText = expandcityDetail.getText();
		
		//Validate city in checkbox and on map are same
//		Assert.assertEquals(checkBoxCitySelectedTxt, mapShowCityText);
		clickJS(expandcityDetail);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return weatherListData();
		
	}
	
	public LinkedHashMap<String, String> weatherListData()
	{
		LinkedHashMap<String, String> weatherData=new LinkedHashMap<String, String>();
		
		for(int i=0;i<weatherDetailsList.size();i++)
		{
			String [] keyValueData = weatherDetailsList.get(i).getText().split(":");
			String Key = keyValueData[0].trim();
			String value = keyValueData[1].trim();
			System.out.println("Key and Value------->"+Key +value);
			weatherData.put(Key, value);
			
		}
		weatherData.put("cityUI", mapShowCityText);
		return weatherData;
	}
}
