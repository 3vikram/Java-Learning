package com.training.class2;

public class training3 {
	
	public static void main(String args[]) {
		String[] names = {"test", "rest", "best", "nest", "vest", "fest", "pest", "west"};
		names[0] = null;
		for (String name: names) {
			System.out.println(name);
		}
		
		System.out.println(names.length);
		
	}
}


Result:

null
rest
best
nest
vest
fest
pest
west
8
