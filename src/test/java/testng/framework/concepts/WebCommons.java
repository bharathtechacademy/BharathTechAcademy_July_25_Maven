package testng.framework.concepts;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class WebCommons {
	
	@BeforeSuite(alwaysRun = true)
	public void startReporting() {
		System.out.println("Reporting process started.....");
	}
	
	@AfterSuite(alwaysRun = true)
	public void stopReporting() {
		System.out.println("Reporting process stopped and Report generated.....");
	}
	
	@BeforeMethod(alwaysRun = true)
	@Parameters({"BROWSER","URL"})
	public void launchBrowserAndApplication(String browser, String url) {
		System.out.println(browser+" is launched...");
		System.out.println(url+" is launched...");
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed....");
	}
	
	
	@DataProvider(name="loginData")
	public String[][] data(Method method) {
		System.out.println("Data provider method is called for "+method.getName());
		String[][] data = { 
				{ "User1", "Pass1", "Answer1" }, 
				{ "User2", "Pass2", "Answer2" },
				{ "User3", "Pass3", "Answer3" } 
				};
		return data;
	}

}
