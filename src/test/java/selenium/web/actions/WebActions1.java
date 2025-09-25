package selenium.web.actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebActions1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//		1. Launch the Chrome browser window
		driver = new ChromeDriver();
		
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
		WebElement adminPageLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPageLink.click();
		
//		12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		
//		13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");
		
//		14. Scrolldown till Loan provider
		WebElement loanProvider = driver.findElement(By.xpath("//select[@id='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", loanProvider);
		
//		15. Select Loanprovider as 'Web Service'
		Select selectLoanProvider = new Select(loanProvider);
		selectLoanProvider.selectByVisibleText("Web Service");
		
//		16. Click on Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//		17.wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		
//		18.Click on Services Link
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();
		
//		19.Wait for Services page		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//		20.Scrolldown till Bookstore services
		WebElement bookstoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", bookstoreServices);
		
//		21.Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr[1]//td"));
		int totalRows = rows.size();
		int totalColumns = columns.size();
		System.out.println("Total rows in bookstore services table: " + totalRows);
		System.out.println("Total columns in bookstore services table: " + totalColumns);
		
//		22.Get Column headers of book store services table
		for (WebElement column : columns) {
			System.out.println(column.getText());
		}
		System.out.println("==================================");
		
//		23.Get all the data from book store service table		
		for (int r = 1; r <= totalRows; r++) {
			for (int c = 1; c <= totalColumns; c++) {
				WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr["+r+"]//td["+c+"]"));
				System.out.println("ROW "+r+" COLUMN "+c+" Value is : "+cell.getText()+"");
			}
		}
		
//		24.Close browser window
		driver.quit();

	}
	
	public static void selectDataAccessMode(String option) {
		WebElement dataAccessMode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
		dataAccessMode.click();		
	}

}
