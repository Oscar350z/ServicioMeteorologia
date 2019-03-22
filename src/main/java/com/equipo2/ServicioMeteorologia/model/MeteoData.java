

package com.equipo2.ServicioMeteorologia.model;

import java.util.List;

import com.equipo2.ServicioMeteorologia.entity.WeatherObservations;

public class MeteoData {
	
	private String ciudad;
	private float lat;
	private float lng;
	private double mediaTemperatura;
	private int mediaHumedad;
	private double mediaVelocidadViento;
	private List<WeatherObservations> listaEstaciones;
	
	public MeteoData() {
	}

	public MeteoData(String ciudad, float lat, float lng, double mediaTemperatura, int mediaHumedad,
			double mediaVelocidadViento, List<WeatherObservations> listaEstaciones) {
		this.ciudad = ciudad;
		this.lat = lat;
		this.lng = lng;
		this.mediaTemperatura = mediaTemperatura;
		this.mediaHumedad = mediaHumedad;
		this.mediaVelocidadViento = mediaVelocidadViento;
		this.listaEstaciones = listaEstaciones;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLng() {
		return lng;
	}

	public void setLng(float lng) {
		this.lng = lng;
	}

	public double getMediaTemperatura() {
		return mediaTemperatura;
	}

	public void setMediaTemperatura(double mediaTemperatura) {
		this.mediaTemperatura = mediaTemperatura;
	}

	public int getMediaHumedad() {
		return mediaHumedad;
	}

	public void setMediaHumedad(int mediaHumedad) {
		this.mediaHumedad = mediaHumedad;
	}

	public double getMediaVelocidadViento() {
		return mediaVelocidadViento;
	}

	public void setMediaVelocidadViento(double mediaVelocidadViento) {
		this.mediaVelocidadViento = mediaVelocidadViento;
	}

	public List<WeatherObservations> getListaEstaciones() {
		return listaEstaciones;
	}

	public void setListaEstaciones(List<WeatherObservations> listaEstaciones) {
		this.listaEstaciones = listaEstaciones;
	}
}