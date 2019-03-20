package com.java.practice;

public class Collections {

	public static void main(String[] args) {
		
		String s1 = "test"; 
		String s2 = "test"; // points to the same reference as s1 as the content is same (String literals are used)
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2); // Reference comparison is done, not content comparison
		System.out.println(s1.equals(s2)); /* .equals() compares object contents, this calls the String.java as the object 
							type is String */
		
		/* If 2 different objects hold same values then .equals() method will call the Objects.java. This compares the 
			references of the objects,
		 
		 String t1 = new String('one');
		 String t2 = new String('one');
		 System.out.println(t1.equals(t2)); // This will return true as .equals method now will be called from String.java to
		 compare the values for String type objects
		 */
	}
}




Result:

3556498
3556498
true
true
