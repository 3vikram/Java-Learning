package com.project1;

public class Address {
	
	private String HouseNo;
	private int PinCode;
	
	public void setHouseNo(String HNO) {
		this.HouseNo = HNO;
	}
	
	public void setPinCode(int Pcode) {
		this.PinCode = Pcode;
	}

	public String getHouseNo() {
		return this.HouseNo;
	}

	public int getPinCode() {
		return this.PinCode;
	}
	
	public void retrieveInfo() {
		//Address ad = new Address();
		//String pcode = String.valueOf(ad.getPinCode());
		System.out.println(getHouseNo() + " " + getPinCode());
	}
	
	public static void main(String[] args) {
		
		Address ad = new Address();
		ad.setHouseNo("20/3");
		ad.setPinCode(560008);
		ad.getHouseNo();
		ad.retrieveInfo();
	}

}
