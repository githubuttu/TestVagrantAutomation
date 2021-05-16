package weather.automation.testVagrantUtkarsh.myAPIPages;

import org.openqa.selenium.WebDriver;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import weather.automation.testVagrantUtkarsh.myPages.BasePage;
import weather.automation.testVagrantUtkarsh.myResponse.ResponseOjectDataTransfer;

public class APIPage extends BasePage {
	ResponseOjectDataTransfer objectData=new ResponseOjectDataTransfer();
	Gson gson = new Gson();
	
	String urI = getPropertyFileData("uri");
	String parameterName1=getPropertyFileData("key1");
//	String parameterValue1=getPropertyFileData("value1");
	String parameterName2=getPropertyFileData("key2");
	String parameterValue2=getPropertyFileData("value2");
	
public ResponseOjectDataTransfer extractWeatherDetailsFromAPI(String expectedCityAPI)
{
	try {
	RestAssured.baseURI= urI;
	RequestSpecification request = RestAssured.given();
	Response response = request.queryParam(parameterName1, expectedCityAPI).queryParam(parameterName2, parameterValue2).get("/weather");
//	Response response = RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=Lucknow&appid=7fe67bf08c80ded756e598d6f8fedaea");
	System.out.println(response);
	Assert.assertEquals(response.getStatusCode(), 200);
	String resBody = response.asString();
	System.out.println("Response------------------------>>"+resBody);
	objectData=gson.fromJson(resBody, ResponseOjectDataTransfer.class);
	System.out.println("Object Data--------------->"+objectData);
	System.out.println(objectData.getCoord().getLon());
	
	} catch (Exception e) {
		System.out.println("API request is invalid" + e);
	}
	
	return objectData;
}


}
