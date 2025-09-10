package language.basics;

public class ArraysInJava {

	// Array :

//	1.It's a Non-primitive data type
//	2. With in the Array, we can store multiple values together of same data type
//	3. Array is a fixed size data structure

	public static void main(String[] args) {

		String emp1Name = "Bharath";
		int emp1Id = 1234;

		String emp2Name = "Abdul";
		int emp2Id = 1235;

		String emp3Name = "Dharani";
		int emp3Id = 1236;

		// Array Declaration when we know all the values at the time of declaration
		String[] empNames = { "Bharath", "Abdul", "Dharani" };
		int[] empIds = { 1234, 1235, 1236 };

		System.out.println("Size of empNames array: " + empNames.length); // + can join strings and + can sum numbers

		System.out.println("Employee 1 Name: " + empNames[0]);
		System.out.println("Employee 1 Id: " + empIds[0]);
		System.out.println(2 + 2);// 4
		System.out.println("2" + 2);// 22

		// Array Declaration when we know the size of the array but not the values
		
		// 1D Array Declaration
		String[] empNames2 = new String[3];
		int[] empIds2 = new int[3];

		// Assigning values to the array
		empNames2[0] = "Bharath";
		empNames2[1] = "Abdul";
		empNames2[2] = "Dharani";

		empIds2[0] = 1234;
		empIds2[1] = 1235;
		empIds2[2] = 1236;

		System.out.println("Employee 2 Name: " + empNames2[1]);
		System.out.println("Employee 2 Id: " + empIds2[1]);

		// 2D Array Declaration ==> Array of Arrays

		// Store 3 projects with 4 employees in each project
		String[][] Projects = new String[3][4];

		// Assigning values to the 2D array

		// Project
		Projects[0][0] = "Bharath";
		Projects[0][1] = "Abdul";
		Projects[0][2] = "Dharani";
		Projects[0][3] = "Suresh";

		// Project 2
		Projects[1][0] = "John";
		Projects[1][1] = "Doe";
		Projects[1][2] = "Jane";
		Projects[1][3] = "Smith";

		// Project 3
		Projects[2][0] = "Alice";
		Projects[2][1] = "Bob";
		Projects[2][2] = "Charlie";
		Projects[2][3] = "David";

		System.out.println("Project 1 Employee 1: " + Projects[0][0]);

		// 3D Array Declaration ==> Array of Arrays of Arrays ==> Array of 2D Arrays

		// I have 2 companies , each company has 3 projects, and each project has 4
		// employees
		String[][][] Companies = new String[2][3][4];

		// Assigning values to the 3D array

		// Company 1-Project 1
		Companies[0][0][0] = "Bharath";
		Companies[0][0][1] = "Abdul";
		Companies[0][0][2] = "Dharani";
		Companies[0][0][3] = "Suresh";

		// Company 1-Project 2
		Companies[0][1][0] = "John";
		Companies[0][1][1] = "Doe";
		Companies[0][1][2] = "Jane";
		Companies[0][1][3] = "Smith";

		// Company 1-Project 3
		Companies[0][2][0] = "Alice";
		Companies[0][2][1] = "Bob";
		Companies[0][2][2] = "Charlie";
		Companies[0][2][3] = "David";

		// Company 2-Project 1
		Companies[1][0][0] = "Eve";
		Companies[1][0][1] = "Frank";
		Companies[1][0][2] = "Grace";
		Companies[1][0][3] = "Hank";

		// Company 2-Project 2
		Companies[1][1][0] = "Ivy";
		Companies[1][1][1] = "Jack";
		Companies[1][1][2] = "Kathy";
		Companies[1][1][3] = "Leo";

		// Company 2-Project 3
		Companies[1][2][0] = "Mia";
		Companies[1][2][1] = "Nina";
		Companies[1][2][2] = "Oscar";
		Companies[1][2][3] = "Paul";

		System.out.println("Company 1 - Project 1 - Employee 1: " + Companies[0][0][0]);

	}

}
