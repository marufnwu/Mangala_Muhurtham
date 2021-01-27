package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class PhysicalAttributesItem{

	@SerializedName("eye_color")
	private String eyeColor;

	@SerializedName("complexion")
	private String complexion;

	@SerializedName("body_art")
	private String bodyArt;

	@SerializedName("body_type")
	private String bodyType;

	@SerializedName("weight")
	private String weight;

	@SerializedName("blood_group")
	private String bloodGroup;

	@SerializedName("any_disability")
	private String anyDisability;

	@SerializedName("hair_color")
	private String hairColor;

	public String getEyeColor(){
		return eyeColor;
	}

	public String getComplexion(){
		return complexion;
	}

	public String getBodyArt(){
		return bodyArt;
	}

	public String getBodyType(){
		return bodyType;
	}

	public String getWeight(){
		return weight;
	}

	public String getBloodGroup(){
		return bloodGroup;
	}

	public String getAnyDisability(){
		return anyDisability;
	}

	public String getHairColor(){
		return hairColor;
	}
}