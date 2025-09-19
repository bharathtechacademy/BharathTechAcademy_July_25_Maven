package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {

		// 1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// 2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
		// 3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
		// 4: Open Google India homepage
		driver.get("https://www.google.com/");
		
		// 5: Locate the search box using ID locator
		driver.findElement(By.id("APjFqb"));
		
		// 6: Locate the search box using name locator
		driver.findElement(By.name("q"));
		
		// 7: Locate the search box using Class Name locator
		driver.findElement(By.className("gLFyf"));
		
		// 8: Locate the search box using Tag Name locator
		driver.findElement(By.tagName("textarea"));		
		
		// 9: Locate the 'How Search Works' using linkText locator
		driver.findElement(By.linkText(" How Search works "));		
		
		// 10: Locate the 'How Search Works' using partialLinkText locator
		driver.findElement(By.partialLinkText("How Search"));		


	}

}
