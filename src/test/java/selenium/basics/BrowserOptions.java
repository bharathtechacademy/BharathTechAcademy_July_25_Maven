package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

	public static void main(String[] args) {
//		Add browser options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); // To maximize the browser window
		options.addArguments("--incognito"); // To open browser in incognito/private mode
		options.addArguments("--disable-notifications"); // To disable browser notifications
		options.addArguments("--headless"); // To run browser in headless mode (without UI)
		options.addArguments("--disable-popup-blocking"); // To disable popup blocking
		
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver(options);	
		
//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies   
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   
		driver.get("https://www.google.co.in/");
		
		System.out.println("Application is launched successfully. Title is: " + driver.getTitle());
		
//		5. Close browser window
		driver.quit();

	}

}
