package com.java.practice;

import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		
		//Set is the Interface, TreeSet is the implementation, Set allows only unique values and no duplicate values
		//Tree set helps in maintaining the elements in ascending order
		
		Set<Integer> values = new TreeSet<>();
		
		values.add(51);
		values.add(9);
		values.add(51);
		values.add(45);
		values.add(34);
		
		
		for (int value: values) {
			System.out.println(value);
		}
	}
}

Result:

9
34
45
51
