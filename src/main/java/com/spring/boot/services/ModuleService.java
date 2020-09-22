package com.spring.boot.services;

import java.util.List;
import com.spring.boot.entities.Module;

public interface ModuleService  {
	
	public void addModule(Module module);
	public List<Module> findAll();
	public Module findById(Long id);
	public void deleteById(Long id);
	public void updateModule(Module module);
}
