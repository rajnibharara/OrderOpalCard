package com.cubic.orderOpalCard.model;

public class OpalCard {
	
	private String username;
	private String cardNickName;
	private String cardNumber;
	private String cardTopUpVal;
	private String autoTopUpType;
	
	private OpalCardType opalCardType;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCardNickName() {
		return cardNickName;
	}

	public void setCardNickName(String cardNickName) {
		this.cardNickName = cardNickName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardTopUpVal() {
		return cardTopUpVal;
	}

	public void setCardTopUpVal(String cardTopUpVal) {
		this.cardTopUpVal = cardTopUpVal;
	}

	public String getAutoTopUpType() {
		return autoTopUpType;
	}

	public void setAutoTopUpType(String autoTopUpType) {
		this.autoTopUpType = autoTopUpType;
	}

	public OpalCardType getOpalCardType() {
		return opalCardType;
	}

	public void setOpalCardType(OpalCardType opalCardType) {
		this.opalCardType = opalCardType;
	}
	
	

}
