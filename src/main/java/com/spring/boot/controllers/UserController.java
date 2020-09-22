package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.UserConverter;
import com.spring.boot.dto.UserDto;
import com.spring.boot.services.UserService;

@RestController
@RequestMapping(value = "api/v2")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping(value = "/user")
	public ResponseEntity<Object> addUser(@RequestBody UserDto userDto) {
		userService.addUser(UserConverter.userDtoToUser(userDto));
		return new ResponseEntity<Object>("added successfully", HttpStatus.OK);

	}

	@GetMapping(value = "/user")
	public ResponseEntity<Object> findAll() {
		return new ResponseEntity<Object>(UserConverter.userToUserDto(userService.findAll()), HttpStatus.FOUND);
	}

	@GetMapping(value = "/user/{id}")
	public ResponseEntity<Object> getById(@PathVariable long id) {
		return new ResponseEntity<Object>(UserConverter.userToUserDto(userService.getById(id)), HttpStatus.FOUND);
	}

	@DeleteMapping(value = "/user/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable long id) {
		userService.deleteById(id);
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);

	}

	@PutMapping(value = "/user")
	public ResponseEntity<Object> updateById(@RequestBody UserDto userDto) {
		userService.updateById(UserConverter.userDtoToUser(userDto));
		return new ResponseEntity<Object>("updated Successfully", HttpStatus.ACCEPTED);

	}

}
