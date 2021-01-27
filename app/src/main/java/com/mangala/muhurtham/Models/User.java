package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("member_data")
	private MemberData memberData;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private int status;

	public MemberData getMemberData(){
		return memberData;
	}

	public String getMessage(){
		return message;
	}

	public int getStatus(){
		return status;
	}
}