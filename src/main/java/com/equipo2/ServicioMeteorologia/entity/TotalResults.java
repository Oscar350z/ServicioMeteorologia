package com.equipo2.ServicioMeteorologia.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalResults {
	
	private int totalResultsCount;
	private List<Geonames> geonames;
	
	public TotalResults() {
	}

	public TotalResults(int totalResultsCount, List<Geonames> geonames) {
		this.totalResultsCount = totalResultsCount;
		this.geonames = geonames;
	}

	public int getTotalResultsCount() {
		return totalResultsCount;
	}

	public void setTotalResultsCount(int totalResultsCount) {
		this.totalResultsCount = totalResultsCount;
	}

	public List<Geonames> getGeonames() {
		return geonames;
	}

	public void setGeonames(List<Geonames> geonames) {
		this.geonames = geonames;
	}

}
