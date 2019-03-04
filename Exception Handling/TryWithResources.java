package com.training.class2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class training3 {
	
	  public void test() {
		  // Try with resources is shown below to close the file handling object automatically after file operation
		  try (BufferedReader br = new BufferedReader(new FileReader("/Users/trivikramr/eclipse-workspace/Training 2/src/com/training/class2/test.txt"))) 
		  {
			 String line = br.readLine();
			 while (line != null) {
				 System.out.println(line);
				 line = br.readLine();
			 }
		  }
		  catch (IOException err) {
			  err.getStackTrace();
		  }
		  catch (Exception err) {
			  err.getStackTrace();
		  }	
		  // No need to close the BufferedReader object "br" as it is automatically closed via try with resources
	  }
	  
	  public static void main(String args[]){  
		  training3 t3 = new training3();
		  t3.test();
		  
	  }  
        
}
