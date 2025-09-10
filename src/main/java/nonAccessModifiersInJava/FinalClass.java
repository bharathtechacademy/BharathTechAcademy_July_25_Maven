package nonAccessModifiersInJava;

public class FinalClass {
	
	
	// final non-access modifier can be applied to class, method and variable
	
	// final class cannot be inherited
	// final method cannot be overridden
	// final variable value cannot be changed once initialized
	
	final String name = "John";
	
	public void changeName(String newName) {
//		name = newName;
		System.out.println("Name changed to: " + name);
	}
	
	public void printNameAndRole() {
		System.out.println("Name: John, Role: Developer");
	}
	

}
