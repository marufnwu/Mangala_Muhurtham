package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class PicPrivacyItem{

	@SerializedName("profile_pic_show")
	private String profilePicShow;

	@SerializedName("gallery_show")
	private String galleryShow;

	public String getProfilePicShow(){
		return profilePicShow;
	}

	public String getGalleryShow(){
		return galleryShow;
	}
}