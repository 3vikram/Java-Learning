package com.java.practice;

public class Collections {

	public static void main(String[] args) {
		
		String s1 = "test"; 
		String s2 = "test"; // points to the same reference as s1 as the content is same (String literals are used)
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2); // Reference comparison is done, not content comparison
		System.out.println(s1.equals(s2)); // .equals() compares object references similar to == operator
	}
}




Result:

3556498
3556498
true
true
