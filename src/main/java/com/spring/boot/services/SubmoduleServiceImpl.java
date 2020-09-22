package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Submodule;
import com.spring.boot.repositories.SubmoduleRepository;

@Service
public class SubmoduleServiceImpl implements SubmoduleService {
	@Autowired
	private SubmoduleRepository submoduleRepository;

	@Override
	public void Createproject(Submodule submodule) {
		submoduleRepository.save(submodule);
	}

	@Override
	public List<Submodule> getAllList() {
		return submoduleRepository.findAll();
	}

	@Override
	public Submodule findById(Long id) {
		return submoduleRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		submoduleRepository.deleteById(id);
	}

	@Override
	public List<Submodule> getAllSubmoduleByModuleId(Long id) {
		return submoduleRepository.findByModuleId(id);
		
	}

	@Override
	public List<Submodule> getAllSubmoduleByUserId(Long id) {
		return  submoduleRepository.findByUserId(id);
		
	}

}
