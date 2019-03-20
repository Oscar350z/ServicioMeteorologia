package com.equipo2.ServicioMeteorologia.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.WeatherObservations;

public class WeatherObservationsRepositoryImpl implements WeatherObservationsRepository {

	@Override
	public WeatherObservations findAll(Bbox bbox) {
		
		String url = "http://api.geonames.org/weatherJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&use\r\n" + 
				"rname=demo";
		
		RestTemplate restTemplate = new RestTemplate();
		
		WeatherObservations weather = restTemplate.getForObject(url, WeatherObservations.class);
		
		return weather;
	}

}
