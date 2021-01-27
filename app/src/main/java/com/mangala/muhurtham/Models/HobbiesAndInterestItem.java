package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class HobbiesAndInterestItem{

	@SerializedName("music")
	private String music;

	@SerializedName("books")
	private String books;

	@SerializedName("movie")
	private String movie;

	@SerializedName("interest")
	private String interest;

	@SerializedName("tv_show")
	private String tvShow;

	@SerializedName("cuisine")
	private String cuisine;

	@SerializedName("fitness_activity")
	private String fitnessActivity;

	@SerializedName("dress_style")
	private String dressStyle;

	@SerializedName("sports_show")
	private String sportsShow;

	@SerializedName("hobby")
	private String hobby;

	public String getMusic(){
		return music;
	}

	public String getBooks(){
		return books;
	}

	public String getMovie(){
		return movie;
	}

	public String getInterest(){
		return interest;
	}

	public String getTvShow(){
		return tvShow;
	}

	public String getCuisine(){
		return cuisine;
	}

	public String getFitnessActivity(){
		return fitnessActivity;
	}

	public String getDressStyle(){
		return dressStyle;
	}

	public String getSportsShow(){
		return sportsShow;
	}

	public String getHobby(){
		return hobby;
	}
}