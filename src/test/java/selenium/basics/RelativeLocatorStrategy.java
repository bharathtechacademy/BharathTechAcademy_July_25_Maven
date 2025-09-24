package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorStrategy {
	
	// RelativeLocator.with(targetElementLocator).DIRECTION(referenceElementLocator)
	
	// DIRECTION's can be above, below, LeftOf, RightOf, near

	public static void main(String[] args) {

		// 1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// 2: Maximize the browser window to full screen
		driver.manage().window().maximize();

		// 3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();

		// 4: Open Google India homepage
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		// 5: Locate the 'Services' link using relative locator - Syntax 1
		driver.findElement(RelativeLocator.with(By.linkText("Services")).below(By.linkText("About Us")));
		driver.findElement(RelativeLocator.with(By.linkText("Services")).below(By.linkText("Products")));

	}

}
