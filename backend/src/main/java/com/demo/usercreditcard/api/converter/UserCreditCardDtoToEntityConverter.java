package com.demo.usercreditcard.api.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.usercreditcard.api.dto.UserCreditCardDto;
import com.demo.usercreditcard.api.entity.UserCreditCard;

@Component
public class UserCreditCardDtoToEntityConverter implements Converter<UserCreditCardDto, UserCreditCard> {

	@Override
	public UserCreditCard convert(UserCreditCardDto userCreditCardDto) {

		UserCreditCard entity = new UserCreditCard();
		entity.setCardHolderName(userCreditCardDto.getCardHolderName());
		entity.setCardNickName(userCreditCardDto.getCardNickName());
		entity.setCardNumber(userCreditCardDto.getCardNumber());
		entity.setCardType(userCreditCardDto.getCardType());
		entity.setUserID(userCreditCardDto.getUserID());
		return entity;
	}

}
