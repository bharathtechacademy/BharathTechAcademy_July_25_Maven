package nonAccessModifiersInJava;

public class TestClass {

	public static void main(String[] args) {
		
		MainClass obj = new MainClass();

		//Call the data from normal inner class
		MainClass.InnerClass obj1 = new MainClass().new InnerClass(); //2 separate 
		System.out.println(obj1.value);
		
		//Call the data from static inner class
		MainClass.StaticInnerClass obj2 =new MainClass.StaticInnerClass(); //together as 1
		System.out.println(obj2.value);
	}

}
