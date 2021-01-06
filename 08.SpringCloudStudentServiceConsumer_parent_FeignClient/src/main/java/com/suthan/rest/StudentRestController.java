package com.suthan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suthan.consumer.CourseRestConsumer;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private CourseRestConsumer consumer;
	
	@GetMapping("/info")
	public String getInfo() {
		
		return "From student ===> ..."+consumer.getData();
	}
	
	@GetMapping("/all")
	public String getCourseInfo(){
		
		return "From student ===> ..."+consumer.getAllCourse();
	}
}


