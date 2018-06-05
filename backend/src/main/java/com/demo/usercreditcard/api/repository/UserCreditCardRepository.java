package com.demo.usercreditcard.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.usercreditcard.api.entity.UserCreditCard;

public interface UserCreditCardRepository extends JpaRepository<UserCreditCard, Long> {

	List<UserCreditCard> findCreditCardsByUserID(Long userID);

}
