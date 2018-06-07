package com.demo.usercreditcard.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.usercreditcard.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findAll();

}
