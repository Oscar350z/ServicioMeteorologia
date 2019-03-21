package com.equipo2.ServicioMeteorologia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipo2.ServicioMeteorologia.entity.Geonames;
import com.equipo2.ServicioMeteorologia.entity.TotalWeatherObservations;
import com.equipo2.ServicioMeteorologia.entity.WeatherObservations;
import com.equipo2.ServicioMeteorologia.model.MeteoData;

@Service
public class EstadisticaServiceImpl implements EstadisticasService {
	
	@Autowired
	private GeonamesService geonameService;
	@Autowired
	private WeatherObservationsService weatherService;

	@Override
	public MeteoData calculaMedia(String nombreCiudad) {
		
		MeteoData meteoData = new MeteoData();
		double temperature = 0.0;
		double temperatureAverage = 0.0;
		int humidity = 0;
		int humidityAverage = 0;
		double windSpeed = 0;
		double windSpeedAverage = 0;
		
		Geonames geonames = geonameService.getFirstGeonames(nombreCiudad);
		TotalWeatherObservations observations = weatherService.findAll(geonames.getBbox());
		
		for(WeatherObservations observation : observations.getWeatherObservations()) {
			temperature = temperature + observation.getTemperature();
			humidity = humidity + observation.getHumidity();
			
			windSpeed = windSpeed + Double.parseDouble(observation.getWindSpeed());
		}
		
		try {
			temperatureAverage = temperature/observations.getWeatherObservations().size();
			humidityAverage = humidity/observations.getWeatherObservations().size();
			windSpeedAverage = windSpeed/observations.getWeatherObservations().size();
		}catch(Exception e){
			e.getMessage();
			System.out.println("No existen estaciones");
//			throw new Exception("");
		}
		
		
		meteoData.setCiudad(nombreCiudad);
		meteoData.setMediaTemperatura(temperatureAverage);
		meteoData.setMediaHumedad(humidityAverage);
		meteoData.setMediaVelocidadViento(windSpeedAverage);
		meteoData.setListaEstaciones(observations.getWeatherObservations());
		
		return meteoData;
	}

}
