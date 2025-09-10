package functionalInterfaces;

public interface FunctionalInterface2 {
	
	public int square(int a); //abstract method
	

//	public void subtraction(int a, int b); //abstract method

	public default void show() {
		System.out.println("This is a default method in Interface1");
	}

	public static void display() {
		System.out.println("This is a static method in Interface1");
	}

}
