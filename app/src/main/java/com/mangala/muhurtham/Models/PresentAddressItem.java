package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class PresentAddressItem{

	@SerializedName("country")
	private String country;

	@SerializedName("city")
	private String city;

	@SerializedName("state")
	private String state;

	@SerializedName("postal_code")
	private String postalCode;

	public String getCountry(){
		return country;
	}

	public String getCity(){
		return city;
	}

	public String getState(){
		return state;
	}

	public String getPostalCode(){
		return postalCode;
	}
}