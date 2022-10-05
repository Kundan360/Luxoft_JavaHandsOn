package com.kundan.LearnToday.service;

import org.springframework.stereotype.Component;



@Component
public class StudentService {

	 Integer studentId;
	 Integer enrollmentId;
	 Integer courseId;
	
	
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
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentService(Integer studentId, Integer enrollmentId, Integer courseId) {
		super();
		this.studentId = studentId;
		this.enrollmentId = enrollmentId;
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "StudentService [studentId=" + studentId + ", enrollmentId=" + enrollmentId + ", courseId=" + courseId
				+ "]";
	}
	
	
}
