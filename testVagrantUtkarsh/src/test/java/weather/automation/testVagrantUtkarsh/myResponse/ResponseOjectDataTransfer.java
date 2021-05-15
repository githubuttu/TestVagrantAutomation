package weather.automation.testVagrantUtkarsh.myResponse;

import java.util.List;

public class ResponseOjectDataTransfer {
	Coord coord;
	List<Weather> weather;
	String Base;
	Main main;
	Integer visibility;
	Wind wind;
	Clouds clouds;
	Double dt;
	Sys sys;
	Integer timezone;
	Integer id;
	String name;
	
	public ResponseOjectDataTransfer() {
		
	}

	/**
	 * @param coord
	 * @param weather
	 * @param base
	 * @param main
	 * @param visibility
	 * @param wind
	 * @param clouds
	 * @param dt
	 * @param sys
	 * @param timezone
	 * @param id
	 * @param name
	 */
	public ResponseOjectDataTransfer(Coord coord, List<Weather> weather, String base, Main main, Integer visibility,
			Wind wind, Clouds clouds, Double dt, Sys sys, Integer timezone, Integer id, String name) {
		super();
		this.coord = coord;
		this.weather = weather;
		Base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the coord
	 */
	public Coord getCoord() {
		return coord;
	}

	/**
	 * @param coord the coord to set
	 */
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	/**
	 * @return the weather
	 */
	public List<Weather> getWeather() {
		return weather;
	}

	/**
	 * @param weather the weather to set
	 */
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	/**
	 * @return the base
	 */
	public String getBase() {
		return Base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(String base) {
		Base = base;
	}

	/**
	 * @return the main
	 */
	public Main getMain() {
		return main;
	}

	/**
	 * @param main the main to set
	 */
	public void setMain(Main main) {
		this.main = main;
	}

	/**
	 * @return the visibility
	 */
	public Integer getVisibility() {
		return visibility;
	}

	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	/**
	 * @return the wind
	 */
	public Wind getWind() {
		return wind;
	}

	/**
	 * @param wind the wind to set
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	/**
	 * @return the clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}

	/**
	 * @param clouds the clouds to set
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	/**
	 * @return the dt
	 */
	public Double getDt() {
		return dt;
	}

	/**
	 * @param dt the dt to set
	 */
	public void setDt(Double dt) {
		this.dt = dt;
	}

	/**
	 * @return the sys
	 */
	public Sys getSys() {
		return sys;
	}

	/**
	 * @param sys the sys to set
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
	}

	/**
	 * @return the timezone
	 */
	public Integer getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
