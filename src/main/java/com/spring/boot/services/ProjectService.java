package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Project;

public interface ProjectService {
	public void addProject(Project project);

	List<Project> getAll();

	public Project getById(Long id);

	void updateById(Project design);

	void deleteById(Long id);
}
