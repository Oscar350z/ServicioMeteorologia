package com.equipo2.ServicioMeteorologia.entity;

public class WeatherObservations {

	
	private long lng;
	private long lat;
	private String stationName;
	private long temperature;
	private int humidity;
	
	public WeatherObservations(long lng, long lat, String stationName, long temperature, int humidity) {
		this.lng = lng;
		this.lat = lat;
		this.stationName = stationName;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public long getLng() {
		return lng;
	}

	public void setLng(long lng) {
		this.lng = lng;
	}

	public long getLat() {
		return lat;
	}

	public void setLat(long lat) {
		this.lat = lat;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public long getTemperature() {
		return temperature;
	}

	public void setTemperature(long temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	
	
	
	
}
