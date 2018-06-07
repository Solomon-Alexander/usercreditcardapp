package com.demo.usercreditcard.api.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.usercreditcard.api.dto.UserDto;
import com.demo.usercreditcard.api.entity.User;

@Component
public class UserEntityToDtoConverter implements Converter<User, UserDto> {

	@Override
	public UserDto convert(User entity) {

		UserDto userDto = new UserDto();
		userDto.setUserName(entity.getUserName());
		userDto.setFirstName(entity.getFirstName());
		userDto.setLastName(entity.getLastName());
		userDto.setPhone(entity.getPhone());
		userDto.setEmail(entity.getEmail());
		return userDto;
	}

}
