package com.equipo2.ServicioMeteorologia.entity;

public class Geonames {

	
	private int id;
	private String asciiName;
	private Bbox bbox;
	
	public Geonames(int id, String asciiName, Bbox bbox) {
		this.id = id;
		this.asciiName = asciiName;
		this.bbox = bbox;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
