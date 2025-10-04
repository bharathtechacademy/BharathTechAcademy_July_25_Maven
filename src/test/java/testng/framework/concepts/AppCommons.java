package testng.framework.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons {

	@Test (groups = {"smoke"},invocationCount = 3)
	public void testCase1() {
//		Assert.fail("Test Case 1 is Failed");
		System.out.println("Executing test case 1...");
	}

	@Test(groups = {"smoke", "sanity"}, priority = -1, dependsOnMethods = {"testCase1","testCase4"}, enabled = false)
	public void testCase2() {
		System.out.println("Executing test case 2...");
	}

	@Test(dataProvider = "loginData", groups = {"regression","sanity"},priority = 2)
	public void loginTest(String username, String password, String securityAnswer) {
		System.out.println("Executing test case 3 with data: " + username + ", " + password + ", " + securityAnswer);
		System.out.println("Test case 3 executed successfully.");
	}
	
	@Test(groups = {"regression"}, priority = 1, timeOut = 3000)
	public void testCase4() {
		System.out.println("Executing test case 4...");
		try {
			Thread.sleep(2000); // Simulating a delay
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Execution of test case 4 is completed...");
	}
	
	@Test (retryAnalyzer = RetryTest.class)
	public void testCase5() {		
		System.out.println("Step1");
		System.out.println("Step2");
		Assert.fail("Failing test case 5 due to  << Data Issue >>");
		System.out.println("Step3");
		System.out.println("Step4");		
	}
}
