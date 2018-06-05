package com.demo.usercreditcard.api.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.usercreditcard.api.dto.UserCreditCardDto;
import com.demo.usercreditcard.api.entity.UserCreditCard;

@Component
public class UserCreditCardEntityToDtoConverter implements Converter<UserCreditCard, UserCreditCardDto> {

	@Override
	public UserCreditCardDto convert(UserCreditCard entity) {

		UserCreditCardDto userCreditCardDto = new UserCreditCardDto();
		userCreditCardDto.setCardHolderName(entity.getCardHolderName());
		userCreditCardDto.setCardNickName(entity.getCardNickName());
		userCreditCardDto.setCardNumber(entity.getCardNumber());
		userCreditCardDto.setCardType(entity.getCardType());
		userCreditCardDto.setUserID(entity.getUserID());

		return userCreditCardDto;
	}

}
