package classesAndObjects;

//access the parent class information using inheritance
public class ChildClass2 extends ParentClass {	

	public static void main(String[] args) {
		ChildClass2 obj = new ChildClass2(); //object of child class
		ParentClass obj2 = new ChildClass2(); //object of child class stored in parent class reference
		
		System.out.println(obj.empId);
		System.out.println(obj.empName);
	}

}
