package com.java.practice;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		
		//Collection is an interface which has access to limited methods on an element, ArrayList is an implementation or Class
		Collection values = new ArrayList();
		values.add(4);
		values.add("test");
		values.add(true);
		values.add('C');
		values.add(2.50);
		
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
