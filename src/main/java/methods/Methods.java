package methods;

public class Methods {

	// Methods in Java : Method is block of code or collection of statements written together to perform a specific task.

	// It will help to avoid code duplication and improve code reusability.

	// How to create a method?

	// 1. Identify the duplicate code in your program to complete specific task
	// 2. Separate the code from main method and write it in separate block
	// 3. Define the method name with meaningful name
	// 4. Define the method with return type (datatype of the output) // void if no
	// output value
	
	 /** Types of Methods:
		 * 1. Methods without return type (void) - do not return any value.
		 * 2. Methods with return type - return a value using the 'return' keyword.
		 * 3. Methods with parameters/arguments - accept input data.
		 * 4. Methods without parameters - no input needed.
		 * 5. Constructors - special methods to initialize objects.
		 *     - Default constructor: no parameters.
		 *     - Parameterized constructor: with parameters.
		 * 6. Static methods - belong to the class, callable without creating an object.
		 */

	void loginIntoApplication(String browser) {
		System.out.println("Launch the "+browser+" browser");
		System.out.println("Enter url 'www.icici.com' and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}
	
	
	void logoutAndCloseBrowser() {
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}

	static double getAccountBalance() {
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		return balance; // returning the balance value
	}

	public static void main(String[] args) {
		Methods methods = new Methods(); // Creating an object of Methods class to access non-static methods

		// Test Case 1: Validating the Home Page
		System.out.println("==============Test Case 1: Validating the Home Page==================");
		methods.loginIntoApplication("Chrome"); // Calling the method to login into application
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		methods.logoutAndCloseBrowser(); // Calling the method to logout and close browser

		// Test Case 2: Validating the Fund Transfer Page
		System.out.println("==============Test Case 2: Validating the Fund Transfer Page==================");
		methods.loginIntoApplication("Edge"); // Calling the method to login into application
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		methods.logoutAndCloseBrowser(); // Calling the method to logout and close browser

		// Test Case 3: Validating the Login Page with Valid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Valid Credentials==================");
		methods.loginIntoApplication("Firefox"); // Calling the method to login into application
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		methods.logoutAndCloseBrowser(); // Calling the method to logout and close browser

		// Test Case 3: Validating the Login Page with Invalid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Invalid Credentials==================");
		methods.loginIntoApplication("Firefox"); // Calling the method to login into application
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		methods.logoutAndCloseBrowser(); // Calling the method to logout and close browser

		// Test Case 4: Validating the Account Balance Page and get the balance
		System.out.println(
				"==============Test Case 4: Validating the Account Balance Page and get the balance==================");
		methods.loginIntoApplication("Opera"); // Calling the method to login into application
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println("Account Balance: " + getAccountBalance()); // Calling the method to get account balance
		methods.logoutAndCloseBrowser(); // Calling the method to logout and close browser

	}

}
