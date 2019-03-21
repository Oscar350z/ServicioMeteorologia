package com.equipo2.ServicioMeteorologia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.equipo2.ServicioMeteorologia.entity.Bbox;
import com.equipo2.ServicioMeteorologia.entity.TotalResults;
import com.equipo2.ServicioMeteorologia.entity.TotalWeatherObservations;
import com.equipo2.ServicioMeteorologia.model.MeteoData;
import com.equipo2.ServicioMeteorologia.service.EstadisticasService;
import com.equipo2.ServicioMeteorologia.service.GeonamesService;
import com.equipo2.ServicioMeteorologia.service.WeatherObservationsService;

@Controller
public class IndexController2 {
	
	@Autowired
	private GeonamesService geonameService;
	@Autowired
	private WeatherObservationsService weatherService;
	@Autowired
	private EstadisticasService estadisticasService;

	@GetMapping ("/")
	public String index(Model model) {
		
		return "index";
	}
	
	@PostMapping("/pruebas")
	public String resultados(@RequestParam("ciudad") String ciudad, Model model) {
		
		MeteoData meteodata = estadisticasService.calculaMedia(ciudad);
		model.addAttribute("meteodata", meteodata);
		
		return "resultados";
	}

}
