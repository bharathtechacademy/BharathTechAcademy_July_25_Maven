package variables;

public class VariablesClass2 {

	public static void main(String[] args) {
		
		//CALLING INSTANCE VARIABLE
		VariablesClass1 obj = new VariablesClass1();
		System.out.println("Topic 2: " + obj.topic2);
		
		//CALLING STATIC VARIABLE
		System.out.println("Topic 3: " + VariablesClass1.topic3);
	}

}
