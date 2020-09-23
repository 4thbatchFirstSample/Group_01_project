package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;
import com.spring.boot.entities.Submodule;

@Service
public class DefectConveter {
	public static Defect defectDtoToDefect(DefectDto defectDto) {
		Defect defect = new Defect();
		Submodule subModule = new Submodule();
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
			subModule.setId(defectDto.getSubModuleId());
			defect.setSubModule(subModule);

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
				defectDto.setSubModuleId(defect.getSubModule().getId());

				defectDtoList.add(defectDto);
			}
			return defectDtoList;
		}
		return null;
	}

	public static DefectDto defectToDefectDtoId(Defect defect) {
		DefectDto defectDto = new DefectDto();
		if (defect != null) {
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
			defectDto.setSubModuleId(defect.getSubModule().getId());
			return defectDto;
		}
		return null;
	}
}
