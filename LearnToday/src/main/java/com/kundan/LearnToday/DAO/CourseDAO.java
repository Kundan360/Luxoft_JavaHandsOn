package com.kundan.LearnToday.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kundan.LearnToday.model.Course;

public interface CourseDAO extends JpaRepository<Course, Integer> {

	
    
	List<Course> findByOrderByStartDateAsc();

}
