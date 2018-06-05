package com.demo.usercreditcard.api.dto;

import javax.validation.constraints.NotNull;

public class UserCreditCardDto {

	@NotNull
	private Long cardNumber;

	@NotNull
	private String cardType;

	@NotNull
	private String cardHolderName;

	@NotNull
	private String cardNickName;

	@NotNull
	private Long userID;

	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * @return the cardNickName
	 */
	public String getCardNickName() {
		return cardNickName;
	}

	/**
	 * @return the cardNumber
	 */
	public Long getCardNumber() {
		return cardNumber;
	}

	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @return the userID
	 */
	public Long getUserID() {
		return userID;
	}

	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * @param cardNickName the cardNickName to set
	 */
	public void setCardNickName(String cardNickName) {
		this.cardNickName = cardNickName;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	@Override
	public String toString() {
		return "UserCreditCard [cardNumber=" + cardNumber + ", cardType=" + cardType + ", cardHolderName=" + cardHolderName + ", cardNickName="
				+ cardNickName + ", userID=" + userID + "]";
	}

}
