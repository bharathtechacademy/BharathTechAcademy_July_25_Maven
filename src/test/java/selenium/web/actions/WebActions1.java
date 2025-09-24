package selenium.web.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebActions1 {

	public static void main(String[] args) throws InterruptedException {
//		1. Launch the Chrome browser window
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL "https://parabank.parasoft.com/parabank" and Launch the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Verify application title
		String expectedTitle ="ParaBank | Welcome | Online Banking";
		String actualtitle = driver.getTitle();
		
//		6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
		
//		7. Verify application caption " Experience the difference"		
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		Assert.assertEquals(caption.getText(), "Experience the difference", "Caption does not match");
		
//		8. Enter Invalid credentials in Username (Invalid User) and Password (Empty) textboxes
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		username.sendKeys("Invalid User");
		password.clear();
		
//		9. Click on Login Button		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();
		
//		10. Verify error message is displayed (Please enter a username and password.)
//		Thread.sleep(2000); // Wait for 2 seconds to allow error message to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		
		WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error']"));
		Assert.assertEquals(errorMessage.getText(), "Please enter a username and password.", "Error message does not match");
		
//		11. Click on Adminpage link
//		12. Wait for admin page
//		13. Select Data access mode as ' SOAP'
//		14. Scrolldown till Loan provider
//		15. Select Loanprovider as 'Web Service'
//		16. Click on Submit button
//		17.wait for Successful submission message
//		18.Click on Services Link
//		19.Wait for Services page
//		20.Scrolldown till Bookstore services
//		21.Get total rows, columns in the bookstore service table
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
//		24.Close browser window
		driver.quit();

	}

}
