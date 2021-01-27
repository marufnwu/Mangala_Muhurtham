package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class BasicInfoItem{

	@SerializedName("area")
	private String area;

	@SerializedName("marital_status")
	private String maritalStatus;

	@SerializedName("number_of_children")
	private String numberOfChildren;

	@SerializedName("age")
	private String age;

	@SerializedName("on_behalf")
	private String onBehalf;

	public String getArea(){
		return area;
	}

	public String getMaritalStatus(){
		return maritalStatus;
	}

	public String getNumberOfChildren(){
		return numberOfChildren;
	}

	public String getAge(){
		return age;
	}

	public String getOnBehalf(){
		return onBehalf;
	}
}