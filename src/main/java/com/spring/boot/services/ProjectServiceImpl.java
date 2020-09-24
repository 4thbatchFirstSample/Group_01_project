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
	public void addProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public List<Project> getAll() {
		return projectRepository.findAll();
	}

	@Override
	public Project getById(Long id) {
		return projectRepository.getOne(id);
	}

	@Override
	public void updateById(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void deleteById(Long id) {
		projectRepository.deleteById(id);
	}
}
