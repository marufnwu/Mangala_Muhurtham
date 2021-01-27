package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class PrivacyStatusItem{

	@SerializedName("additional_personal_details")
	private String additionalPersonalDetails;

	@SerializedName("present_address")
	private String presentAddress;

	@SerializedName("personal_attitude_and_behavior")
	private String personalAttitudeAndBehavior;

	@SerializedName("language")
	private String language;

	@SerializedName("life_style")
	private String lifeStyle;

	@SerializedName("permanent_address")
	private String permanentAddress;

	@SerializedName("spiritual_and_social_background")
	private String spiritualAndSocialBackground;

	@SerializedName("hobbies_and_interest")
	private String hobbiesAndInterest;

	@SerializedName("family_info")
	private String familyInfo;

	@SerializedName("astronomic_information")
	private String astronomicInformation;

	@SerializedName("education_and_career")
	private String educationAndCareer;

	@SerializedName("partner_expectation")
	private String partnerExpectation;

	@SerializedName("physical_attributes")
	private String physicalAttributes;

	@SerializedName("residency_information")
	private String residencyInformation;

	public String getAdditionalPersonalDetails(){
		return additionalPersonalDetails;
	}

	public String getPresentAddress(){
		return presentAddress;
	}

	public String getPersonalAttitudeAndBehavior(){
		return personalAttitudeAndBehavior;
	}

	public String getLanguage(){
		return language;
	}

	public String getLifeStyle(){
		return lifeStyle;
	}

	public String getPermanentAddress(){
		return permanentAddress;
	}

	public String getSpiritualAndSocialBackground(){
		return spiritualAndSocialBackground;
	}

	public String getHobbiesAndInterest(){
		return hobbiesAndInterest;
	}

	public String getFamilyInfo(){
		return familyInfo;
	}

	public String getAstronomicInformation(){
		return astronomicInformation;
	}

	public String getEducationAndCareer(){
		return educationAndCareer;
	}

	public String getPartnerExpectation(){
		return partnerExpectation;
	}

	public String getPhysicalAttributes(){
		return physicalAttributes;
	}

	public String getResidencyInformation(){
		return residencyInformation;
	}
}