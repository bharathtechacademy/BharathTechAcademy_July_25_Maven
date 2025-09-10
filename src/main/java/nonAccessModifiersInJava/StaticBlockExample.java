package nonAccessModifiersInJava;

public class StaticBlockExample {
	
	static int salary;
	String name ="Bharath";
	
	static {
		salary = 10000;
	}

	public static void main(String[] args) {
		StaticBlockExample obj = new StaticBlockExample();
		System.out.println(obj.name);
		System.out.println(StaticBlockExample.salary);
	}

}
