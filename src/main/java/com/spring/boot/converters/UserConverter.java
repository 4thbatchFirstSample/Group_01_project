package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.UserDto;
import com.spring.boot.entities.User;

@Service
public class UserConverter {
	public static User userDtoToUser(UserDto userDto) {
		User user = new User();
		if (userDto != null) {
			user.setId(userDto.getId());
			user.setUserName(userDto.getUserName());
			user.setRole(userDto.getRole());
			return user;
		}
		return null;
	}

	public static List<UserDto> userToUserDto(List<User> userlist) {
		List<UserDto> listUserDto = new ArrayList<>();
		if (userlist != null) {
			for (User user : userlist) {
				UserDto userDto = new UserDto();
				userDto.setId(user.getId());
				userDto.setUserName(user.getUserName());
				userDto.setRole(user.getRole());

				listUserDto.add(userDto);
			}

			return listUserDto;
		}
		return null;
	}

	public static UserDto userToUserDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setUserName(user.getUserName());
		userDto.setRole(user.getRole());
		return userDto;
	}
}
