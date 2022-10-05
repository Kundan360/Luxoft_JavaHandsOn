package com.kundan.LearnToday.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kundan.LearnToday.DAO.CourseDAO;
import com.kundan.LearnToday.exceptions.DataNotFoundException;
import com.kundan.LearnToday.model.Course;

@RestController
@RequestMapping("/api")
public class AdminController {
	
	@Autowired
	CourseDAO courseRepo;
	
	@GetMapping("/admin")
	public List<Course> getAllCourses()
	{
		return courseRepo.findAll();
	}
	
	@GetMapping("/admin/{id}")
	public Optional<Course> getCourseById(@PathVariable Integer id)
	{
		 
		Optional<Course> course=courseRepo.findById(id);
		if(courseRepo.existsById(id))
			return course;
		
			throw new DataNotFoundException("Searched Data not found");
			
			


	}

}
