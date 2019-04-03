package com.project1;

import java.io.PrintStream;

public class Person extends Address{
	
	private String pName;
	private short pAge;
	private char pGender;
	private long pMobileNo;
	private String pCity;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public short getpAge() {
		return pAge;
	}

	public String getpCity() {
		return pCity;
	}

	public void setpCity(String city) {
		this.pCity = city;
	}

	public void setpAge(short pAge) {
		this.pAge = pAge;
	}

	public char getpGender() {
		return pGender;
	}

	public void setpGender(char pGender) {
		this.pGender = pGender;
	}

	public long getpMobileNo() {
		return pMobileNo;
	}

	public void setpMobileNo(long mobno) {
		this.pMobileNo = mobno;
	}
	
	public String toString() {
		return pName +" " + pAge +" " + pGender+ " " + pMobileNo;
		
	}
	
	@override
	public void retrieveInfo(Person pr1) {
		System.out.println(pr1.getHouseNo() + pr1.getpCity() + pr1.getPinCode());
	}

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setpName("Samanvita");
		p1.setpAge((short) 2);
		p1.setpGender('F');
		p1.setpMobileNo(8867499397L);
		p1.setHouseNo("20/3");
		p1.setPinCode(560008);
		p1.setpCity("Bangalore");
		System.out.println(p1.toString());
		p1.retrieveInfo(p1);

	}

}
