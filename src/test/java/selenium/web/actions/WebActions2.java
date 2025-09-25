package selenium.web.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//1. Launch browser window(Chrome)      
		driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3. Delete all the cookies       
		driver.manage().deleteAllCookies();
		
		//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)        
		driver.get("https://demoqa.com/automation-practice-form");
		
		//5. Wait for Page-load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[text()='Practice Form']"), 0));
		
		//6. Enter First name and Last name  
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		firstName.sendKeys("Bharath");
		lastName.sendKeys("Reddy");
		
		//7. Enter Email		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));		
		email.sendKeys("BharathTechAcademy@gmail.com");
		
		//8. Select Gender (Male) 		
		selectGender("Male");
		
		//9. Enter mobile number  		
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9876543210");
		
		//10.Select DOB (1-Feb-1991)   		
		selectDOB("1", "February", "1991");
		
		//11.Search and Select Computer Science   
		selectSubject("Computer Science");
		
		//12.Select Hobbies as Sports and Reading 		
		String[] hobbies = {"Sports", "Reading"};
		selectHobbies(hobbies);
		
		//13.Upload photo    
		WebElement uploadPicture = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadPicture.sendKeys(System.getProperty("user.dir")+"\\Files\\Photo.png");
              
		//14.Submit Details  		
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitButton);	
		
		//15. Close browser window
//		driver.quit();

	}
	
	public static void selectSubject(String subject) {
		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));	
		
		Actions actions = new Actions(driver);
		actions.sendKeys(subjectInput, subject).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[contains(@class,'option') and text()='"+subject+"']"), 0));
		
		WebElement subjectOption = driver.findElement(By.xpath("//div[contains(@class,'option') and text()='"+subject+"']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", subjectOption);	
	}
	
	
	public static void selectGender(String gender) {
		WebElement genderRadioButton = driver.findElement(By.xpath("//label[text()='"+gender+"']"));
		genderRadioButton.click();
	}
	
	public static void selectDOB(String date, String month, String year) {
		//Launch the DOB calendar
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		
		//Locate the month dropdown and select the month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectMonth = new Select(monthDropdown);
		selectMonth.selectByVisibleText(month);
		
		//Locate the year dropdown and select the year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText(year);
		
		//Select the date		
		////div[text()='1' and contains(@aria-label,'January')]
		WebElement datePicker = driver.findElement(By.xpath("//div[text()='"+date+"' and contains(@aria-label,'"+month+"')]"));
		datePicker.click();
	}
	
	public static void selectHobbies(String[] hobbies) {
		for (String hobby : hobbies) {
			WebElement hobbyCheckbox = driver.findElement(By.xpath("//label[text()='" + hobby + "']"));
			if (!hobbyCheckbox.isSelected()) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", hobbyCheckbox);	
			}
		}
	}
	
	

}
