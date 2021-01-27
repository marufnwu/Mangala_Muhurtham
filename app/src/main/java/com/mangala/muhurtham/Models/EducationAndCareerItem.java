package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class EducationAndCareerItem{

	@SerializedName("occupation")
	private String occupation;

	@SerializedName("highest_education")
	private String highestEducation;

	@SerializedName("annual_income")
	private String annualIncome;

	public String getOccupation(){
		return occupation;
	}

	public String getHighestEducation(){
		return highestEducation;
	}

	public String getAnnualIncome(){
		return annualIncome;
	}
}