package com.weather.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.repository.WeatherRepository;

@RestController
public class WeatherController {
	
	//Fill your code here
    @Autowired
	private WeatherRepository repository;
	//Fill your code here
	public List<WeatherReport> getData() {
        return repository.findById(id).get();
		//Fill your code here
	}
	
	//Fill your code here
    @PostMapping("/weatherReport")
	public WeatherReport addWeatherReport(@RequestBody WeatherReport cases) {
		//Fill your code here
        return repository.save(cases);
	}
	
	//Fill your code here
    @PutMapping("/weatherReport")
	public WeatherReport updateWeatherReport((@RequestBody WeatherReport cases) {
		//Fill your code here
        repository.saveOrUpdate(cases);
    	return cases;
	}
	
	//Fill your code here
    @GetMapping("/weatherReport/{id}")
	public WeatherReport view(@PathVariable Long id) {
        return repository.getById(id);
		//Fill your code here
	}
	
	//Fill your code here
    @DeleteMapping("/weatherReport/{id}")
	public Boolean deleteUsers(@PathVariable Long id) {
		//Fill your code here
        repository.deleteById(id);
	}
	
}
