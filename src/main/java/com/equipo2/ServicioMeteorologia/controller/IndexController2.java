package com.equipo2.ServicioMeteorologia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.Geonames;
import com.equipo2.ServicioMeteorologia.entity.TotalResults;
import com.equipo2.ServicioMeteorologia.entity.TotalWeatherObservations;
import com.equipo2.ServicioMeteorologia.service.GeonamesService;
import com.equipo2.ServicioMeteorologia.service.WeatherObservationsService;

@Controller
public class IndexController2 {
	
	@Autowired
	private GeonamesService geonameService;
	@Autowired
	private WeatherObservationsService weatherService;

	@GetMapping ("/pruebas")
	public String index(Model model) {
		
		
//		Geonames g = geonameService.getAll("Madrid");
		
		Bbox bbox = new Bbox(44.1f, -9.9f, -22.4f, 55.2f);
		
		System.out.println("Antes de recuperar lista de observaciones");
		
		TotalWeatherObservations w = weatherService.findAll(bbox);
		String nombreCiudad = "Madrid";
		TotalResults t = geonameService.getAll(nombreCiudad);
		
		System.out.println("Número de geonames: " + t.getGeonames().size());
		
		int i = 0;
		for(Geonames observation : t.getGeonames()) {
			
			System.out.println(" ******************************************* ");
			System.out.println("Número de ciudad: " + ++i);
			System.out.println("Nombre de la ciudad: " + observation.getAsciiName());
			System.out.println("Coordenada Norte: " + observation.getBbox().getNorth());
			System.out.println("Coordenada Sur: " + observation.getBbox().getSouth());
			System.out.println("Coordenada Este: " + observation.getBbox().getEast());
			System.out.println("Coordenada Oeste: " + observation.getBbox().getWest());
		}
		
		model.addAttribute("stations", w.getWeatherObservations());
		model.addAttribute("ciudad", nombreCiudad);
		model.addAttribute("geonames", t.getGeonames());
		
		return "pruebas";
	}
	
	@PostMapping("/pruebas")
	public String resultados(@RequestParam("ciudad") String ciudad, Model model) {
		model.addAttribute("ciudad", ciudad);
		
		
		return "resultados";
	}

}
