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

import com.spring.boot.converters.DefectConveter;
import com.spring.boot.dto.DefectDto;
import com.spring.boot.services.DefectServices;

@RestController
@RequestMapping("/api/v2")
public class DefectController {
	@Autowired
	private DefectServices defectServices;

	@PostMapping(value = "/defect")
	public ResponseEntity<Object> creatDefect(@RequestBody DefectDto defectDto) {
		defectServices.addDefect(DefectConveter.defectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/defect")
	public ResponseEntity<Object> getDefect() {
		return new ResponseEntity<Object>(DefectConveter.defectToDefectDto(defectServices.getDefect()), HttpStatus.OK);
	}

	@GetMapping(value = "/defect/{id}")
	public ResponseEntity<Object> getByIdDefec(@PathVariable Long id) {
		return new ResponseEntity<Object>(DefectConveter.defectToDefectDtoId(defectServices.getByIdDefect(id)),
				HttpStatus.FOUND);
	}

	@DeleteMapping(value = "/defect/{id}")
	public ResponseEntity<Object> deleteDefect(@PathVariable Long id) {
		defectServices.deleteById(id);
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
	}

	@PutMapping(value = "/defect")
	public ResponseEntity<Object> updeteByidDefect(@RequestBody DefectDto defectDto) {
		defectServices.updateDefect(DefectConveter.defectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/defect/submoduleId/{id}")
	public List<DefectDto> getBySubModuleId(@PathVariable Long id) {
		return DefectConveter.defectToDefectDto(defectServices.getAllBySubModuleId(id));
	}
}
