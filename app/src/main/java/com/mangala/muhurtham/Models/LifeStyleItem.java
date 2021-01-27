package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class LifeStyleItem{

	@SerializedName("smoke")
	private String smoke;

	@SerializedName("living_with")
	private String livingWith;

	@SerializedName("diet")
	private String diet;

	@SerializedName("drink")
	private String drink;

	public String getSmoke(){
		return smoke;
	}

	public String getLivingWith(){
		return livingWith;
	}

	public String getDiet(){
		return diet;
	}

	public String getDrink(){
		return drink;
	}
}