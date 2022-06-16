package com.ty.Boot_car_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCar {

	@PostMapping("/save")
	public String saveCar(@RequestBody Car car) {
		return "Id:"+car.getId() + "name:"+car.getName() +"brand:"+car.getColour() +"cost:"+car.getCost(); 
	}
	@GetMapping("/getall")
	public List<Car> getall(){
		List<Car> l= new ArrayList<Car>();
		Car c1 = new Car();
		c1.setId(1);
		c1.setColour("red");
		c1.setCost(65464);
		c1.setName("maruthi");
		
		Car c2 = new Car();
		c2.setId(2);
		c2.setCost(56484);
		c2.setColour("blue");
		c2.setName("kia");
		l.add(c1);
		l.add(c2);
		return l;
		
	}
	
	@GetMapping("/getid/{id}")
	public String getById(@PathVariable int id) {
		return "car id is"+ id;
		
	}
	
	@GetMapping("/getcar")
	public String getcar(@RequestParam String name) {
		return "car is :"+name;
		
	}
}
