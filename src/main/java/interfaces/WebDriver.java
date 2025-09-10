package interfaces;

public interface WebDriver {

	public abstract void click();

	public abstract void get(String URL);

	public void refresh();
	
	public default void getChatGPT() {
		getGeminiPro();
		System.out.println("Overridden in EdgeDriver class");
		getGeminiPro();
	}
	
	public static void getAI() {
		System.out.println("Static method from WebDriver");
	}
	
	private void getGeminiPro() {
		System.out.println("New method added in WebDriver");
		System.out.println("Implemented in WebDriver interface");
	}

}
