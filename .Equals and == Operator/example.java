package com.java.practice;

public class Collections {

	public static void main(String[] args) {
		
		String s1 = "test"; 
		String s2 = "test"; // points to the same reference as s1 as the content is same (String literals are used)
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2); // Reference comparison is done, not content comparison
		System.out.println(s1.equals(s2)); // .equals() compares object references similar to == operator, this calls the Object.java
		
		/* If 2 different objects hold same values then .equals() method will call the String.java which is a overriden method of 
		 Object.java. This compares the values inisde the objects 
		 
		 String t1 = new String('one');
		 String t2 = new String('two');
		 System.out.println(t1.equals(t2)); // This will return true as .equals method now will be called from String.java to
		 compare values rather than references
		 */
	}
}




Result:

3556498
3556498
true
true
