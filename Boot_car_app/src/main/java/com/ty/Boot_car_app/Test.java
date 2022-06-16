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
public class Test {
	@GetMapping("/eat")
	public String eat() {
		return "eatting pizza";
	}

	@GetMapping("/drink")
	public String drink() {
		return "drinking coke";
	}

	@GetMapping("/student")
	public Student getStudent() {
		Student s = new Student();
		s.setId(1);
		s.setName("Mohaseen");
		s.setPer(52.5);
		return s;
	}

	@GetMapping("/student/{id}")
	public String studentById(@PathVariable int id) {
		return "Id is:" + id;

	}

	@GetMapping("/aunty")
	public String anutyId(@RequestParam int id) {
		return "aunty id" + id;

	}

	@PostMapping("/savw")

	public String recieve(@RequestBody Student s) {
		return "ID: is " + s.getId();
	}

	@GetMapping("/all")
	public List<Student> getAllStudent() {
		List<Student> al = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Mohaseen");
		s1.setPer(71.04);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("askhuu");
		s2.setPer(71);

		al.add(s1);
		al.add(s2);
		return al;

	}
}
