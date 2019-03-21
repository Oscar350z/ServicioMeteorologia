package com.equipo2.ServicioMeteorologia.repository;

import com.equipo2.ServicioMeteorologia.entity.TotalResults;

public interface GeonamesRepository {
//repository, servicio y controllador
	
	public TotalResults getAll(String nombreCiudad);
	
	
}
