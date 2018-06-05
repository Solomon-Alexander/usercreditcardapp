package com.demo.usercreditcard.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "user_credit_card")
public class UserCreditCard {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID")
	private Long id;

	@Column(name = "CARD_NUMBER")
	private Long cardNumber;

	@Column(name = "CARD_TYPE")
	private String cardType;

	@Column(name = "CARD_HOLDER_NAME")
	private String cardHolderName;

	@Column(name = "CARD_NICK_NAME")
	private String cardNickName;

	@Column(name = "USER_ID")
	private Long userID;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

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
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
		return "Configuration [id=" + id + ", cardNumber=" + cardNumber + ", cardType=" + cardType + ", cardHolderName=" + cardHolderName + ", cardNickName="
				+ cardNickName + ", userID=" + userID + "]";
	}

}
