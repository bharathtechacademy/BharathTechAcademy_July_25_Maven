package exceptionHandling;

public class ThrowsDeclaration {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("John");
		Thread.sleep(2000); // Checked Exception
		System.out.println("Doe");
		Thread.sleep(3000); // Checked Exception
		System.out.println("James");
	}

}
