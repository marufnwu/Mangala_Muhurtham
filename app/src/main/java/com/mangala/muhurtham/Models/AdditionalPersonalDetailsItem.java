package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class AdditionalPersonalDetailsItem{

	@SerializedName("special_circumstances")
	private String specialCircumstances;

	@SerializedName("fathers_occupation")
	private String fathersOccupation;

	@SerializedName("home_district")
	private String homeDistrict;

	@SerializedName("family_residence")
	private String familyResidence;

	public String getSpecialCircumstances(){
		return specialCircumstances;
	}

	public String getFathersOccupation(){
		return fathersOccupation;
	}

	public String getHomeDistrict(){
		return homeDistrict;
	}

	public String getFamilyResidence(){
		return familyResidence;
	}
}