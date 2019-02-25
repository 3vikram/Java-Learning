package com.school.teacher.service;

public class Teacher {
	
	// Declaring properties of the class as private
	private String teacherName = null;
	private int teacherAge = 0;
	private String teacherQualification = null;
	private double teacherExperience = 0.0;
	private int teacherSalary = 0;
	
	// Declaring getter and setter methods to set and retrieve the above private properties
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherAge() {
		return teacherAge;
	}
	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}
	public String getTeacherQualification() {
		return teacherQualification;
	}
	public void setTeacherQualification(String teacherQualification) {
		this.teacherQualification = teacherQualification;
	}
	public double getTeacherExperience() {
		return teacherExperience;
	}
	public void setTeacherExperience(double teacherExperience) {
		this.teacherExperience = teacherExperience;
	}
	public int getTeacherSalary() {
		return teacherSalary;
	}
	public void setTeacherSalary(int teacherSalary) {
		this.teacherSalary = teacherSalary;
	}
	
	// main method within the class where the instance of this class will be instantiated
	public static void main (String args[]) {
		Teacher t = new Teacher(); // t is the object instantiated of class Teacher
		t.setTeacherName("Nithya"); // setter method of teacher class is used to set properties of teacher
		t.setTeacherAge(29);
		t.setTeacherQualification("B.COM");
		t.setTeacherExperience(8.5);
		t.setTeacherSalary(50000);
		
		/* String formatting is done by using as follows,
		 * %s for Strings, %d for integers, %f for double and %n for newline
		 */
		
		System.out.printf("%s is a teacher, %d years old %n", t.getTeacherName(), t.getTeacherAge());
		System.out.printf("%s has done %s and have a experience of %.1f %n", t.getTeacherName(), t.getTeacherQualification(), t.getTeacherExperience());
		System.out.printf("%s earns %d per month %n", t.getTeacherName(), t.getTeacherSalary());
	}
	
	

}
