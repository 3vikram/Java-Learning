package com.java.practice;

import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		
		/*
		Vector is the Implementation of List, introduced in Java 1.0 as their was no dynamic memory collection
		Vector increases the buffer by 100% when the maximum capactiy is reached
		ArrayList increases the buffer by 50% when the maximum capacity is reached
		
		Vector are Thread safe as their methods use Synchoronised keyword and hence its slow
		ArrayList is not a thread safe and hence it's fast
		*/
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
