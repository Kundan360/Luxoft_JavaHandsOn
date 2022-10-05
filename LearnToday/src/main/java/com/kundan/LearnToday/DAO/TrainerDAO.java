package com.kundan.LearnToday.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kundan.LearnToday.model.Trainer;

public interface TrainerDAO extends JpaRepository<Trainer, Integer> {
	
	

}
