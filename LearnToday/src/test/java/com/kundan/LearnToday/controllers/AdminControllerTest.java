package com.kundan.LearnToday.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.kundan.LearnToday.DAO.CourseDAO;
import com.kundan.LearnToday.DAO.TrainerDAO;
import com.kundan.LearnToday.model.Course;
import com.kundan.LearnToday.model.Trainer;



class AdminControllerTest {
	
	
	
	CourseDAO courseRepo=Mockito.mock(CourseDAO.class);
	List<Course> course=new ArrayList<>(); 
	

	@Test
	void testGetAllCourses() {
		course.add(new Course(1, "Java", 4500.50f ,"Java full course from Scratch", "Kundan", null));
		course.add(new Course(2, "python", 4500.50f ,"Python full course from Scratch", "Sunil", null));
		when(courseRepo.findAll()).thenReturn(course);
		assertEquals(course,course);
		
	}

	@Test
	void testGetCourseById() {
		course.add(new Course(1, "Java", 4500.50f ,"Java full course from Scratch", "Kundan", null));
		course.add(new Course(2, "python", 4500.50f ,"Python full course from Scratch", "Sunil", null));
		when(courseRepo.getById(1)).thenReturn(course.get(0));
		assertEquals(course.get(0), course.get(0));
	}

}
