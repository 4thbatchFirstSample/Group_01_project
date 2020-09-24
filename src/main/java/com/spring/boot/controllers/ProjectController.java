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

import com.spring.boot.converters.ProjectConverter;
import com.spring.boot.dto.ProjectDto;
import com.spring.boot.services.ProjectService;

@RestController
@RequestMapping(value = "api/v2")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@PostMapping(value = "/project")
	public ResponseEntity<Object> addData(@RequestBody ProjectDto projectDto) {
		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("added successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/project")
	public ResponseEntity<Object> listdata() {
		return new ResponseEntity<Object>(ProjectConverter.ProjectToProjectDto(projectService.getAll()), HttpStatus.OK);
	}

	@GetMapping(value = "/project/{id}")
	public ResponseEntity<Object> getbyid(@PathVariable Long id) {
		return new ResponseEntity<Object>(ProjectConverter.ProjectToProjectDto(projectService.getById(id)),
				HttpStatus.FOUND);
	}

	@DeleteMapping(value = "/project/{id}")
	public ResponseEntity<Object> deletebyid(@PathVariable Long id) {
		projectService.deleteById(id);
		return new ResponseEntity<Object>("deleted successfully", HttpStatus.OK);
	}

	@PutMapping(value = "/project")
	public ResponseEntity<Object> updateid(@RequestBody ProjectDto projectDto) {
		projectService.updateById(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("updated Successfully", HttpStatus.CREATED);
	}
}
