package nonAccessModifiersInJava;

public class FinalClass2 extends FinalClass{
	
	public void printNameAndRole() {
		System.out.println("Name: Chris, Role: Manager");
	}	

	public static void main(String[] args) {
		FinalClass2 obj = new FinalClass2();
		obj.printNameAndRole();
		obj.changeName("Alice");
	}

}
