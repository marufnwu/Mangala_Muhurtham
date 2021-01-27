package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class ResidencyInformationItem{

	@SerializedName("immigration_status")
	private String immigrationStatus;

	@SerializedName("residency_country")
	private String residencyCountry;

	@SerializedName("citizenship_country")
	private String citizenshipCountry;

	@SerializedName("grow_up_country")
	private String growUpCountry;

	@SerializedName("birth_country")
	private String birthCountry;

	public String getImmigrationStatus(){
		return immigrationStatus;
	}

	public String getResidencyCountry(){
		return residencyCountry;
	}

	public String getCitizenshipCountry(){
		return citizenshipCountry;
	}

	public String getGrowUpCountry(){
		return growUpCountry;
	}

	public String getBirthCountry(){
		return birthCountry;
	}
}