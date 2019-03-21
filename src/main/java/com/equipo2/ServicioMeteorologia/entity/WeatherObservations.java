package com.equipo2.ServicioMeteorologia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherObservations {

	private float lng;
	private float lat;
	private String stationName;
	private double temperature;
	private int humidity;
	private String windSpeed;
	
	public WeatherObservations() {
	}

	public WeatherObservations(float lng, float lat, String stationName, double temperature, int humidity,
			String windSpeed) {
		this.lng = lng;
		this.lat = lat;
		this.stationName = stationName;
		this.temperature = temperature;
		this.humidity = humidity;
		this.windSpeed = windSpeed;
	}

	public float getLng() {
		return lng;
	}

	public void setLng(float lng) {
		this.lng = lng;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	
}
