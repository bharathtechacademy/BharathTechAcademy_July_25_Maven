package exceptionHandling;

public class StackOverFlowError {
	
	public static void printName() {
		printName();
	}

	public static void main(String[] args) {
		printName();
	}

}
