package com.demo.usercreditcard.api.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.demo.usercreditcard.api.dto.UserDto;
import com.demo.usercreditcard.api.entity.User;

public interface UserService {

	List<UserDto> findAllUserNames();
}
