package nonAccessModifiersInJava;

public class SynchronizedNonAccessModifier {
	
	//Synchronized is a non-access modifier can be used before the methods
	
	//When a method is declared as synchronized, it ensures that only one thread can access that method at a time for a particular object.
	
	public void method(String test) throws InterruptedException {
		System.out.println("execution started for " + test);
		Thread.sleep(10000);//wait for 3 sec
		System.out.println("execution completed for " + test);
	}

	//@Test
	public void testCase1() throws InterruptedException {
		method("Test Case 1");
	}

	//@Test
	public void testCase2() throws InterruptedException {
		method("Test Case 2");
	}

}
