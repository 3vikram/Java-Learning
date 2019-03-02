package com.training.class2;

public class Lion implements Animal {
	
	public static void test1() {
		System.out.println("running test");
	}
	
	public static void test1(int a) {
		System.out.println(a); 
	}
	
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
		System.out.println(africanLion.category);
		Lion.test1(25);
		Lion.test1();
		
	}

}


Result:

Deer
Nairobi, Africa
18
class com.training.class2.Lion
Carnivorous
25
running test
