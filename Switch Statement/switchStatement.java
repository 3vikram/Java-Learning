public class Switch {
	public static void main(String[] args) {
		
		char penaltyKick = 'X';

    /*
    Switch statement contains cases where our expression value or the actual value are evaluated to match or not
    'case' is the keyword to be used followed by a value for each expected outcome
    define the statements to be executed under each 'case' and make sure to include break statement after each 'case'
    include 'default' case which will be executed when non of the cases are satisfied, default must be a last case statement
    If break statement is not issued under a 'case' then following subsequent cases will be executed untill break statement is seen
    */
		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break; 
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println();

		}

	}
}
