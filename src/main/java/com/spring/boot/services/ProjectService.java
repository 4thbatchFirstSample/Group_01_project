package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Project;

public interface ProjectService {
	public void save(Project project);

	List<Project> listData();

	public Project Getbyid(long id);

	void update(Project design);

	void delete(long id);

}
