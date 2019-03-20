package com.equipo2.ServicioMeteorologia.repository;

import com.equipo2.ServicioMeteorologia.entity.Geonames;

public interface GeonamesRepository {
//repository, servicio y controllador
	
	public Geonames getAll(String nombreCiudad);
	
	
}
