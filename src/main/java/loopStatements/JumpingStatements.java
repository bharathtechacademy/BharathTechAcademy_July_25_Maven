package loopStatements;

public class JumpingStatements {
	
	//Jumping Statements ==> Jump the execution of statements ==> Skip the execution of statements
	
	//Types of Jumping Statements
	//1. break statement ==> It is used to exit from the loop or switch statement.
	//2. continue statement ==> It is used to skip the current iteration of the loop and continue with the next iteration.
	
	//3. return statement ==> It is used to exit from the method and return a value to the caller.(methods only)

	public static void main(String[] args) {		
		
		for(int i=1; i<=10 ; i++) {
			if(i%2==0) {
				//break; //break the loop
				continue; //skip the current iteration
			}			
			System.out.println(i);
		}		

	}

}
