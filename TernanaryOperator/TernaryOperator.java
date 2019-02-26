public class Ternary {
	public static void main(String[] args) {
		
		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ? 'Y':'N';
    
    /*
    The above ternary operator is used as follows,
    first, specify the condition to satisfy or evaluate against within the brackets and follow with '?'
    second, Follow it with single line statement to be executed for true and false conditions. 
    True and false condition statements are seperated by ':'
    */
    
    
		System.out.println(canDrive);

	}
}
