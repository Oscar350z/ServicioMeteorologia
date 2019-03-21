package com.equipo2.ServicioMeteorologia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bbox {

	private float east;
	private float south;
	private float north;
	private float west;
	
	public Bbox() {
	}

	public Bbox(float east, float south, float north, float west) {
		this.east = east;
		this.south = south;
		this.north = north;
		this.west = west;
	}

	public float getEast() {
		return east;
	}

	public void setEast(float east) {
		this.east = east;
	}

	public float getSouth() {
		return south;
	}

	public void setSouth(float south) {
		this.south = south;
	}

	public float getNorth() {
		return north;
	}

	public void setNorth(float north) {
		this.north = north;
	}

	public float getWest() {
		return west;
	}

	public void setWest(float west) {
		this.west = west;
	}
	
}
