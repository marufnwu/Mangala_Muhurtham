package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class PermanentAddressItem{

	@SerializedName("permanent_postal_code")
	private String permanentPostalCode;

	@SerializedName("permanent_country")
	private String permanentCountry;

	@SerializedName("permanent_city")
	private String permanentCity;

	@SerializedName("permanent_state")
	private String permanentState;

	public String getPermanentPostalCode(){
		return permanentPostalCode;
	}

	public String getPermanentCountry(){
		return permanentCountry;
	}

	public String getPermanentCity(){
		return permanentCity;
	}

	public String getPermanentState(){
		return permanentState;
	}
}