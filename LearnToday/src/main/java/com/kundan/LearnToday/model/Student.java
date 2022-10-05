package com.kundan.LearnToday.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Student {
    
	@Id
	private Integer studentId;
	private Integer enrollmentId;
            
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "courseId")
	private Course course;

   
	
	

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Student(Integer studentId, Integer enrollmentId, Course course) {
		super();
		this.studentId = studentId;
		this.enrollmentId = enrollmentId;
		this.course=course;
	}
	
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", enrollmentId=" + enrollmentId + ", course="
				+ course + "]";
	}

	
	

	

}
	