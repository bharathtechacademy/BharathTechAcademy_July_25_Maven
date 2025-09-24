package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	// XPath ==> XML Path Language
	// Xpath Locators are 2 types:
	// 1: Absolute Xpath: It is the complete path of the element from the root
	// element to the target element. ==> Starts with a single forward slash (/)
	// 2: Relative Xpath: It is the partial path of the element from any element to
	// the target element. ==> Starts with a double forward slash (//)

	// Syntaxes of Relative Xpath

	/**************** BASIC - LEVEL 1 *******************/
	// Syntax 1: //tagname[@attribute='attribute-value']
	// Syntax 2: //tagname[text()='text-value']

	/**************** LEVEL 2 - with contains / starts-with *******************/
	// Syntax 3: //tagname[contains(@attribute, 'partial-value')]
	// Syntax 4: //tagname[contains(text(), 'partial-value')]

	// Syntax 5: //tagname[starts-with(@attribute, 'partial-value-starts-with')]
	// Syntax 6: //tagname[starts-with(text(), 'partial-value-starts-with')]

	/***************** LEVEL 3 - combine multiple attributes & text values using 'and' operator *******************/
	// Syntax 7: //tagname[@attribute1='value1' and @attribute2='value2' and text()='text-value']

	/****************LEVEL 4 - Advanced Xpaths with Relationships*******************/	
	// Syntax 8: referenceElement/relationship::targetElement

	// child
	// parent
	// ancestor
	// following-sibling
	// preceding-sibling
	// following
	// preceding
	// ==> with in the family
	// / ==> child
	
	// ancestor-parent /child:: ancestor /child:: parent /child::target-sibling /child:: target 
	
	//ancestor: //ul[@class='leftmenu']
	//parent: //li
	//sibling : NA
	//target : //a[text()='Services']
	
	//ul[@class='leftmenu']//a[text()='Services']	
	//ul[@class='leftmenu']/child::li/child::a[text()='Services']
	//li[text()='Solutions']/following-sibling::li/child::a[text()='Services']
	
	public static void main(String[] args) {

		// 1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// 2: Maximize the browser window to full screen
		driver.manage().window().maximize();

		// 3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();

		// 4: Open Google India homepage
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		// 5: Locate the 'Logo' using Xpath locator - Syntax 1
		driver.findElement(By.xpath("//img[@class='logo']"));

		// 6: Locate the 'caption' using Xpath locator - Syntax 2
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));

		// 7: Locate the 'Logo' using Xpath locator - Syntax 3
		driver.findElement(By.xpath("//img[contains(@src,'logo')]"));

		// 8: Locate the 'caption' using Xpath locator - Syntax 4
		driver.findElement(By.xpath("//p[contains(text(),'difference')]"));

		// 9: Locate the 'Logo' using Xpath locator - Syntax 5
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo')]"));

		// 10: Locate the 'caption' using Xpath locator - Syntax 6
		driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));

		// 11: Locate the 'caption' using Xpath locator - Syntax 7
		driver.findElement(By.xpath("//p[@class='caption' and text()='Experience the difference']"));
		
		// 12: Locate the 'Services' link using xpath locator - Syntax 8
		driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
	}

}
