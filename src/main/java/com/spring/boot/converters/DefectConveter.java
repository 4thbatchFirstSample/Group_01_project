package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;
//import com.spring.boot.entities.Project;have to change

@Service
public class DefectConveter {
	public static Defect defectDtoToDefect(DefectDto defectDto) {
		Defect defect = new Defect();
		// Project subModule =new Project();//have to change
		if (defectDto != null) {
			defect.setId(defectDto.getId());
			defect.setName(defectDto.getName());
			defect.setCreatDate(defectDto.getCreatDate());
			defect.setEnteredDate(defectDto.getEnteredDate());
			defect.setUpdatedDate(defectDto.getUpdatedDate());
			defect.setDescription(defectDto.getDescription());
			defect.setStatus(defectDto.getStatus());
			defect.setCommand(defectDto.getCommand());
			defect.setSeverity(defectDto.getSeverity());
			defect.setPriority(defectDto.getPriority());
			defect.setAssignTo(defectDto.getAssignTo());
			defect.setSupModuleId(defectDto.getSubModuleId());
			return defect;
		}
		return null;
	}

	public static List<DefectDto> defectToDefectDto(List<Defect> defectList) {
		List<DefectDto> defectDtoList = new ArrayList<>();
		if (defectList != null) {
			for (Defect defect : defectList) {
				DefectDto defectDto = new DefectDto();
				defectDto.setId(defect.getId());
				defectDto.setName(defect.getName());
				defectDto.setCreatDate(defect.getCreatDate());
				defectDto.setEnteredDate(defect.getEnteredDate());
				defectDto.setUpdatedDate(defect.getUpdatedDate());
				defectDto.setDescription(defect.getDescription());
				defectDto.setStatus(defect.getStatus());
				defectDto.setCommand(defect.getCommand());
				defectDto.setSeverity(defect.getSeverity());
				defectDto.setPriority(defect.getPriority());
				defectDto.setAssignTo(defect.getAssignTo());
				defectDto.setSubModuleId(defect.getSupModuleId());
			}
			return defectDtoList;
		}
		return null;

	}
}
