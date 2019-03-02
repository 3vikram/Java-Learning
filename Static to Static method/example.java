package com.training.class2;

public class training2 {
	
	public int age = 5;
	
	public void test() {
		System.out.println("non-static method");
	}
	
	public void test1() {
		training2 test = new training2();
		test.test();
	}
	
	public static void main (String args[]) {
		training2 t = new training2();
		t.test1();
	}

} 
