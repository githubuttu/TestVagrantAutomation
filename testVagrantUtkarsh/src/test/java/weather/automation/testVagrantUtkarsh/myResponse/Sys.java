package weather.automation.testVagrantUtkarsh.myResponse;

public class Sys {
	String country;
	Double sunrise;
	Double sunset;
	
	public Sys() {
		
	}

	/**
	 * @param country
	 * @param sunrise
	 * @param sunset
	 */
	public Sys(String country, Double sunrise, Double sunset) {
		super();
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the sunrise
	 */
	public Double getSunrise() {
		return sunrise;
	}

	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(Double sunrise) {
		this.sunrise = sunrise;
	}

	/**
	 * @return the sunset
	 */
	public Double getSunset() {
		return sunset;
	}

	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(Double sunset) {
		this.sunset = sunset;
	}

}
