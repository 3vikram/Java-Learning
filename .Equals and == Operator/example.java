package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		String s1 = "test"; 
		String s2 = "test"; // points to the same reference as s1 as the content is same
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
	}
}


Result:

3556498
3556498
true
