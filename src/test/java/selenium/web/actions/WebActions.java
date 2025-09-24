package selenium.web.actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebActions {
	
	//Buttons, Textbox, Dropdown, Checkbox, Radio-button, Hyperlink, Text/Labels, Scrollbar, Images, Calendar,  WebTables, Alerts, Frames

	public static void main(String[] args) throws IOException {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Launch the application
		driver.get("https://example.com");
		
// 		5. Locate the WebElement
//		By loc =By.xpath("//button[@id='submit']");
		WebElement element = driver.findElement(By.xpath("//button[@id='submit']"));
		
		/********** Common WebElement Actions **********/
		
		// Check if the element is displayed on the page
		boolean isDisplayed = element.isDisplayed();
		
		// Check if the element is enabled on the page
		boolean isEnabled = element.isEnabled();
		
		// Check if the element is selected already on the page
		boolean isSelected =  element.isSelected();
		
		/************* Element Specific Actions *************/
		
		/********** Button Element **********/
		//Locate the button WebElement
		WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
		
		// Verify the label of the button
		String label1 = button.getAttribute("value"); // If the label is added as an attribute value
		String label2 = button.getText(); //if the label is added as a text value
		
		// Click on the button.
		button.click();
		
		Actions actions = new Actions(driver);
		// Double-click on the button.
		actions.doubleClick(button).perform();
		
		// Right-click on the button.
		actions.contextClick(button).perform();
		
		// Mouse hover on the button.
		actions.moveToElement(button).perform();
		
		// Drag and drop the button.
		actions.dragAndDrop(element, button).perform();
		
		// Click on the hidden button
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);
		
		// Type on the disabled/hidden textbox
		js.executeScript("arguments[0].value='Bharath'", element);
		
		// Scroll down to the element.
		js.executeScript("arguments[0].scrollIntoView(true)", button);
		
		/********** Textbox Element **********/
		//Locate the textbox WebElement
		WebElement textbox = driver.findElement(By.xpath("//input[@id='submit']"));
		
		// Clear the text box.
		textbox.clear();
		
		// Verify the placeholder added in the text box.
		String placeholder =textbox.getAttribute("placeholder");
		
		// Type the text into the text box.
		textbox.sendKeys("Bharath");
		
		// Type the text into the text box using actions class
		actions.sendKeys(textbox, "Selenium").sendKeys(Keys.ENTER).perform();
		
		/********** Dropdown Element **********/		
		//Locate the dropdown WebElement
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='submit']"));
		
		// Verify whether dropdown is single selection or multi-select dropdown.
		Select select = new Select(dropdown);
		boolean isMultiSelect = select.isMultiple();
		
		// Verify the first isSelected option within the drop-down.
		String selectedOption = select.getFirstSelectedOption().getText();
		
		// Select a specific option from the drop-down.
		select.selectByIndex(0); //select first option
		select.selectByVisibleText("Volvo");
		select.selectByValue("volvo");
		
		// Verify all the options available in the drop-down.
		List<WebElement> options = select.getOptions();
		for(WebElement option :options) {
			System.out.println(option.getText());
		}
		
		// If drop-down is multi-select, then select and de-select the options.
		select.selectByIndex(0); //select first option
		select.selectByVisibleText("Volvo");
		select.selectByValue("volvo");
		
		select.deselectByIndex(0); //select first option
		select.deselectByVisibleText("Volvo");
		select.deselectByValue("volvo");
		
		/********** Checkbox Element **********/		
		
		//Locate the checkbox WebElement
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='submit']"));
		
		// Check if the element is selected already on the page
		boolean isChecked =  checkbox.isSelected(); 
		
		// If the checkbox is not selected, then click on the checkbox.
		if(!isChecked) {
			checkbox.click();
		}
		
		/********** Radiobutton Element **********/
		//Locate the radiobutton WebElement
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='submit']"));
		
		// Click on radio button
		radiobutton.click();
		
		/********** Image Element **********/
		//Locate the image WebElement
		WebElement image = driver.findElement(By.xpath("//img[@id='submit']"));
		
		// Verify if the image is displayed.
		boolean isImageDisplayed = image.isDisplayed();
		
		// Verify whether the correct image is displayed.
		String sourceLink = image.getAttribute("src");
		
		// Verify the size or resolution of the image.
		int imageWidth = image.getSize().getWidth();
		int imageHeight = image.getSize().getHeight();
		
		// Verify the position of the image.
		int imageX = image.getLocation().getX();
		int imageY = image.getLocation().getY();
		
		// Verify the color of a specific pixel within the image.
		int pixelColor = ImageIO.read(new File(sourceLink)).getRGB(imageX, imageY);
		
		/********** HyperLink Element **********/
		// Locate the Hyper Link WebElement
		WebElement link = driver.findElement(By.xpath("//img[@id='submit']"));
		
		// Label of the hyperlink.
		String linkText = link.getText();
		
		// Verify the link integrated with hyperlink/ verify link is working as per the expectation. 
		
		// (method 1)
		String url = link.getAttribute("href");
		
		// (method 2)
		link.click();
		String url2 = driver.getCurrentUrl();
		
		/********** Text / Label Element **********/
		// Locate the Hyper Link WebElement
		WebElement label_text = driver.findElement(By.xpath("//div[@id='submit']"));
				
		String text1 = label_text.getAttribute("value"); // If the label is added as an attribute value
		String text2 = label_text.getText(); //if the label is added as a text value
		
		
		/********** Calendar Element **********/
		// Verify the calendar is displayed
		// Select a date from the calendar
		
		/********** WebTable Element **********/
		// Verify the webtable is displayed
		// Get the column headers in the webtable
		// Get the number of rows and columns in the webtable
		// Get the text from a specific cell in the webtable
		
		/********** Alerts Element **********/
		
		//Verify if the alert is displayed within the web page.
		
		//Switch to the alert.
		Alert alert = driver.switchTo().alert();
		
		// Accept the alert
		alert.accept();
		
		// Dismiss the alert
		alert.dismiss();
		
		// Copy text from alert
		alert.getText();
		
		// Enter text into Alert
		alert.sendKeys("Text");
		
		/********** Frame Element **********/
		
		// Switch to frame from the main browser window.
		driver.switchTo().frame(0); //using index
		driver.switchTo().frame("id or name"); //using index
		driver.switchTo().frame(driver.findElement(By.xpath(""))); //using index
		
		// Switch back to the main window
		driver.switchTo().defaultContent();
		
				
		
	}

}
