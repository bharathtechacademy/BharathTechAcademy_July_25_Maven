package interfaces;

public class EdgeDriver implements WebDriver,Selenium{

	

	@Override
	public void sendKeys(String value) {
		System.out.println("SendKeys method from Interface2 is implemented in RegularClass3");
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(String URL) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getChatGPT() {
		System.out.println("IMplemented getChatGPT method in EdgeDriver class");
	}

}
