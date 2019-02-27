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
	
	// getAge() method retreives the dog's age
	public int getAge() {
    		return age;
  	}
	
	// main method, here an instance of Dog class is created and this instance object is named as 'spike'
	public static void main(String[] args) {
    
    		Dog spike = new Dog(5); // Object 'spike' is created by passing the dog's age as an argument
		
		// bark() method called with the object instance instantiated
		spike.bark();
		// run() method called with the object instance instantiated and an integer is passed as an argument
		spike.run(25);
		int spikeAge = spike.getAge();
    		System.out.println(spikeAge);
	}
}
