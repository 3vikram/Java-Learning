package com.training.class2;

import java.util.Scanner;  

public class training3 {
	
	  private Scanner sc;

	public double [] takeUserInput() {
		  sc = new Scanner(System.in);
		  System.out.println("Enter num1: ");
		  double num1 = sc.nextDouble();
		  System.out.println("Enter num2: ");
		  double num2 = sc.nextDouble();
		  double[] nums = {num1, num2};
		  return nums;
	  }
	  
	  public double div() {
		  String message = "Division Operation Terminated";
		  training3 t1 = new training3();
		  double[] numbers = t1.takeUserInput();
		  try {
			  return numbers[0]/numbers[1];
		  }
		  catch (ArithmeticException e) {
			  System.out.println("Cannot be divided by zero!");
		  }
		  finally {
			  System.out.println(message);
		  }
		return 0;
	  }
	  
	  
	  public static void main(String args[]){  
		  training3 t3 = new training3();
		  System.out.println(t3.div());
	  }  
        
}
