package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class Login{

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private int status;

	@SerializedName("member_id")
	private int memberId;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}
}