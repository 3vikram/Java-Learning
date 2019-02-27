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
	
	// main method, here an instance of Dog class is created and this instance object is named as 'spike'
	public static void main(String[] args) {
    
    		Dog spike = new Dog(5);
	}
}
