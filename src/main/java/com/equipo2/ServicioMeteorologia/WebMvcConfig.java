package com.equipo2.ServicioMeteorologia;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

public class WebMvcConfig implements WebMvcConfigurer{

	// Configuración de internacionalización
		@Bean
		public LocaleResolver localeResolver() {
			SessionLocaleResolver localeResolver = new SessionLocaleResolver();
			localeResolver.setDefaultLocale(new Locale("es", "ES"));
			return localeResolver;
		}
		
		// Creación de un interceptor para cambiar el locale cada vez que se envíe el parámetro de cambio
		@Bean
		public LocaleChangeInterceptor localeChangeInterceptor() {
			LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
			localeInterceptor.setParamName("lang");
			return localeInterceptor;
		}

		// Registrar el interceptor en la aplicación
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(localeChangeInterceptor());
		}
}
