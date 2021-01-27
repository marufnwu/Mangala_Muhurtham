package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class LanguageItem{

	@SerializedName("read")
	private String read;

	@SerializedName("language")
	private String language;

	@SerializedName("speak")
	private String speak;

	@SerializedName("mother_tongue")
	private String motherTongue;

	public String getRead(){
		return read;
	}

	public String getLanguage(){
		return language;
	}

	public String getSpeak(){
		return speak;
	}

	public String getMotherTongue(){
		return motherTongue;
	}
}