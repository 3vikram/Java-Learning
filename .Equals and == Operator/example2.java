package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		String s1 = new String("test"); // Creates a new Object of type string in heap memory
		String s2 = new String("test"); // Creates a new Object of type string in heap memory
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
	}
}


Result:

110251487
110251487
false
