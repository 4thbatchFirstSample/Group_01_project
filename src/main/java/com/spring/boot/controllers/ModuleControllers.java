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
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.ModuleConverter;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.Module;
import com.spring.boot.services.ModuleService;

@RestController
public class ModuleControllers {

	@Autowired
	private ModuleService moduleService;
	
	@PostMapping(value="/module")
	public ResponseEntity<Object> addModule(@RequestBody Module module){
		moduleService.addModule(module);
		return new ResponseEntity<Object>("Added successfully", HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/module")
	public ResponseEntity<Object> getAllModule(){
		return new ResponseEntity<Object>(moduleService.findAll(), HttpStatus.OK);
		}
	@GetMapping(value="/module/{id}")
	public ResponseEntity<Object> getByIdModule(@PathVariable Long id){
		return new ResponseEntity<Object>(moduleService.findById(id), HttpStatus.FOUND);
		
	}
	@DeleteMapping(value="/module/{id}")
	public ResponseEntity<Object> deleteModule(@PathVariable Long id){
		moduleService.deleteById(id);
		return new ResponseEntity<Object>("Deleted Module Successfully", HttpStatus.OK);	
	}
	@PutMapping(value="/module")
	public ResponseEntity<Object> updateModule(@RequestBody Module moduleDto){
		moduleService.updateModule(moduleDto);
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.ACCEPTED);
		}
	}
