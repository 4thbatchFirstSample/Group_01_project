package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Submodule;

public interface SubmoduleService {

	public void Createproject(Submodule submodule);

	public List<Submodule> getAllList();

	public Submodule findById(Long id);

	public void deleteById(Long id);
	
	public List<Submodule> getAllSubmoduleByModuleId(Long id);
	public List<Submodule> getAllSubmoduleByUserId(Long id);
	

}
