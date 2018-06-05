package com.demo.usercreditcard.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.demo.usercreditcard.api.entity.UserCreditCard;
import com.demo.usercreditcard.api.repository.UserCreditCardRepository;

@RestController
@RequestMapping("/api/ang/")
@CrossOrigin(origins = "http://localhost:4201", allowedHeaders = "*")
public class CreditCardAngularController {

	@Autowired
	private UserCreditCardRepository userCreditCardRepository;

	@GetMapping("/usercreditcard/{id}")
	public ResponseEntity<?> getCreditCardsById(@PathVariable Long id) {

		return new ResponseEntity<>(userCreditCardRepository.findOne(id), HttpStatus.OK);
	}

	@PostMapping("/usercreditcard")
	public ResponseEntity<?> saveUserCreditCard(@RequestBody UserCreditCard request) {

		return new ResponseEntity<>(userCreditCardRepository.save(request), HttpStatus.CREATED);
	}

	@GetMapping("/usercreditcards")
	public ResponseEntity<?> findAllCreditCards() {
		return new ResponseEntity<>(userCreditCardRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping("/usercreditcard/user/{userID}")
	public ResponseEntity<?> getAllCreditCardsByUser(@PathVariable Long userID) {

		return new ResponseEntity<>(userCreditCardRepository.findCreditCardsByUserID(userID),
				HttpStatus.OK);
	}

	@PutMapping("/usercreditcard/{id}")
	public ResponseEntity<?> updateCreditCards(@RequestBody UserCreditCard request, BindingResult result) {

		UserCreditCard update = userCreditCardRepository.saveAndFlush(request);

		return new ResponseEntity<>(update, HttpStatus.OK);
	}

	@DeleteMapping("/usercreditcard/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		userCreditCardRepository.delete(id);
	}

}
