package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		//List is the Interface, ArrayList is the implementation
		//Integer is the wrapper class of Int
		List<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(16);
		values.add(1);
		values.add(9);
		values.add(1, 2);
		values.sort(null);
		for (int value: values) {
			System.out.println(value);
		}
	}
}

Result:
1
2
4
9
16

