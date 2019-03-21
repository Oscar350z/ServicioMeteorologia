package com.equipo2.ServicioMeteorologia.service;

import com.equipo2.ServicioMeteorologia.entity.Geonames;
import com.equipo2.ServicioMeteorologia.entity.TotalResults;

public interface GeonamesService {

	public TotalResults getAll(String nombreCiudad);
	
	public Geonames getFirstGeonames(String nombreCiudad);
	
}
