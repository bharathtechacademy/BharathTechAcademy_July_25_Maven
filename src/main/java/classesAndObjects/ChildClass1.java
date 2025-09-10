package classesAndObjects;

//access the parent class information using object of parent class
public class ChildClass1 {
	
	

	public static void main(String[] args) {
		ParentClass obj = new ParentClass(); //object of parent class
		
		System.out.println(obj.empId); //accessing empId from parent class
		System.out.println(obj.empName); //accessing empName from parent class
		System.out.println(obj.visaStatus); //accessing visaStatus from parent class
		System.out.println(obj.empAddress[0]); //accessing empAddress from parent class
		

	}

}
