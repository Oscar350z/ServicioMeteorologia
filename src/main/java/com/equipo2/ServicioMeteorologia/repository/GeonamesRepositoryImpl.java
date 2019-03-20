package com.equipo2.ServicioMeteorologia.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.equipo2.ServicioMeteorologia.entity.Geonames;

@Repository
public class GeonamesRepositoryImpl implements GeonamesRepository{

	
	
	public Geonames getAll(String nombreCiudad) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://api.geonames.org/searchJSON?q="+nombreCiudad+"&maxRows=20&startRow=0&lang=en&isNameRequired =true&style=FULL&username=ilgeonamessample";
		
		Geonames geoname = restTemplate.getForObject(fooResourceUrl, Geonames.class);	
		
		
		
		return geoname;
		
		
	}
	
}
