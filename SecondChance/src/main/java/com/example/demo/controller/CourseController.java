package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;

@RestController
@RequestMapping("/course")
public interface CourseController extends CRUDController <String,Course>{
	public CourseController() {
		Course ecommerce = new Course("IT3232","Practical for e commerce",2);
		Course webservice = new Course("IT2234","Web service and swerver Techonolgy",4);
		Course webapplication = new Course("CSC3132","WebService Apllication development",2);
		
		getMap().put(webapplication.getCode(),webapplication);
		getMap().put(webservice.getCode(),webservice);
		getMap().put(ecommerce.getCode(),ecommerce);
	}
}
