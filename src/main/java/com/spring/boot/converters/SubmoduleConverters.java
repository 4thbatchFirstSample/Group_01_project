package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.SubmoduleDto;
import com.spring.boot.entities.Submodule;

@Service
public class SubmoduleConverters {
	// SubmoduleDto to Submodule Entity Converter
	public static Submodule SubmoduleDtoToSubmodule(SubmoduleDto submoduleDto) {
		Submodule submodule = new Submodule();
		if (submoduleDto != null) {
			submodule.setId(submoduleDto.getId());
			submodule.setModuleId(submoduleDto.getModuleId());
			submodule.setName(submoduleDto.getName());
			submodule.setUserId(submoduleDto.getUserId());
			return submodule;
		}
		return null;

	}

	// Submodule to SubmoduleDto list Converter
	public static List<SubmoduleDto> submoduleToSubmoduleDto(List<Submodule> submodulelist) {
		List<SubmoduleDto> listSubmoduleDto = new ArrayList<>();
		if (submodulelist != null) {
			for (Submodule submodule : submodulelist) {
				SubmoduleDto submoduleDto = new SubmoduleDto();
				submoduleDto.setId(submodule.getId());
				submoduleDto.setModuleId(submodule.getModuleId());
				submoduleDto.setName(submodule.getName());
				submoduleDto.setUserId(submodule.getUserId());

				listSubmoduleDto.add(submoduleDto);
			}

			return listSubmoduleDto;
		}
		return null;
	}

	public static SubmoduleDto submoduleToSubmoduleDto(Submodule submodule) {
		SubmoduleDto submoduleDto = new SubmoduleDto();
		if (submodule != null) {
			submoduleDto.setId(submodule.getId());
			submoduleDto.setModuleId(submodule.getModuleId());
			submoduleDto.setName(submodule.getName());
			submoduleDto.setUserId(submodule.getUserId());
			return submoduleDto;
		}
		return null;
	}
}
