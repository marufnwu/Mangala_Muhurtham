package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class SpiritualAndSocialBackgroundItem{

	@SerializedName("sub_caste")
	private String subCaste;

	@SerializedName("community_value")
	private String communityValue;

	@SerializedName("family_status")
	private String familyStatus;

	@SerializedName("ethnicity")
	private String ethnicity;

	@SerializedName("u_manglik")
	private String uManglik;

	@SerializedName("caste")
	private String caste;

	@SerializedName("family_value")
	private String familyValue;

	@SerializedName("religion")
	private String religion;

	@SerializedName("personal_value")
	private String personalValue;

	public String getSubCaste(){
		return subCaste;
	}

	public String getCommunityValue(){
		return communityValue;
	}

	public String getFamilyStatus(){
		return familyStatus;
	}

	public String getEthnicity(){
		return ethnicity;
	}

	public String getUManglik(){
		return uManglik;
	}

	public String getCaste(){
		return caste;
	}

	public String getFamilyValue(){
		return familyValue;
	}

	public String getReligion(){
		return religion;
	}

	public String getPersonalValue(){
		return personalValue;
	}
}