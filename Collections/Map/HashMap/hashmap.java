import java.util.HashMap;

public class RestaurantForEach {
	public static void main(String[] args) {
		
		// Here the key value pairs are not ordered in sequence as it was added similar to HashSet
		// Trying to add existing key and a value to it will only update the key with the latest value
		
		// Trying to access a non-existent key value will fetch you null
		/*
		    hostCities.put("Beijing", 2008);
		    hostCities.put("London", 2012);
		    hostCities.put("Rio de Janeiro", 2016);

		    hostCities.keySet()  // returns keys
		    hostCities.values() // returns values
		    hostCities.get("Beijing")
		    hostCities.size()
		    hostCities.containsKey("London")
		    hostCities.isEmpty()
		    hostCities.clear()
		    hostCities.containsKey("London")
		    hostCities.containsValue(2016)
		    hostCities.clone()
		    newhostCities.putAll(hostCities)
		    hostCities.remove("Beijing")
    
		    HashMap doesn’t allow duplicate keys but allows duplicate values.
		*/

		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
		restaurantMenu.put("Cranberry Kale Salad", 10);

		System.out.println(restaurantMenu.size());
    
		for (String item: restaurantMenu.keySet()) {

			System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");

		}
	}
}
