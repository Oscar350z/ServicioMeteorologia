package com.equipo2.ServicioMeteorologia.model;

public class MeteoData {
	
	private double mediaTemperatura;
	private int mediaHumedad;
	private double mediaVelocidadViento;
	
	public MeteoData() {
	}

	public MeteoData(double mediaTemperatura, int mediaHumedad, double mediaVelocidadViento) {
		this.mediaTemperatura = mediaTemperatura;
		this.mediaHumedad = mediaHumedad;
		this.mediaVelocidadViento = mediaVelocidadViento;
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

}
