package com.equipo2.ServicioMeteorologia.entity;

public class Bbox {

	
	private long east;
	private long south;
	private long north;
	private long west;
	
	
	
	public Bbox(long east, long south, long north, long west) {
		this.east = east;
		this.south = south;
		this.north = north;
		this.west = west;
	}
	
	public long getEast() {
		return east;
	}
	public void setEast(long east) {
		this.east = east;
	}
	public long getSouth() {
		return south;
	}
	public void setSouth(long south) {
		this.south = south;
	}
	public long getNorth() {
		return north;
	}
	public void setNorth(long north) {
		this.north = north;
	}
	public long getWest() {
		return west;
	}
	public void setWest(long west) {
		this.west = west;
	}
	
	
	
}
