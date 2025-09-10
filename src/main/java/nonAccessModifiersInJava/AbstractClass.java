package nonAccessModifiersInJava;

public abstract class AbstractClass {
	
	//Method ==> Block of code / Collection of statements that performs a specific task.
	
//	public void loginIntoApplication() { // concrete method
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url 'www.icici.com' and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
//	}
	
	public abstract void loginIntoApplication();
	
	public void searchProduct() {
		System.out.println("Enter product name as 'iPhone 14 pro max'");
		System.out.println("Click on search button");
	}
	
	public abstract void click();

	public abstract void sendKeys();

}
