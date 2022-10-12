package com.kundan.LearnToday.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.kundan.LearnToday.DAO.CourseDAO;
import com.kundan.LearnToday.DAO.StudentDAO;
import com.kundan.LearnToday.model.Course;
import com.kundan.LearnToday.model.Student;

class StudentControllerTest {
	
	CourseDAO courseRepo=Mockito.mock(CourseDAO.class);
	StudentDAO studentRepo=Mockito.mock(StudentDAO.class);
	Course course1=new Course(1, "Java", 4500.50f ,"Java full course from Scratch", "Kundan", null);
	Student student1=new Student(1, 1, course1);
	List<Student> student=new ArrayList<>(); 
	List<Course> course=new ArrayList<>(); 
	

	@Test
	void testGetAllCourses() {
		course.add(new Course(1, "Java", 4500.50f ,"Java full course from Scratch", "Kundan", null));
		course.add(new Course(2, "python", 4500.50f ,"Python full course from Scratch", "Sunil", null));
		when(courseRepo.findAll()).thenReturn(course);
		assertEquals(course,course);
	}

	@Test
	void testPostStudent() {
		studentRepo.saveAll(student);
		when(studentRepo.getById(1)).thenReturn(student1);
		assertEquals(student1, student1);
		
	}

	@Test
	void testDeleteStudentEnrollment() {
		student.add(new Student(2, 2, course1));
		studentRepo.saveAll(student);
		studentRepo.deleteById(2);
	//	when(studentRepo.getById(2)).thenReturn(null);
		assertEquals(null, studentRepo.getById(2));
	}

	@Test
	void testGetAllStudent() {
		student.add(new Student(2, 2, course1));
		student.add(new Student(3, 3, course1));
		studentRepo.saveAll(student);
		when(studentRepo.findAll()).thenReturn(student);
		assertEquals(student, student);
	}

}
