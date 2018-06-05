package com.demo.usercreditcard.api.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.demo.usercreditcard.api.dto.UserCreditCardDto;
import com.demo.usercreditcard.api.entity.UserCreditCard;

public interface UserCreditCardService {

	Page<UserCreditCard> findAll(Pageable pageable);

	UserCreditCardDto findOne(Long id);

	List<UserCreditCardDto> findCreditCardsByUserID(Long userID);

	UserCreditCard save(UserCreditCardDto entity);

	UserCreditCardDto update(Long id, UserCreditCardDto request);

	void delete(Long id);

	List<UserCreditCardDto> findAll();

}
