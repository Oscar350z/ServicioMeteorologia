package com.equipo2.ServicioMeteorologia.entity;

import java.util.List;

public class TotalResultCount {

	
	private int results;
	private List<Geonames> listaGeonames;
	
	public TotalResultCount(int results, List<Geonames> listaGeonames) {
		this.results = results;
		this.listaGeonames = listaGeonames;
	}

	public int getResults() {
		return results;
	}

	public void setResults(int results) {
		this.results = results;
	}

	public List<Geonames> getListaGeonames() {
		return listaGeonames;
	}

	public void setListaGeonames(List<Geonames> listaGeonames) {
		this.listaGeonames = listaGeonames;
	}  
	
	
	
	
}
