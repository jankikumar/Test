package com.school.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.Student;

@RestController
public class SchoolCotroller {

	@GetMapping("/register")
	public Student registerStudent() {
		Student s = new Student();
		s.setName("Kumar Vikram");
		s.setRoll(101);
		s.setEmail("vikram@gmail.com");
		return s;
	}

}
