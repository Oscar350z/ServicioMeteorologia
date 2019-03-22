package com.equipo2.ServicioMeteorologia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geonames {

	private String asciiName;
	private Bbox bbox;
	private String lat;
	private String lng;
	
	public Geonames() {
	}
	
	public Geonames(String asciiName, Bbox bbox, String lat, String lng) {
		super();
		this.asciiName = asciiName;
		this.bbox = bbox;
		this.lat = lat;
		this.lng = lng;
	}

	public String getAsciiName() {
		return asciiName;
	}
	public void setAsciiName(String asciiName) {
		this.asciiName = asciiName;
	}
	public Bbox getBbox() {
		return bbox;
	}
	public void setBbox(Bbox bbox) {
		this.bbox = bbox;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}
	
}

