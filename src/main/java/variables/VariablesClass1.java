package variables;

public class VariablesClass1 {

	String topic2 = "API Testing"; // Instance Variable

	static String topic3 = "JAVA"; // Static Variable

	public static void main(String[] args) {
		String topic1 = "Selenium"; // Local Variable
		System.out.println("Topic 1: " + topic1);
		
		//CALLING INSTANCE VARIABLE
		VariablesClass1 obj = new VariablesClass1();
		System.out.println("Topic 2: " + obj.topic2);
		
		//CALLING STATIC VARIABLE
		System.out.println("Topic 3: " + topic3);
	}
	


}
