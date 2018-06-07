package com.demo.usercreditcard.api.service.imp;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.usercreditcard.api.converter.UserDtoToEntityConverter;
import com.demo.usercreditcard.api.converter.UserEntityToDtoConverter;
import com.demo.usercreditcard.api.dto.UserDto;
import com.demo.usercreditcard.api.entity.User;
import com.demo.usercreditcard.api.exception.EntityNotFoundException;
import com.demo.usercreditcard.api.repository.UserRepository;
import com.demo.usercreditcard.api.service.UserService;

@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserEntityToDtoConverter entityToDtoConverter;

	@Autowired
	private UserDtoToEntityConverter dtoToEntityConverter;

	@Override
	public List<UserDto> findAllUserNames() {

		List<User> users = userRepository.findAll();

		if (users.isEmpty())
			throw new EntityNotFoundException("entity.notFound");
		return users.parallelStream().map(entityToDtoConverter::convert).collect(Collectors.toList());
	}
}
