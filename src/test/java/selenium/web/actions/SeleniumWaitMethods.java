package selenium.web.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitMethods {
	
	// Different Wait Methods in Selenium
	
	// 1. Implicit Wait  => Applies to all elements in the script
	// 2. Explicit Wait => Applies to a specific element and a specific condition
	// 3. Fluent Wait => Similar to Explicit wait but with polling frequency and ignoring specific exceptions

	public static void main(String[] args) {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Launch the application
		driver.get("https://example.com");
		
// 		5. Locate the WebElement
		WebElement element = driver.findElement(By.xpath("//button[@id='submit']"));
		
//		6. implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		7. explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
//		8. fluent wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5));
		fluentWait.until(ExpectedConditions.visibilityOf(element));
	}

}
