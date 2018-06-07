package com.demo.usercreditcard.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.demo.usercreditcard.api.entity.User;
import com.demo.usercreditcard.api.repository.UserRepository;

@RestController
@RequestMapping("/api/ang/")
@CrossOrigin(origins = "http://localhost:4201", allowedHeaders = "*")
public class UserAngularController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public ResponseEntity<?> findAllUserNames() {
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
	}

	

}
