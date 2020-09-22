package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Module;
import com.spring.boot.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {
	@Autowired
	private ModuleRepository moduleRepository;
	
	@Override
	public void addModule(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public List<Module> findAll() {
		return moduleRepository.findAll();
	}

	@Override
	public Module findById(Long id) {
		return moduleRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		moduleRepository.deleteById(id);
	}

	@Override
	public void updateModule(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public List<Module> getAllModuleByProjectId(Long projectId) {
		return moduleRepository.findByProjectId(projectId);
	}
	
}

