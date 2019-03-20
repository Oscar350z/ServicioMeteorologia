package com.equipo2.ServicioMeteorologia.service;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.WeatherObservations;

public interface WeatherObservationsService {
	
	WeatherObservations findAll(Bbox bbox);

}
