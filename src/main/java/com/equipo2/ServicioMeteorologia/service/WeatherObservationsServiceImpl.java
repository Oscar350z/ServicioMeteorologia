package com.equipo2.ServicioMeteorologia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.TotalWeatherObservations;
import com.equipo2.ServicioMeteorologia.repository.WeatherObservationsRepository;

@Service
public class WeatherObservationsServiceImpl implements WeatherObservationsService {
	
	@Autowired
	private WeatherObservationsRepository weatherRepository;

	@Override
	public TotalWeatherObservations findAll(Bbox bbox) {
		
		
		return weatherRepository.findAll(bbox);
	}

}
