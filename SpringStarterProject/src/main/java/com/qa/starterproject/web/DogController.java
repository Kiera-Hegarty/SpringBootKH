package com.qa.starterproject.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.starterproject.domain.Dog;
import com.qa.starterproject.service.DogService;

@RestController
public class DogController {
//
//	@GetMapping("/helloWorld") // THIS IS AN ENDPOINT!
//	public String hello() {
//		return "Hello world!";
//	}

	
	private DogService service;
	
	@Autowired
	public DogController(DogService service) {
		super();
		this.service=service;
	}
	
	@PostMapping("/create")
	
	public ResponseEntity<Dog> createDog(@RequestBody Dog d){
		Dog created = this.service.createDog(d);
		ResponseEntity<Dog> response = new ResponseEntity<Dog>(created, HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Dog>> getAllDoggo(){
		return ResponseEntity.ok(this.service.getAllDoggo()); //200 - ok
	}
	
	@GetMapping("/get/{id}") //200 - ok
	public Dog getDog(@PathVariable Integer id) {
		return this.service.getDog(id);
	}
	
	@PutMapping("/replace/{id}") //202 accepted
	public ResponseEntity<Dog> replaceDog(@PathVariable Integer id, @RequestBody Dog newDog){
		Dog body = this.service.replaceDog(id, newDog);
		ResponseEntity<Dog> response = new ResponseEntity<Dog>(body, HttpStatus.ACCEPTED);
		return response;
	}
	
	@DeleteMapping("/remove/{id}") //204 no content
	public ResponseEntity<?> removeDog(@PathVariable Integer id){
		this.service.removeDog(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
