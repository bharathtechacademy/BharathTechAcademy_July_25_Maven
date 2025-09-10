package classesAndObjects;

public class ParentClass{
	
	//emp id is integer
	int empId = 1234;
	
	//emp name is string
	String empName = "John Doe";
	
	//emp visa status is a boolean
	boolean visaStatus = true;
	
	//emp address is an array of strings
	String [] empAddress = {
			"123 Main St",
			"Cityville",
			"State",
			"12345"
	};

	public static void main(String[] args) {
		System.out.println(new ParentClass().empId);

	}

}


