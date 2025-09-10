package exceptionHandling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {
		String[] empNames = new String[3];
		try {
			empNames[0] = "Bharath";
			empNames[1] = "ABC";
			empNames[2] = "XYZ";
			empNames[3] = "KGF";
		} catch (Exception e) {
			System.out.println("Exception occured, please check the code once");
			System.out.println(e.getMessage());
			empNames[3] = "RRR";
		} finally {
			System.out.println("Execution Completed");
		}
		
	}

}
