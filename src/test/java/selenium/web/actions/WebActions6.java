package selenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebActions6 {

	public static void main(String[] args) {
		//1.Launch Chrome Browser        
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window 
		driver.manage().window().maximize();
		
		//3.Launch the application    (https://jqueryui.com/slider/)  		
		driver.get("https://jqueryui.com/slider/");
					
		//4. Switch to Frame from main window to access slider	
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//5. Identify the slider element
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
		
		//6. Locate the slider handle
		WebElement sliderHandle = slider.findElement(By.xpath("//span[contains(@class,'slider-handle')]"));
		
		//7. Move the slider handle to the right by 200 pixels
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(sliderHandle, 200, 0).perform();
		
		//7. Move the slider handle to the left by 100 pixels
		actions.dragAndDropBy(sliderHandle, -100, 0).perform();
		actions.dragAndDropBy(sliderHandle, -100, 0).perform();				
		
		//7.Close browser window
		driver.quit();
	}

}
