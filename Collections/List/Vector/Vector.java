package com.java.practice;

import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		
		//Vector is the Implementation of List, introduced in Java 1.0 as their was no dynamic memory collection
		
		Vector <Integer> values = new Vector<Integer>();
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
