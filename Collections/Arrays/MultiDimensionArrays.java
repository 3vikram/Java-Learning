package com.training.class2;

public class training3 {
	
	public static void main(String args[]) {
		String[][] names = {{"test", "rest", "best", "nest"}, {"vest", "fest", "pest", "west"}};
		names[0][0] = null;
		
		for (int i = 0; i<names.length; i++) {
			for (int j = 0; j<names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
		
	}
}
