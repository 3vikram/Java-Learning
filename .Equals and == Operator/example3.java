package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		String s1 = new String("test"); // Creates a new Object of type string in heap memory
		String s2 = new String("test");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2)); // .equals() method compares the contents of 2 objects
		//Note: .equals() method can be overriden to compare at reference level as well based on our requirement
	}
}

Result:

3556498
3556498
true
