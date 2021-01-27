package com.mangala.muhurtham.Models;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MemberData{

	@SerializedName("member_since")
	private String memberSince;

	@SerializedName("additional_personal_details")
	private List<AdditionalPersonalDetailsItem> additionalPersonalDetails;

	@SerializedName("present_address")
	private List<PresentAddressItem> presentAddress;

	@SerializedName("personal_attitude_and_behavior")
	private List<PersonalAttitudeAndBehaviorItem> personalAttitudeAndBehavior;

	@SerializedName("language")
	private List<LanguageItem> language;

	@SerializedName("membership")
	private int membership;

	@SerializedName("permanent_address")
	private List<PermanentAddressItem> permanentAddress;

	@SerializedName("direct_messages")
	private int directMessages;



	@SerializedName("member_profile_id")
	private String memberProfileId;

	@SerializedName("family_info")
	private List<FamilyInfoItem> familyInfo;

	@SerializedName("profile_status")
	private int profileStatus;

	@SerializedName("profile_image")
	private List<ProfileImageItem> profileImage;

	@SerializedName("short_list")
	private List<Object> shortList;

	@SerializedName("education_and_career")
	private List<EducationAndCareerItem> educationAndCareer;

	@SerializedName("interest")
	private List<Object> interest;

	@SerializedName("partner_expectation")
	private List<PartnerExpectationItem> partnerExpectation;

	@SerializedName("privacy_status")
	private List<PrivacyStatusItem> privacyStatus;

	@SerializedName("interested_by")
	private List<Object> interestedBy;

	@SerializedName("reported_by")
	private int reportedBy;

	@SerializedName("package_info")
	private List<PackageInfoItem> packageInfo;

	@SerializedName("email")
	private String email;

	@SerializedName("introduction")
	private String introduction;

	@SerializedName("gallery")
	private List<Object> gallery;

	@SerializedName("height")
	private Object height;

	@SerializedName("member_id")
	private String memberId;

	@SerializedName("ignored")
	private List<Object> ignored;

	@SerializedName("basic_info")
	private List<BasicInfoItem> basicInfo;

	@SerializedName("follower")
	private int follower;

	@SerializedName("express_interest")
	private int expressInterest;

	@SerializedName("profile_completion")
	private int profileCompletion;

	@SerializedName("pic_privacy")
	private List<PicPrivacyItem> picPrivacy;

	@SerializedName("ignored_by")
	private List<Object> ignoredBy;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("life_style")
	private List<LifeStyleItem> lifeStyle;

	@SerializedName("spiritual_and_social_background")
	private List<SpiritualAndSocialBackgroundItem> spiritualAndSocialBackground;

	@SerializedName("followed")
	private List<Object> followed;

	@SerializedName("photo_gallery")
	private int photoGallery;

	@SerializedName("is_blocked")
	private Object isBlocked;

	@SerializedName("report_profile")
	private List<Object> reportProfile;

	@SerializedName("dob")
	private String dob;

	@SerializedName("name")
	private String name;

	@SerializedName("physical_attributes")
	private List<PhysicalAttributesItem> physicalAttributes;

	@SerializedName("residency_information")
	private List<ResidencyInformationItem> residencyInformation;

	@SerializedName("happy_story")
	private List<Object> happyStory;

	@SerializedName("payments_info")
	private List<Object> paymentsInfo;

	@SerializedName("notifications")
	private List<Object> notifications;

	public String getMemberSince(){
		return memberSince;
	}

	public List<AdditionalPersonalDetailsItem> getAdditionalPersonalDetails(){
		return additionalPersonalDetails;
	}

	public List<PresentAddressItem> getPresentAddress(){
		return presentAddress;
	}

	public List<PersonalAttitudeAndBehaviorItem> getPersonalAttitudeAndBehavior(){
		return personalAttitudeAndBehavior;
	}

	public List<LanguageItem> getLanguage(){
		return language;
	}

	public int getMembership(){
		return membership;
	}

	public List<PermanentAddressItem> getPermanentAddress(){
		return permanentAddress;
	}

	public int getDirectMessages(){
		return directMessages;
	}



	public String getMemberProfileId(){
		return memberProfileId;
	}

	public List<FamilyInfoItem> getFamilyInfo(){
		return familyInfo;
	}

	public int getProfileStatus(){
		return profileStatus;
	}

	public List<ProfileImageItem> getProfileImage(){
		return profileImage;
	}

	public List<Object> getShortList(){
		return shortList;
	}

	public List<EducationAndCareerItem> getEducationAndCareer(){
		return educationAndCareer;
	}

	public List<Object> getInterest(){
		return interest;
	}

	public List<PartnerExpectationItem> getPartnerExpectation(){
		return partnerExpectation;
	}

	public List<PrivacyStatusItem> getPrivacyStatus(){
		return privacyStatus;
	}

	public List<Object> getInterestedBy(){
		return interestedBy;
	}

	public int getReportedBy(){
		return reportedBy;
	}

	public List<PackageInfoItem> getPackageInfo(){
		return packageInfo;
	}

	public String getEmail(){
		return email;
	}

	public String getIntroduction(){
		return introduction;
	}

	public List<Object> getGallery(){
		return gallery;
	}

	public Object getHeight(){
		return height;
	}

	public String getMemberId(){
		return memberId;
	}

	public List<Object> getIgnored(){
		return ignored;
	}

	public List<BasicInfoItem> getBasicInfo(){
		return basicInfo;
	}

	public int getFollower(){
		return follower;
	}

	public int getExpressInterest(){
		return expressInterest;
	}

	public int getProfileCompletion(){
		return profileCompletion;
	}

	public List<PicPrivacyItem> getPicPrivacy(){
		return picPrivacy;
	}

	public List<Object> getIgnoredBy(){
		return ignoredBy;
	}

	public String getMobile(){
		return mobile;
	}

	public List<LifeStyleItem> getLifeStyle(){
		return lifeStyle;
	}

	public List<SpiritualAndSocialBackgroundItem> getSpiritualAndSocialBackground(){
		return spiritualAndSocialBackground;
	}

	public List<Object> getFollowed(){
		return followed;
	}

	public int getPhotoGallery(){
		return photoGallery;
	}

	public Object getIsBlocked(){
		return isBlocked;
	}

	public List<Object> getReportProfile(){
		return reportProfile;
	}

	public String getDob(){
		return dob;
	}

	public String getName(){
		return name;
	}

	public List<PhysicalAttributesItem> getPhysicalAttributes(){
		return physicalAttributes;
	}

	public List<ResidencyInformationItem> getResidencyInformation(){
		return residencyInformation;
	}

	public List<Object> getHappyStory(){
		return happyStory;
	}

	public List<Object> getPaymentsInfo(){
		return paymentsInfo;
	}

	public List<Object> getNotifications(){
		return notifications;
	}
}