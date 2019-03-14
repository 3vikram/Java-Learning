package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		//List is the Interface, ArrayList is the implementation
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(16);
		values.add(1);
		values.add(9);
		values.add(1, 2);
		
		for (int value: values) {
			System.out.println(value);
		}
	}
}

Result:
4
2
16
1
9
