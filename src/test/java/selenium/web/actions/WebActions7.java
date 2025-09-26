package selenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions7 {

	public static void main(String[] args) {
		//1.Launch Chrome Browser        
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window 
		driver.manage().window().maximize();
		
		//3.Launch the application    (https://books-pwakit.appspot.com/)  		
		driver.get("https://books-pwakit.appspot.com/");
		
		WebElement searchBook1 = driver.findElement(By.cssSelector("input#input"));
		searchBook1.sendKeys("Selenium");
					
		//4. Locate the Shadow Host element
		WebElement shadowHost = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
		
		//5. Access the Shadow Root with in the Shadow DOM
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		
		//6. Locate the app-header element within the Shadow Root
		WebElement appHeader = shadowRoot.findElement(By.cssSelector("app-header"));
		
		//7. Locate the search book element within the app-header
		WebElement searchBook = appHeader.findElement(By.cssSelector("input#input"));
		searchBook.sendKeys("Selenium");
		
		//8.Close browser window
		driver.quit();
		
	}

}
