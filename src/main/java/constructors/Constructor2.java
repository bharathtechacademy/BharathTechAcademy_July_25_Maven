package constructors;

public class Constructor2 {

	public static void main(String[] args) {
		
		Constructor1 obj = new Constructor1(1234); //Constructor1() is called as constructor method
		obj.printEmpDetails("Bharath Reddy");
		obj.printEmpAddress("Hyderabad");
		obj.printEmpPhone(987654321);
		
	}

}
