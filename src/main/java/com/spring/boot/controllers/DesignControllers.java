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

import com.spring.boot.converters.DesignConverter;
import com.spring.boot.dto.DesignDto;

import com.spring.boot.services.DesignService;

@RestController
@RequestMapping(value = "api/v2")
public class DesignControllers {
	@Autowired
	private DesignService designService;

	@PostMapping(value = "/project")
	public ResponseEntity<Object>addData(@RequestBody DesignDto designDto) {
		designService.save(DesignConverter.designDtoToDesign(designDto));
		return new ResponseEntity<Object>("added successfully", HttpStatus.CREATED);

	}

	@GetMapping(value = "/project")
	public ResponseEntity<Object>listdata(){
		designService.listData();
		return new ResponseEntity<Object>(designService.listData(),HttpStatus.OK) ;
	
		

	}

	@GetMapping(value = "/project/{id}")
	public ResponseEntity<Object>getbyid(@PathVariable long id){
		designService.Getbyid(id);
		return new ResponseEntity<Object>(designService.Getbyid(id),HttpStatus.FOUND);
		
	}
	   

	@DeleteMapping(value = "/project/{id}")
	public ResponseEntity<Object> deletebyid(@PathVariable long id) {
		designService.delete(id);
		return new ResponseEntity<Object>("deleted successfully",HttpStatus.OK);

	}
	

	@PutMapping(value = "/project")
	public ResponseEntity<Object>updateid(@RequestBody DesignDto designDto) {
		designService.update(DesignConverter.designDtoToDesign(designDto));
		return new ResponseEntity<Object>( "updated Successfully", HttpStatus.CREATED);
	}
	
}

