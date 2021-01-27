package com.mangala.muhurtham.Models;

import com.google.gson.annotations.SerializedName;

public class PackageInfoItem{

	@SerializedName("payment_type")
	private String paymentType;

	@SerializedName("current_package")
	private String currentPackage;

	@SerializedName("package_price")
	private String packagePrice;

	public String getPaymentType(){
		return paymentType;
	}

	public String getCurrentPackage(){
		return currentPackage;
	}

	public String getPackagePrice(){
		return packagePrice;
	}
}