package com.java.practice;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		
		//Below line defines Generics as we use Integer type with the collection values
		//Collection is an interface which has access to limited methods on an element, ArrayList is an implementation or Class
		Collection<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(16);
		values.add(1);
		values.add(9);
		values.add(2);
		
		for (Integer value: values) {
			System.out.println(value);
		}
	}
}


Result:

4
16
1
9
2
