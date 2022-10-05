package com.kundan.LearnToday.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kundan.LearnToday.DAO.CourseDAO;
import com.kundan.LearnToday.DAO.StudentDAO;
import com.kundan.LearnToday.exceptions.DataNotSavedexception;
import com.kundan.LearnToday.model.Course;
import com.kundan.LearnToday.model.Student;
import com.kundan.LearnToday.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	
	@Autowired
	CourseDAO courseRepo;
	
	@Autowired
	StudentDAO studentRepo;
	
	@GetMapping("/Student")
	public List<Course> getAllCourses()
	{
		return courseRepo.findByOrderByStartDateAsc();
	}
	
	@PostMapping("/Student")
    public ResponseEntity<Student> postStudent(@RequestBody StudentService stud) 
    {
		
			
		if(courseRepo.existsById(stud.getCourseId()))
		{
		@SuppressWarnings("deprecation")
		Course cr=courseRepo.getById(stud.getCourseId());
		Student st=new Student();
		st.setStudentId(stud.getStudentId());
		st.setEnrollmentId(stud.getEnrollmentId());
		st.setCourse(cr);
		studentRepo.save(st);
		return ResponseEntity.status(HttpStatus.CREATED).body(st);
		}
		
		else {
		
			throw new DataNotSavedexception("Course id not exist");
		}
		
    	
    }
	
	
	@DeleteMapping("/Student/{enrollmentId}")
	public ResponseEntity<String> deleteStudentEnrollment(@PathVariable Integer enrollmentId)
	{
		if(studentRepo.existsByEnrollmentId(enrollmentId))
		{
			studentRepo.deleteByEnrollmentId(enrollmentId);
			
		
			return ResponseEntity.status(HttpStatus.OK).body("Student enrollment deleted");
		}
		else
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("enrollment id not found");
	}
	

	@GetMapping("/allStudent")
	public List<Student> getAllStudent()
	{
		return studentRepo.findAll();
	}
}
