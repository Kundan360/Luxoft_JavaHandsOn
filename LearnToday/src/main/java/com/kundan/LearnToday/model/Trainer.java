package com.kundan.LearnToday.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
  
  @Id
  private Integer trainerId;
  private String password;
public Integer getTrainerId() {
	return trainerId;
}
public void setTrainerId(Integer trainerId) {
	this.trainerId = trainerId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}
public Trainer(Integer trainerId, String password) {
	super();
	this.trainerId = trainerId;
	this.password = password;
}
@Override
public String toString() {
	return "Title [trainerId=" + trainerId + ", password=" + password + "]";
}

  
}
