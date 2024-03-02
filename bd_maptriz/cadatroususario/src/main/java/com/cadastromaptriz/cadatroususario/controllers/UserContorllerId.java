package com.cadastromaptriz.cadatroususario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cadastromaptriz.cadatroususario.entities.User;
import com.cadastromaptriz.cadatroususario.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserContorllerId {

	@Autowired
	private UserRepository repository;
	
	@DeleteMapping("/users/{id}") 
	public ResponseEntity<User> deleteUser(@PathVariable Long id) {
		    repository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
