package oops;

public class PolyClass2 extends PolyClass1 {
	
	String name = "API";
	
	public void print(String name) {
		System.out.println(name);
//		System.out.println(new PolyClass2().name);
//		System.out.println(new PolyClass1().name);	
		System.out.println(this.name);
		System.out.println(super.name);		
	}
	
	//method overriding
	public void login(String username, String password) {
		System.out.println("Launch the browser");
		System.out.println("Enter the URL");
		System.out.println("Login with "+ username + " and " + password);
	}
	
	public void sumOfNumbers(int a, int b) {
		System.out.println("Sum of two numbers: " + (a+b));
	}
	
	
	//method overloading
	public void sumOfNumbers(int a, int b, int c) {
		System.out.println("Sum of three numbers: " + (a+b+b));
	}
	
	

	public static void main(String[] args) {
		PolyClass2 obj = new PolyClass2();
		obj.print("Java");
		
		
		obj.login("admin", "admin123");
		obj.sumOfNumbers(10, 20, 30);		
		System.out.println("Hello World");
		System.out.println(10+10);
		System.out.println(10==10);
	}

}
