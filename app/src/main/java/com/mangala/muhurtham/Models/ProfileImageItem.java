package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class ProfileImageItem{

	@SerializedName("profile_image")
	private String profileImage;

	@SerializedName("thumb")
	private String thumb;

	public String getProfileImage(){
		return profileImage;
	}

	public String getThumb(){
		return thumb;
	}
}