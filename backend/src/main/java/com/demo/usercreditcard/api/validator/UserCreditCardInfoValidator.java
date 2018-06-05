package com.demo.usercreditcard.api.validator;

import org.springframework.stereotype.Component;
import com.demo.usercreditcard.api.dto.UserCreditCardDto;
import com.demo.usercreditcard.api.exception.MissingMandatoryFieldException;

@Component
public class UserCreditCardInfoValidator {

	public void validate(UserCreditCardDto userCreditCardDto) {

		if (userCreditCardDto == null || userCreditCardDto.getCardHolderName() == null
				|| userCreditCardDto.getCardNickName() == null || userCreditCardDto.getCardNumber() == 0
				|| userCreditCardDto.getCardType() == null || userCreditCardDto.getUserID() == 0)

			throw new MissingMandatoryFieldException("missing.field");

	}

}
