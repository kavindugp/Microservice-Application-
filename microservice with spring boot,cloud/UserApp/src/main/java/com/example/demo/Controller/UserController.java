package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.UserRepository;
import com.example.demo.model.User;

@RestController
public class UserController {


	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userRepository.save(user),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/user")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getCourse(@PathVariable int id) {
		return userRepository.findById(id);
	}
}
