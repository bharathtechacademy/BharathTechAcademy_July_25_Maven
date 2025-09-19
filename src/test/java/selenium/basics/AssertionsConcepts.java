package selenium.basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsConcepts {
	
	//1. Hard Assertions (Assert class in TestNG) ==> It will fail the test case immediately if any assertion fails
	//2. Soft Assertions (SoftAssert class in TestNG) ==> It will not fail the test case immediately if any assertion fails. It will continue the execution of test case. At the end of the test case, we need to call assertAll() method to mark the test case as failed if any assertion failed during the test case execution.

	public static void main(String[] args) {
		
		//1. Hard Assertions Examples
		Assert.assertEquals("Google", "Google", "Error message: Values does not match"); 
		Assert.assertNotEquals("Google", "google", "Error message: Values should not match");
		Assert.assertTrue(5>1, "Error message: Condition is false");
		Assert.assertFalse(5<1, "Error message: Condition is true");
		Assert.assertNull(null, "Error message: Object is not null");
		Assert.assertNotNull("Selenium", "Error message: Object is null");
		//Assert.fail("Failing the test case intentionally");
		
		//2. Soft Assertions Examples
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Google", "Yahoo", "Error message: Values does not match");
		softAssert.assertNotEquals("Google", "Google", "Error message: Values should not match");
		softAssert.assertTrue(5<1, "Error message: Condition is false");
		softAssert.assertFalse(5>1, "Error message: Condition is true");
		softAssert.assertNull("Selenium", "Error message: Object is not null");
		softAssert.assertNotNull(null, "Error message: Object is null");
		softAssert.fail("Failing the test case intentionally");
		softAssert.assertAll(); // This will mark the test case as failed if any assertion failed during the test case execution.
		
		System.out.println("Execution completed");


	}

}
