package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorAdvanced {
	
	// CSS Selector Locator Syntax 4: Advanced CSS locators with relationship between different elements. ==> ancestor > parent > child 
	
	// ancestor-parent > ancestor > parent > target 
	
	
	//ancestor: ul[class='leftmenu']
	//parent: li
	//target: a[href='services.htm']
	
	// ul[class='leftmenu'] > li >  a[href='services.htm']
	// ul[class='leftmenu'] > li >  a:nth-child(1)

	public static void main(String[] args) {
		
		// 1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// 2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
		// 3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
		// 4: Open Google India homepage
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
				
		// 5: Locate the 'Services' link using cssSelector locator - Syntax 4
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li >  a[href='services.htm']"));


	}

}
