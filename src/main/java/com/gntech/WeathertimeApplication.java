package com.gntech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.gntech.Model.WeatherResponse;

@SpringBootApplication
public class WeathertimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeathertimeApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		WeatherResponse weatherJson = restTemplate.getForObject("https://api.data.gov.sg/v1/environment/air-temperature", WeatherResponse.class);

		System.err.println(weatherJson);

	}

}
