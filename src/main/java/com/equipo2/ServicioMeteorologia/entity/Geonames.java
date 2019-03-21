package com.equipo2.ServicioMeteorologia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geonames {

	private String asciiName;
	private Bbox bbox;
	
	public Geonames() {
	}

	public Geonames(String asciiName, Bbox bbox) {
		this.asciiName = asciiName;
		this.bbox = bbox;
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
	
	
	
	
	
}
