package com.training.impl;

import java.util.HashMap;
import com.training.*;
import javax.jws.*;

import com.training.service.WeatherService;

@WebService(endpointInterface = "com.training.service.WeatherService")
public class WeatherServiceImpl implements WeatherService {
	
	private HashMap<String, String> details;
	
	
	public WeatherServiceImpl() {
		super();
		this.details = new HashMap<String,String>();
		details.put("CHN", "40C,sun");
		details.put("DEL", "30C,haze");
		details.put("BAN", "20C,rain");
		details.put("NAI", "10C,clear");
	}


	@Override
	public String getWeather(String city) {
		return this.details.get(city.toUpperCase());
	}

}
