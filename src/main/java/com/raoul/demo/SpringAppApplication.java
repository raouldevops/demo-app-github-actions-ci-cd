package com.raoul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@GetMapping("")
	public Map<String, String> isMyCar(){
		Map<String, String> cars = new HashMap<>();
		cars.put("constructeur","toyota");
		cars.put("model","rav4 Hybrid");
		cars.put("annee","2022");
		cars.put("origine","japon");
		return cars;
	}

}
