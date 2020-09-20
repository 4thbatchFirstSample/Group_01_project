package com.spring.boot.services;

import java.util.List;
import java.util.Optional;


import com.spring.boot.entities.Submodule;

public interface SubmoduleService {
	

	public void Createproject(Submodule submodule);
	
	public List<Submodule> getAllList();
	public Optional<Submodule> findById(Long id);
	public void deleteById(Long id);
	 
}
