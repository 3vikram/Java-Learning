package com.java.practice;

public class Collections {
	
	int num;
	
	public Collections(int num) {
		this.num = num;
	}

	public String toString() {
		return this.num+"";
	}
	
	public int hashCode() {
		return 2*7+this.num;
	}
	
	public static void main(String[] args) {
		
		Collections c = new Collections(10);
		System.out.println(c);
	}
}

Result:

10
