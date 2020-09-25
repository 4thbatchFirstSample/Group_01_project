package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.SubmoduleDto;
import com.spring.boot.entities.Submodule;
import com.spring.boot.entities.User;
import com.spring.boot.entities.Module;

@Service
public class SubmoduleConverters {
	// SubmoduleDto to Submodule Entity Converter
	public static Submodule SubmoduleDtoToSubmodule(SubmoduleDto submoduleDto) {
		Submodule submodule = new Submodule();
		Module module = new Module();

		if (submoduleDto != null) {
			submodule.setId(submoduleDto.getId());
			submodule.setName(submoduleDto.getName());
			module.setId(submoduleDto.getModuleId());
			submodule.setModule(module);
			List<User> userList = new ArrayList<>();
			for (Long userId : submoduleDto.getUserId()) {
			     User user = new User();
				user.setId(userId);
				userList.add(user);
			}
			submodule.setUsers(userList);
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
				List<Long>userIdList = new ArrayList<>();
				submoduleDto.setId(submodule.getId());
				submoduleDto.setModuleId(submodule.getModule().getId());
				submoduleDto.setName(submodule.getName());
            for (User user :submodule.getUsers()) {
            	userIdList.add(user.getId());
            	submoduleDto.setUserId(userIdList);
            }
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
			submoduleDto.setModuleId(submodule.getModule().getId());
			submoduleDto.setName(submodule.getName());
			List<Long>userIdList = new ArrayList<>();
			for (User user :submodule.getUsers()) {
            	userIdList.add(user.getId());
            	submoduleDto.setUserId(userIdList);
            }
            
			return submoduleDto;
		}
		return null;
	}
}
