package com.lti.model;

public class Payee {
	
	int payeeId;
	String BeneficiaryName;
	String BeneficiaryAccountNumber;
	String Nickname;
	
	
	public int getPayeeId() {
		return payeeId;
	}
	public void setPayeeId(int payeeId) {
		this.payeeId = payeeId;
	}
	public String getBeneficiaryName() {
		return BeneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		BeneficiaryName = beneficiaryName;
	}
	public String getBeneficiaryAccountNumber() {
		return BeneficiaryAccountNumber;
	}
	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		BeneficiaryAccountNumber = beneficiaryAccountNumber;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	
	

}
