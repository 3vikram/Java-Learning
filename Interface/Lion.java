package com.training.class2;

public class Lion implements Animal {
	
	public void eat() {
		System.out.println("Deer");
	}
	
	public void home() {
		System.out.println("Nairobi, Africa");
	}
	
	public int sleep() {
		return 18;
	}
	
	public static void main(String args[]) {
		
		Lion africanLion = new Lion();
		africanLion.eat();
		africanLion.home();
		System.out.println(africanLion.sleep());
		System.out.println(africanLion.getClass());
		
	}

}
