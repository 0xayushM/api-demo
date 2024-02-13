package com.createapi.apidemo.model;

public class VendorDetails {
	private String vendorId;
	private String vendorName;
	private String vendorPhone;
	private String vendorAddress;

	public VendorDetails() {
	}

	public VendorDetails(String vendorId, String vendorName, String vendorPhone, String vendorAddress) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorPhone = vendorPhone;
		this.vendorAddress = vendorAddress;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}

	public String getVendorPhone() {
		return vendorPhone;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}
}
