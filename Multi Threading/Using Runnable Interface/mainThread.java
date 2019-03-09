package com.training.class2;

public class ThreadMain {
	
	public static void main (String args[]) {
		Thread1 t1 = new Thread1("myThread");
		t1.startMyThread();
		
		Thread1 t2 = new Thread1("myThread1");
		t2.startMyThread(); 
	}

}
