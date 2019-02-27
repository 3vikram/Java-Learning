class Dog {

	int age;
	
	// Constructor of Dog class below takes dogs age as a argument
	public Dog(int dogsAge) {
    		age = dogsAge;
  	}
  
	// bark method which prints a statement
	
	public void bark() {
    		System.out.println("Woof!");
  	}
	
	// run method which takes feet of type int as an argument
	public void run(int feet) {
    		System.out.println("Your dog ran " + feet + " feet!");
  	}
	
	// main method, here an instance of Dog class is created and this instance object is named as 'spike'
	public static void main(String[] args) {
    
    		Dog spike = new Dog(5);
		
		// bark() method called with the object instance instantiated
		spike.bark();
		// run() method called with the object instance instantiated and an integer is passed as an argument
		spike.run(25);
	}
}
