package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Submodule;
import com.spring.boot.repositories.SubmoduleRepository;

@Service
public class SubmoduleServiceImpl implements SubmoduleService{
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
	public Optional<Submodule> findById(Long id) {
	return	submoduleRepository.findById(id);
		
	}

	@Override
	public void deleteById(Long id) {
		submoduleRepository.deleteById(id);
		
	}
	

}
