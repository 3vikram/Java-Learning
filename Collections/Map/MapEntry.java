package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		Map<Integer,Integer> values = new HashMap<>();
		
		values.put(1, 30);
		values.put(2, 32);
		values.put(3, 51);
		values.put(4, 45);
		values.put(5, 34);
		
		//Map.Entry --> Map is an interface and this interface implements another interface Entry
		
		Set<Map.Entry<Integer, Integer>> val = values.entrySet();
		
		for (Map.Entry<Integer, Integer> vals: val) {
			System.out.println(vals.getKey() + ":" + vals.getValue());
		}
	}
}

Result:

1:30
2:32
3:51
4:45
5:34
