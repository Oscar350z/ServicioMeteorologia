package com.equipo2.ServicioMeteorologia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.equipo2.ServicioMeteorologia.entity.Geonames;
import com.equipo2.ServicioMeteorologia.service.GeonamesService;

@Controller
public class IndexController {
	
	@Autowired
	private GeonamesService geonameService;

	@GetMapping ("/")
	public String index(Model model) {
		
		
		Geonames g = geonameService.getAll("Madrid");
		
		model.addAttribute("estacion", g.getAsciiName());
		return "index";
	}
	
	
}
