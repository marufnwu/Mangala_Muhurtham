package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class PersonalAttitudeAndBehaviorItem{

	@SerializedName("humor")
	private String humor;

	@SerializedName("affection")
	private String affection;

	@SerializedName("religious_service")
	private String religiousService;

	@SerializedName("political_view")
	private String politicalView;

	public String getHumor(){
		return humor;
	}

	public String getAffection(){
		return affection;
	}

	public String getReligiousService(){
		return religiousService;
	}

	public String getPoliticalView(){
		return politicalView;
	}
}