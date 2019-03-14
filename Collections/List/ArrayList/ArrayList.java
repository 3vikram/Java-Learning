import java.util.*;

public class Temperatures {
	
	public static void main(String[] args) {
		
		/*
		 	olympicSports.remove(3)
    			olympicSports.size()
    			olympicSports.contains("Cricket")
    			olympicSports.get(1)
			olympicSports.subList(1,3) // returns the items in the Arraylist from index 1 till 2
			olympicSports.set(2, "Baseball") // replaces the index 2 value to "Baseball"
			olympicSports.removeAll()
			olympicSports.isEmpty()
			olympicSports.removeRange(0, 2)  // removes elements in the index from 0 till 1
			olympicSports.clear()
			olympicSports.removeAll(arrlist2); // removes the arrlist2 elements present in olympicSports
		*/
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
