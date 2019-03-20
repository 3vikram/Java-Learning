package com.java.practice;

public class Collections {
	

	public static void main(String[] args) {
		
		Collections c = new Collections();
		System.out.println(c.toString()); 
		/* .toString() method returns classname@HashCode(Converted from int to Hex String)
		getClass().getName+@IntegerToHexString(Hashcode) , by default this is the implementation of toString() method
		
		toString() method can be overriden such that no hashcode is used and our way of implementation can be done
		toString() method uses hashcode when we use Object class toString
		*/
	}
}


Result:

com.java.practice.Collections@70dea4e
