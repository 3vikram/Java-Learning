package com.school.teacher.service;

public class Practice {
	
	String Uname = null;
	int Uage = 0;
	
	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		this.Uname = uname;
	}

	public static void main (String args[]) {
		
		Practice p = new Practice();
		p.Uname = "Vikram";
		p.Uage = 30;
		
		System.out.println(p.Uname + p.Uage);
		
	}

}
