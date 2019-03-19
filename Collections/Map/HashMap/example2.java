package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		
		Map<Integer,Integer> values = new HashMap<>();
		
		values.put(1, 30);
		values.put(2, 32);
		values.put(3, 51);
		values.put(4, 45);
		values.put(5, 34);
		values.put(1, 27);
		
		System.out.println(values.get(9));
    
		for (int value: values.keySet()) {
			System.out.println(value + ":" + values.get(value));
		}
	}
}

Result:

null
1:27
2:32
3:51
4:45
5:34
