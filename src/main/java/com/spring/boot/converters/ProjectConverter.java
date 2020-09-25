package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ProjectDto;
import com.spring.boot.entities.Project;

@Service
public class ProjectConverter {
	public static Project projectDtoToProject(ProjectDto projectDto) {
		Project project = new Project();
		if (projectDto != null) {
			project.setId(projectDto.getId());
			project.setName(projectDto.getName());
			project.setDuration(projectDto.getDuration());
			project.setStatus(projectDto.getStatus());
			project.setProjectType(projectDto.getProjectType());
			project.setStartDate(projectDto.getStartDate());
			project.setEndDate(projectDto.getEndDate());

			return project;
		}
		return null;
	}

	public static List<ProjectDto> ProjectToProjectDto(List<Project> projectlist) {
		List<ProjectDto> listProjectDto = new ArrayList<>();
		if (projectlist != null) {
			for (Project project : projectlist) {
				ProjectDto projectDto = new ProjectDto();
				projectDto.setId(project.getId());
				projectDto.setName(project.getName());
				projectDto.setDuration(project.getDuration());
				projectDto.setStatus(project.getStatus());
				projectDto.setProjectType(project.getProjectType());
				projectDto.setStartDate(project.getStartDate());
				projectDto.setEndDate(project.getEndDate());

				listProjectDto.add(projectDto);
			}
			return listProjectDto;
		}
		return null;
	}

	public static ProjectDto ProjectToProjectDto(Project project) {
		ProjectDto projectDto = new ProjectDto();
		projectDto.setId(project.getId());
		projectDto.setName(project.getName());
		projectDto.setDuration(project.getDuration());
		projectDto.setStatus(project.getStatus());
		projectDto.setProjectType(project.getProjectType());
		projectDto.setStartDate(project.getStartDate());
		projectDto.setEndDate(project.getEndDate());

		return projectDto;
	}
}
