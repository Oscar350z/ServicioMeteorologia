package com.equipo2.ServicioMeteorologia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipo2.ServicioMeteorologia.entity.Geonames;
import com.equipo2.ServicioMeteorologia.entity.TotalResults;
import com.equipo2.ServicioMeteorologia.repository.GeonamesRepository;

@Service
public class GeonameServiceImpl implements GeonamesService {

	@Autowired
	private GeonamesRepository geonameRepository;

	public TotalResults getAll(String nombreCiudad) {

		return geonameRepository.getAll(nombreCiudad);
	}

	@Override
	public Geonames getFirstGeonames(String nombreCiudad) {
		
		return geonameRepository.getFirstGeoname(nombreCiudad);
	}
	
}
