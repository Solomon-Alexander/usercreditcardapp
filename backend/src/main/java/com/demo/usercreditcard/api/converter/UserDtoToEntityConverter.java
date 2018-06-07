package com.demo.usercreditcard.api.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.usercreditcard.api.dto.UserDto;
import com.demo.usercreditcard.api.entity.User;

@Component
public class UserDtoToEntityConverter implements Converter<UserDto, User> {

	@Override
	public User convert(UserDto userDto) {

		User entity = new User();
		entity.setUserName(userDto.getUserName());
		entity.setFirstName(userDto.getFirstName());
		entity.setLastName(userDto.getLastName());
		entity.setPhone(userDto.getPhone());
		entity.setEmail(userDto.getEmail());
		return entity;
	}

}
