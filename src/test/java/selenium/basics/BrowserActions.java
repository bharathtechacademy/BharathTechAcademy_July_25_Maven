package selenium.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserActions {

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver();	
		
//		2. Minimize browser window    
		driver.manage().window().minimize();
		
//		3. Maximize to specific resolution(800X400)  
		driver.manage().window().setSize(new Dimension(430,932));		
		
//		4. Maximize the browser window   
		driver.manage().window().maximize();
		
//		5. Delete all browser cookies   
		driver.manage().deleteAllCookies();
		
//		6. Enter URL and Launch the Application (https://www.google.co.in/)   
		driver.get("https://www.google.co.in/");
		
//		7. Verify the application title (Google)
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("Application is launched successfully. Title is verified: " + actualTitle);
//		} else {
//			System.out.println("Application launch failed or title is not verified. Actual Title: " + actualTitle);
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle, "Application launch failed or title is not verified.");
		
//		8. Navigate to Different application (https://www.selenium.dev/)
		
		
//		9. Go back to previous application
//		10. Move forward to next application 
//		11. Refresh the application  
//		12.collect the main window id     
//		13.Launch new tab and Launch the application in new tab (https://in.search.yahoo.com/)   
//		14. Switch back to the main window
//		15.Launch new window and Launch the application in new window (https://parabank.parasoft.com/parabank/index.htm)  
//		16.Switch back to main window  
//		17.Print browser window URL  
//		18. Get the Size of window     
//		19. Close Current Window   
//		20. Close all remaining windows

	}

}
