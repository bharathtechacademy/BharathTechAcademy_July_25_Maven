package interfaces;

public class RegularClass1 extends AbsClass1{

	public static void main(String[] args) {
		

	}

	@Override
	public void click() {
		System.out.println("Click the button");
		
	}

	@Override
	public void get(String URL) {
		System.out.println("Get the URL: " + URL);		
	}

}
