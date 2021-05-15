package weather.automation.testVagrantUtkarsh.myResponse;

public class Wind {
	Float speed;
	Integer deg;
	Float gust;
	public Wind() {
		
	}
	/**
	 * @return the speed
	 */
	public Float getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Float speed) {
		this.speed = speed;
	}
	/**
	 * @return the deg
	 */
	public Integer getDeg() {
		return deg;
	}
	/**
	 * @param deg the deg to set
	 */
	public void setDeg(Integer deg) {
		this.deg = deg;
	}
	/**
	 * @return the gust
	 */
	public Float getGust() {
		return gust;
	}
	/**
	 * @param gust the gust to set
	 */
	public void setGust(Float gust) {
		this.gust = gust;
	}
	/**
	 * @param speed
	 * @param deg
	 * @param gust
	 */
	public Wind(Float speed, Integer deg, Float gust) {
		super();
		this.speed = speed;
		this.deg = deg;
		this.gust = gust;
	}
	

}
