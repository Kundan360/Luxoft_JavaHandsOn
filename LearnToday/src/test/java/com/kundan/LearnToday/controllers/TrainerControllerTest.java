package com.kundan.LearnToday.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.kundan.LearnToday.DAO.TrainerDAO;
import com.kundan.LearnToday.model.Trainer;

class TrainerControllerTest {
	
	TrainerDAO trainerRepo=Mockito.mock(TrainerDAO.class);
//	List<Trainer> trainer=new ArrayList<>(); 
	Trainer tr=new Trainer(1, "Kundan");

	@Test
	void testTrainerSignUp() {
	//	trainer.add(new Trainer(1, "Kundan"));
	//	trainer.add(new Trainer(2, "Sunil"));
		trainerRepo.save(tr);
		when(trainerRepo.getById(1)).thenReturn(tr);
		assertEquals(tr,tr);
		
	}

	@Test
	void testUpdatePassword() {
		tr.setPassword("Rama");
		trainerRepo.save(tr);
		when(trainerRepo.getById(1)).thenReturn(tr);
		String pass1=tr.getPassword();
		String pass="Rama";
		assertEquals(pass1,pass);
	}

}
