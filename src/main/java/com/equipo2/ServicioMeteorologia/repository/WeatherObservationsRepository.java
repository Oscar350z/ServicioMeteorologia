package com.equipo2.ServicioMeteorologia.repository;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.WeatherObservations;

public interface WeatherObservationsRepository {
	
	WeatherObservations findAll(Bbox bbox);

}
