package loopStatements;

import java.util.LinkedHashSet;
import java.util.Set;

public class Loops {
	
	//Loop Statements ==> Loop the Statements ==> Repeat the execution of statements 
	
	//Types of Loop Statements
	
	//1. for loop ==> for loop is used when we know the number of iterations in advance.
	//Syntax: for(conditionToBegin; conditionToEnd; Interval) { //statements }
	
	//2. while loop ==> while loop is used when we don't know the number of iterations in advance.
	//Syntax: while(condition) { 
	//statements 
	//condition to end the loop(not -mandatory)
	//}
	
	//Specialized Loops
	
	//3. for-each loop ==> for-each loop is used to iterate over arrays and collections.
	//4. do-while loop ==> do-while loop is used when we want to execute the statements at least once before checking the condition.

	public static void main(String[] args) {
		
		String name ="Bharath";
		
		//Before using the loop statements, we need to know the number of iterations.
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		
		//After using the loop statements
		
		//1. for loop : print the name 10 times
		System.out.println("========FOR LOOP=========");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+name);
		}
		
		//2. while loop : refresh the page until page is loaded
		System.out.println("========WHILE LOOP=========");
		int i= 1;
		while(i>0) {
			if(i>10) {
				break; // to avoid infinite loop
			}
			System.out.println("Refreshing the page");
			i++;
		}
		
		//3. for-each loop : iterate over an array		
		
		//Array of employee names
		String [] empNames = new String[3];
		empNames[0] = "Bharath"; 
		empNames[1] = "ABC";
		empNames[2] = "XYZ";	
		
		System.out.println("========FOR LOOP=========");
		for(int j=0; j<empNames.length; j++) {
			System.out.println(empNames[j]);
		}		
		
		System.out.println("========FOR EACH LOOP=========");
//		for(DataTypeOfListValue VariableName : PreDefinedListName) {
//			//statements
//		}
		for(String empName : empNames) {
			System.out.println(empName);
		}
		
		//Set of employee names
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("John");
		empNamesLinkedHashSet.add("Sony");
		
		System.out.println("========FOR LOOP=========");
//		for(int j=0; j<empNamesLinkedHashSet.size(); j++) {
//			System.out.println(empNamesLinkedHashSet.get(j));
//		}	
		
		System.out.println("========FOR EACH LOOP=========");
		for(String empName : empNamesLinkedHashSet) {
			System.out.println(empName);
		}
		
		//4. do-while loop : execute the statements at least once before checking the condition
		System.out.println("========DO WHILE LOOP=========");
		int k = 0;
		do {
			System.out.println("Refresh The Page");
			k++;
		}while(k>0);
	}

}
