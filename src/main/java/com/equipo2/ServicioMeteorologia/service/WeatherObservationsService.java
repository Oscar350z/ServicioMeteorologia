package com.equipo2.ServicioMeteorologia.service;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.TotalWeatherObservations;

public interface WeatherObservationsService {
	
	TotalWeatherObservations findAll(Bbox bbox);

}
