package com.suthan.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suthan.model.Course;

@RestController
@RequestMapping("/course")
public class CourseRestController {
	
	@GetMapping("/data")
	public String  getCourseData() {
		return "From course";
		
	}
	
	@GetMapping("/all")
	public List<Course> getAllCourse(){
		return List.of(
				new Course( 100,"java",1000.00),
				new Course( 101,"python",1000.00),
				new Course( 101,"ReacjS",1000.00));
		
	}

}
