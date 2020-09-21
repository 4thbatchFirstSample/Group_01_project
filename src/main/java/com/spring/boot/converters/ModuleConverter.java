package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.Module;

@Service
public class ModuleConverter {
	public static Module moduleDtotoModule(ModuleDto moduleDto) {
		Module module = new Module();
		if (moduleDto != null) {
			module.setId(moduleDto.getId());
			module.setName(moduleDto.getName());
			return module;

		}
		return null;
	}

	public static List<ModuleDto> moduleToModuleDto(List<Module> moduleList) {
		List<ModuleDto> listModuleDto = new ArrayList<>();
		if (moduleList != null) {
			for (Module module : moduleList) {
				ModuleDto moduleDto = new ModuleDto();
				moduleDto.setId(module.getId());
				moduleDto.setName(module.getName());

				listModuleDto.add(moduleDto);
			}
			return listModuleDto;
		}
		return null;
	}

	public static ModuleDto moduleToModuleDto(Module module) {
		ModuleDto moduleDto = new ModuleDto();
		moduleDto.setId(module.getId());
		moduleDto.setName(module.getName());
		return moduleDto;
	}
}
