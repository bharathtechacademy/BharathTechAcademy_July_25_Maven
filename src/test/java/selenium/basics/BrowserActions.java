package selenium.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
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
		driver.navigate().to("https://www.selenium.dev/");		
		
//		9. Go back to previous application		
		driver.navigate().back();
		
//		10. Move forward to next application 
		driver.navigate().forward();
		
//		11. Refresh the application  
		driver.navigate().refresh();
		
//		12.collect the main window id (window handle id)    
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Main Window Handle ID: " + mainWindowHandle);
		
//		13.Launch new tab and Launch the application in new tab (https://in.search.yahoo.com/)  		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.search.yahoo.com/");
		System.out.println("New Tab Handle ID: " + driver.getWindowHandle());
		
//		14. Switch back to the main window
		driver.switchTo().window(mainWindowHandle);
		
//		15.Launch new window and Launch the application in new window (https://parabank.parasoft.com/parabank/index.htm)  
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		System.out.println("New Window Handle ID: " + driver.getWindowHandle());
		
//		16.Switch back to main window  
		driver.switchTo().window(mainWindowHandle);
		
//		17.Print browser window URL 
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current Browser URL: " + currentURL);
		
//		18. Get the Size of window   
		int windowWidth = driver.manage().window().getSize().getWidth();
		int windowHeight = driver.manage().window().getSize().getHeight();		
		System.out.println("Current Browser Window Size: " + windowWidth + "X" + windowHeight);  
		
//		19. Close Current Window   
		driver.close();
		
//		20. Close all remaining windows
		driver.quit();

	}

}
