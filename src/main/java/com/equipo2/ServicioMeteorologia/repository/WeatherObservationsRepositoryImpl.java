package com.equipo2.ServicioMeteorologia.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.TotalWeatherObservations;

@Repository
public class WeatherObservationsRepositoryImpl implements WeatherObservationsRepository {

	@Override
	public TotalWeatherObservations findAll(Bbox bbox) {
		
		String url = "http://api.geonames.org/weatherJSON?north="+ bbox.getNorth() +"&south=" + bbox.getSouth() + "&east=" + bbox.getEast() +"&west=" + bbox.getWest() + "&usern" + 
				"ame=ilgeonamessample";
		
		RestTemplate restTemplate = new RestTemplate();
		
//		WeatherObservations weather = restTemplate.getForObject(url, WeatherObservations.class);
		
		TotalWeatherObservations weather2 = restTemplate.getForObject(url, TotalWeatherObservations.class);
		
		return weather2;
	}

}
