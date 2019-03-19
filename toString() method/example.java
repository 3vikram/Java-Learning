package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		//List is the Interface, ArrayList is the implementation
		
		List<Student> values = new ArrayList<>();
		values.add(new Student(1, 25));
		values.add(new Student(2, 23));
		values.add(new Student());
			
		for (Student value: values) {
			System.out.println(value);
		}
	}
}

class Student {
	int rollno;
	int marks;
	
	public Student () {
		getClass();
	}
	public Student(int rollno, int marks) {
		this.rollno = rollno;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
}

Result:

Student [rollno=1, marks=25]
Student [rollno=2, marks=23]
Student [rollno=0, marks=0]

