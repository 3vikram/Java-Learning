package com.training.class2;

public class training3 {
	
	  double num1 = 5;
	  double num2 = 0;
	  
	  public void div() throws ArithmeticException {
		  double result = num1/num2;
		  System.out.println(result);
		  throw new ArithmeticException();
	  }

	  public void mod() throws ArithmeticException {
		  double result = num1/num2;
		  System.out.println(result);
		  throw new ArithmeticException();
	  }
	  
	  public static void main(String args[]){  
		  training3 t3 = new training3();
		  try {
			  t3.div();
			  t3.mod();
		  }
		  catch (ArithmeticException err) {
			  System.out.println("Divisor cannot be a zero");
		  }
		  
	  }  
        
}
