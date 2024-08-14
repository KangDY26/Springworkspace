package com.ezen.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ezen.springmvc.stu.Car;

@Controller
public class CarController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	Car car;

//	@GetMapping("/study")
//	public String study() {
//		car.setCar_name("모닝");
//		car.setCar_price(1000);
//		
//		System.out.println(car);
//		return "index";
//	}
	
	@GetMapping("/study")
	public String study() {
		Car car1 = new Car();
		
		car1.setCar_name("모닝");
		car1.setCar_price(1000);
		
		log.error("{}",car1);
		

		
		
		
		return null;
	}
	
	
}
