package selenium.web.actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions5 {

	public static void main(String[] args) throws IOException {
		//1.Launch Chrome Browser        
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window 
		driver.manage().window().maximize();
		
		//3.Launch the application    (https://demoqa.com/frames)  		
		driver.get("https://demoqa.com/frames");
		
		//4.Locate elements 'Frames' header in main window and 'This is a sample page' inside the frame  
		WebElement mainHeader = driver.findElement(By.xpath("//h1[@class='text-center']"));
		
		//Locate Logo element
		WebElement logoElement = driver.findElement(By.xpath("//img[contains(@src, 'Toolsqa')]"));
		getScreenshot(logoElement, "Logo");
		
		//Switch to Frame 1 from main window		
		driver.switchTo().frame("frame1");
		
		//Locate frame element
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
		//5.Print frame element text
		System.out.println("Frame Element Text: " + frameElement.getText());
		
		//Switch back to main window from frame
		driver.switchTo().defaultContent();
		
		//6.Print main window element text 		
		System.out.println("Main Window Element Text: " + mainHeader.getText());
		
		//Take screenshot of complete page
		getScreenshot(driver, "CompletePage");
		
		//7.Close browser window
		driver.quit();
	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + ".png";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(destination));
		return destination;
	}
	
	public static String getScreenshot(WebElement element, String screenshotName) throws IOException {
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + ".png";
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(destination));
		return destination;
	}

}
