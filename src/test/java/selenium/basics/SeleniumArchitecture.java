package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumArchitecture {
	
	
	//1. Browser
	//2. Selenium client libraries
	//3. Browser driver
	//4. W3C Protocol

	public static void main(String[] args) {
		
		//Launch the chrome Browser Window
		WebDriver driver = new ChromeDriver();
		
		//Launch the Application
		driver.get("https://www.selenium.dev/");
		
		//Close the browser
		driver.close();

	}

}


/*

POST /session
Content-Type: application/json

{
  "capabilities": {
    "alwaysMatch": {
      "browserName": "chrome"
    }
  }
}


{
  "value": {
    "sessionId": "12345-67890",
    "capabilities": {
      "browserName": "chrome",
      "browserVersion": "128.0",
      "platformName": "windows"
    }
  }
}


POST /session/{sessionId}/url
Content-Type: application/json

{
  "url": "https://www.selenium.dev/"
}


{
  "value": null
}


DELETE /session/{sessionId}/window

{
  "value": null
}




*/