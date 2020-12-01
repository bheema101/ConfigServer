package com.hotel.ConfigServer.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServerRest {
	
	@Value("${spring.datasource.url}")
	public String url;
	
	
	@GetMapping("/readprop")
	public String getProperty() {
		return url;
	}

}
