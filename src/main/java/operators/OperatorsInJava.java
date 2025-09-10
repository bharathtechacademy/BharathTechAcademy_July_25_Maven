package operators;

public class OperatorsInJava {
	
	//Operators : operators are nothing but some of the special characters available in the keyboard that we are going to use to perform different types of operations in Java programming language.

	
	//Mainly, we have five categories of operators in Java:
	
	//1. Arithmetic Operators ==> Special characters used to perform mathematical operations.
	//2. Assignment Operators ==> Special characters used to assign values to variables.
	//3. Comparison Operators ==> Special characters used to compare two primitive datatypes.
	//4. Logical Operators ==> Special characters used to perform logical operations.
	//5. Ternary Operator ==> Special character used to perform conditional operations.
	
	public static void main(String[] args) {
		
		//1. Arithmetic Operators ==> Special characters used to perform mathematical operations.
		System.out.println("===========Arithmetic Operators:=============");

		// + ==> Addition
		// - ==> Subtraction
		// * ==> Multiplication
		// / ==> Division
		// % ==> Modulus (Remainder)
		// ++ ==> Increment (Increases the value by 1)
		// -- ==> Decrement (Decreases the value by 1)
		
		int a = 10;
		int b = 5;
		
		// + ==> Addition
		System.out.println(a + 5); // Output: 15
		// - ==> Subtraction
		System.out.println(a - 5); // Output: 5
		// * ==> Multiplication
		System.out.println(a * 5); // Output: 50
		// / ==> Division
		System.out.println(a / 5); // Output: 2
		// % ==> Modulus (Remainder)
		System.out.println(a % 3); // Output: 1
		// ++ ==> Increment (Increases the value by 1)
		System.out.println(a++); //post-increment, Output: 10 (a becomes 11 after this line)
		System.out.println(++b); //pre-increment, Output: 6 (b becomes 6 before this line)
		// -- ==> Decrement (Decreases the value by 1)
		System.out.println(a--); //post-decrement, Output: 11 (a becomes 10 after this line)
		System.out.println(--b); //pre-decrement, Output: 5 (b becomes 5 before this line)
		
		//2. Assignment Operators ==> Special characters used to assign values to variables.
		System.out.println("===========Assignment Operators:=============");
		// = ==> Assignment
		// += ==> Add and assign
		// -= ==> Subtract and assign
		// *= ==> Multiply and assign
		// /= ==> Divide and assign
		// %= ==> Modulus and assign
	
		// = ==> Assignment
		int x = 100;
		
		// += ==> Add and assign
		x += 10; // x = x + 10 ==> x = 110
		System.out.println(x); // Output: 110
		// -= ==> Subtract and assign
		x -= 20; // x = x - 20 ==> x = 90
		System.out.println(x); // Output: 90
		// *= ==> Multiply and assign
		x *= 2; // x = x * 2 ==> x = 180
		System.out.println(x); // Output: 180
		// /= ==> Divide and assign
		x /= 3; // x = x / 3 ==> x = 60
		System.out.println(x); // Output: 60
		// %= ==> Modulus and assign
		x %= 7; // x = x % 7 ==> x = 4
		System.out.println(x); // Output: 4
		
		//3. Comparison Operators ==> Special characters used to compare two primitive datatypes.
		System.out.println("===========Comparison Operators:=============");
		// == ==> Equal to
		// != ==> Not equal to
		// > ==> Greater than
		// < ==> Less than
		// >= ==> Greater than or equal to
		// <= ==> Less than or equal to
		
		int y = 10;
		int z = 20;
		
		// == ==> Equal to
		System.out.println(y == z); // Output: false
		// != ==> Not equal to
		System.out.println(y != z); // Output: true
		// > ==> Greater than
		System.out.println(y > z); // Output: false
		// < ==> Less than
		System.out.println(y < z); // Output: true
		// >= ==> Greater than or equal to
		System.out.println(y >= z); // Output: false
		// <= ==> Less than or equal to
		System.out.println(y <= z); // Output: true
		
		//4. Logical Operators ==> Special characters used to perform logical operations.
		System.out.println("===========Logical Operators:=============");
		// && ==> Logical AND  ==> Returns true only if all conditions are true
		// || ==> Logical OR ==> Returns true if at least one condition is true
		// ! ==> Logical NOT ==> Reverses the logical state of its operand
		
		int p = 5;
		int q = 10;
		
		// && ==> Logical AND
		System.out.println(p < 10 && q < 5); // true and false, Output: false
		System.out.println(p < 10 && q > 5); // true and true,Output: true
		
		// || ==> Logical OR
		System.out.println(p < 10 || q < 5); // true or false, Output: true
		System.out.println(p > 10 || q < 5); // false or false, Output: false
		
		// ! ==> Logical NOT
		System.out.println(!(p < 10)); // Output: false (because p < 10 is true, so !true is false)
		
		//5. Ternary Operator ==> Special character used to perform conditional operations.
		System.out.println("===========Ternary Operator:=============");
		// ? : ==> Ternary operator (conditional operator)
		// Syntax: condition ? value_if_true : value_if_false
		
		int i = 10;
		int j = 20;
		int max = (i > j) ? i : j; // If i is greater than j, max will be i, otherwise it will be j
		System.out.println("Maximum value is: " + max); // Output: Maximum value is: 20
		
		// Example of Ternary Operator
		int age = 17;
		String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
		System.out.println(eligibility); // Output: Eligible to vote
	}

}
