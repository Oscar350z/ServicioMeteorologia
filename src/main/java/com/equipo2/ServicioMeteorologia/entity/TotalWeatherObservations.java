package com.equipo2.ServicioMeteorologia.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalWeatherObservations {

	List<WeatherObservations> weatherObservations;

	public TotalWeatherObservations() {
	}

	public TotalWeatherObservations(List<WeatherObservations> weatherObservations) {
		this.weatherObservations = weatherObservations;
	}

	public List<WeatherObservations> getWeatherObservations() {
		return weatherObservations;
	}

	public void setWeatherObservations(List<WeatherObservations> weatherObservations) {
		this.weatherObservations = weatherObservations;
	}
	
}
