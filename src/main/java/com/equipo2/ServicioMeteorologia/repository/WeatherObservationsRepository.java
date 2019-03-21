package com.equipo2.ServicioMeteorologia.repository;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.TotalWeatherObservations;

public interface WeatherObservationsRepository {
	
	TotalWeatherObservations findAll(Bbox bbox);

}
