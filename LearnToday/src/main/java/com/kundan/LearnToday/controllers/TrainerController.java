package com.kundan.LearnToday.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kundan.LearnToday.DAO.TrainerDAO;
import com.kundan.LearnToday.exceptions.DataNotFoundException;
import com.kundan.LearnToday.model.Trainer;

@RestController
@RequestMapping("/api")
public class TrainerController {
    
	@Autowired
	TrainerDAO trainerRepo;
	
	@PostMapping("/Trainer")
	public ResponseEntity<Trainer> trainerSignUp(@RequestBody Trainer trainer)
	{
		 trainerRepo.save(trainer);
		 return ResponseEntity.status(HttpStatus.CREATED).body(trainer);
		
	}
	
	@PutMapping("/Trainer/{id}")
	public ResponseEntity<String> updatePassword (@PathVariable Integer id, @RequestBody String password)
	{
		Trainer trainer=new Trainer();
		if(trainerRepo.existsById(id))
		{
			trainer.setTrainerId(id);
		    trainer.setPassword(password);
		    trainerRepo.save(trainer);
		    return ResponseEntity.status(HttpStatus.OK).body("Password updated successfully");
		}	
		throw new DataNotFoundException("Searched data not found");
		
	}
}
