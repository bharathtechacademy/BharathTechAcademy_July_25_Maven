package nonAccessModifiersInJava;

public class StaticExample {
	
	//Static Non-Access Modifier can be used before data, method, block and inner classes
	//Static Non-Access Modifier it won't be part of class instance , so we don't need to create an object

	public static String name = "Selenium";

	public static void sumOfNumbers(int a, int b) {
		System.out.println("Sum of two numbers: " + (a + b));
	}

	public static void main(String[] args) {
//		StaticClass obj = new StaticClass();
		System.out.println(name);
		sumOfNumbers(10, 20);
	}

}
