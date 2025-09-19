package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
	
	// CSS Locators ==>CSS selector locators are a pattern that is used to select the element based on the CSS properties of your web element.
	
	// CSS Selector Locator Syntax 1: tagName#id
	// CSS Selector Locator Syntax 2: tagName.className
	// CSS Selector Locator Syntax 3: tagName[attribute='attributeValue']
	// CSS Selector Locator Syntax 4: Advanced CSS locators with relationship between different elements. ==> ancestor > parent > child 

	public static void main(String[] args) {
		
		/// 1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// 2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
		// 3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
		// 4: Open Google India homepage
		driver.get("https://www.google.com/");
				
		// 5: Locate the search box using cssSelector locator - Syntax 1
		driver.findElement(By.cssSelector("textarea#APjFqb"));
		
		// 6: Locate the search box using cssSelector locator - Syntax 2
		driver.findElement(By.cssSelector("textarea.gLFyf"));
		
		// 7: Locate the search box using cssSelector locator - Syntax 3
		driver.findElement(By.cssSelector("textarea[title='Search']"));

	}

}
