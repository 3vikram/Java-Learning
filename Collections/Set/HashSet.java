package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		//Set is the Interface, HashSet is the implementation, Set allows only unique values and no duplicate values
		
		Set<Integer> values = new HashSet<>();
		
		values.add(51);
		values.add(9);
		values.add(51);
		
		
		for (int value: values) {
			System.out.println(value);
		}
	}
}

Result:

51
9
