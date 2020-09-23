package com.spring.boot.controllers;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.SubmoduleConverters;
import com.spring.boot.dto.SubmoduleDto;
import com.spring.boot.services.SubmoduleService;

@RestController
@RequestMapping(value = "api/V2")
public class SubmoduleController {

	@Autowired
	private SubmoduleService submoduleService;

	@PostMapping(value = "/submodule")
	public ResponseEntity<Object> addSubmodule1(@RequestBody SubmoduleDto submoduleDto) {
		submoduleService.createProject(SubmoduleConverters.SubmoduleDtoToSubmodule(submoduleDto));
		return new ResponseEntity<Object>("Added successfully", HttpStatus.OK);
	}

	@GetMapping(value = "/submodule")
	public ResponseEntity<Object> getAll() {
		return new ResponseEntity<Object>(SubmoduleConverters.submoduleToSubmoduleDto(submoduleService.getAllList()),
				HttpStatus.OK);
	}

	@GetMapping(value = "/submodule/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id) {
		return new ResponseEntity<Object>(SubmoduleConverters.submoduleToSubmoduleDto(submoduleService.findById(id)),
				HttpStatus.OK);
	}

	@DeleteMapping(value = "/submodule/{id}")
	public ResponseEntity<Object> Deleteproject(@PathVariable Long id) {
		submoduleService.deleteById(id);
		return new ResponseEntity<Object>("Deleted Susseccfully", HttpStatus.OK);
	}

	@PutMapping(value = "/submodule")
	public ResponseEntity<Object> addSubmodule(@RequestBody SubmoduleDto submoduleDto) {
		submoduleService.createProject(SubmoduleConverters.SubmoduleDtoToSubmodule(submoduleDto));
		return new ResponseEntity<>("Updated", HttpStatus.CREATED);
	}

	@GetMapping(value = "/submodule/module-id/{id}")
	public List<SubmoduleDto> getByModuleId(@PathVariable Long id) {
		return SubmoduleConverters.submoduleToSubmoduleDto(submoduleService.getAllSubmoduleByModuleId(id));
	}
}