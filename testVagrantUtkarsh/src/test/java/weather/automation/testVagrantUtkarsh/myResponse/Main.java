package weather.automation.testVagrantUtkarsh.myResponse;

public class Main {
	Float temp;
	Float feels_like;
	Float temp_min;
	Float temp_max;
	Float pressure;
	Integer humidity;
	Integer sea_level;
	Integer grnd_level;
	
	

	/**
	 * @param temp
	 * @param feels_like
	 * @param temp_min
	 * @param temp_max
	 * @param pressure
	 * @param humidity
	 * @param sea_level
	 * @param grnd_level
	 */
	public Main(Float temp, Float feels_like, Float temp_min, Float temp_max, Float pressure, Integer humidity,
			Integer sea_level, Integer grnd_level) {
		super();
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
	}
	



	public Main() {
		
	}




	/**
	 * @return the temp
	 */
	public Float getTemp() {
		return temp;
	}




	/**
	 * @param temp the temp to set
	 */
	public void setTemp(Float temp) {
		this.temp = temp;
	}




	/**
	 * @return the feels_like
	 */
	public Float getFeels_like() {
		return feels_like;
	}




	/**
	 * @param feels_like the feels_like to set
	 */
	public void setFeels_like(Float feels_like) {
		this.feels_like = feels_like;
	}




	/**
	 * @return the temp_min
	 */
	public Float getTemp_min() {
		return temp_min;
	}




	/**
	 * @param temp_min the temp_min to set
	 */
	public void setTemp_min(Float temp_min) {
		this.temp_min = temp_min;
	}




	/**
	 * @return the temp_max
	 */
	public Float getTemp_max() {
		return temp_max;
	}




	/**
	 * @param temp_max the temp_max to set
	 */
	public void setTemp_max(Float temp_max) {
		this.temp_max = temp_max;
	}




	/**
	 * @return the pressure
	 */
	public Float getPressure() {
		return pressure;
	}




	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}




	/**
	 * @return the humidity
	 */
	public Integer getHumidity() {
		return humidity;
	}




	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}




	/**
	 * @return the sea_level
	 */
	public Integer getSea_level() {
		return sea_level;
	}




	/**
	 * @param sea_level the sea_level to set
	 */
	public void setSea_level(Integer sea_level) {
		this.sea_level = sea_level;
	}




	/**
	 * @return the grnd_level
	 */
	public Integer getGrnd_level() {
		return grnd_level;
	}




	/**
	 * @param grnd_level the grnd_level to set
	 */
	public void setGrnd_level(Integer grnd_level) {
		this.grnd_level = grnd_level;
	}
	
}
