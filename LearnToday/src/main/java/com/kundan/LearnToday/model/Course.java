package com.kundan.LearnToday.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Course {
	@Id
	private Integer courseId;
	
	
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private Float fees;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private String trainer;
	@Column(nullable = false)
	private Date startDate;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "course")
	List<Student> student=new ArrayList<>();
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getFees() {
		return fees;
	}
	public void setFees(Float fees) {
		this.fees = fees;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Integer courseId, String title, Float fees, String description, String trainer, Date startDate) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.fees = fees;
		this.description = description;
		this.trainer = trainer;
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", fees=" + fees + ", description=" + description
				+ ", trainer=" + trainer + ", startDate=" + startDate + "]";
	}
	
	

}
