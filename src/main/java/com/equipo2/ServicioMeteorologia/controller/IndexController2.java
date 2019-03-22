package com.equipo2.ServicioMeteorologia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.equipo2.ServicioMeteorologia.model.MeteoData;
import com.equipo2.ServicioMeteorologia.service.EstadisticasService;
import com.equipo2.ServicioMeteorologia.service.GeonamesService;
import com.equipo2.ServicioMeteorologia.service.WeatherObservationsService;

@Controller
@Scope("session")
public class IndexController2 {
	
	@Autowired
	private GeonamesService geonameService;
	@Autowired
	private WeatherObservationsService weatherService;
	@Autowired
	private EstadisticasService estadisticasService;
	
	private List<String> historial = new ArrayList<>();

	@GetMapping ("/")
	public String index(Model model) {
		
		
		model.addAttribute("historial", historial); 	
		
//		if(model.equals("historial")){
//			model.addAttribute("", historial);
//		}
//		model.containsAttribute("historial");
		
		return "index";
	}
	
	@PostMapping("/pruebas")
	public String resultados(@RequestParam("ciudad") String ciudad, Model model) {
		
		MeteoData meteodata = estadisticasService.calculaMedia(ciudad);
		model.addAttribute("meteodata", meteodata);
		//historial.add(ciudad);
		//model.addAttribute("listaCiudades", ciudad);
		
		if(!historial.contains(ciudad)) {
			historial.add(ciudad);
		}
		return "resultados";
	}

}
