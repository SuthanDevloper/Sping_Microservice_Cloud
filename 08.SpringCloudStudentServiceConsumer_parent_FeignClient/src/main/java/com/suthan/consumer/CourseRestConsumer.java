package com.suthan.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.suthan.model.Course;

@FeignClient(name="COURSE-SERVICE")
public interface CourseRestConsumer {
	
	@GetMapping("/course/data")
	public String getData();
	
	@GetMapping("/all")
	public List<Course> getAllCourse();
}
