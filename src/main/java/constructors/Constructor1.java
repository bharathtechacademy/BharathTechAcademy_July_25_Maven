package constructors;

public class Constructor1 {
	
	//Default Constructor: A constructor with no parameters, automatically created by Java if no other constructors are defined.
//	Constructor1(){
//		
//	}
	
	//Parameterized Constructor: A constructor that accepts parameters to initialize object attributes.
	Constructor1(int id){
		empId = id; // Initializing empId with the provided id
	}
	
	int empId;
	
	
	//Sample methods 
	void printEmpDetails(String name) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + name);
	}

	void printEmpAddress( String Address) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Address: " + Address);
	}

	void printEmpPhone(int phoneNumber) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee phoneNumber: " + phoneNumber);
	}
	

	
}
