package interfaces;

public class ChromeDriver implements WebDriver,Selenium{


	@Override
	public void click() {
		System.out.println("Click method from Interface1 is implemented in RegularClass2");
		
	}

	@Override
	public void get(String URL) {
		System.out.println("Get method from Interface1 is implemented in RegularClass2");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh method from Interface1 is implemented in RegularClass2");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("SendKeys method from Interface2 is implemented in RegularClass2");
		
	}

	@Override
	public void clear() {
		System.out.println("Clear method from Interface2 is implemented in RegularClass2");
		
	}



}
