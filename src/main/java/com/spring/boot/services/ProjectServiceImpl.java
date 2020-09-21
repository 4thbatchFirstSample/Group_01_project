package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Project;
import com.spring.boot.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void save(Project project) {
		projectRepository.save(project);

	}

	@Override
	public List<Project> listData() {
		return projectRepository.findAll();
	}

	@Override
	public Project Getbyid(long id) {
		return projectRepository.findById(id).get();
	}

	@Override
	public void update(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void delete(long id) {
		projectRepository.deleteById(id);

	}
}
