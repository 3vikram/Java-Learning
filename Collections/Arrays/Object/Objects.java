package com.java.practice;

public class Collections {

	public static void main(String[] args) {
		
		Object values[] = new Object[5];
		values[0] = (4);
		values[1] = ("test");
		values[2] = (true);
		values[3] = ('C');
		values[4] = (2.50);
		
		for (Object value: values) {
			System.out.println(value);
		}	
	}
}


Result:

4
test
true
C
2.5
