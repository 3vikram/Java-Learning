import java.util.*;

public class Temperatures {
	
	public static void main(String[] args) {
		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
    
    		weeklyTemperatures.add(78);
	    	weeklyTemperatures.add(67);
    		weeklyTemperatures.add(89);
    		weeklyTemperatures.add(94);
    		System.out.println(weeklyTemperatures.get(1));
		
		weeklyTemperatures.add(2, 111);
		Collections.sort(weeklyTemperatures); // Collections class under java.util has sort() method to sort list elements
		
		System.out.println(weeklyTemperatures);

	}
}
