package assignments;

public class Assignment20_ReadPdf {

	public static void main(String[] args) {
		String page2Text = PdfUtil.getText("Transactions.pdf", 1, 1);
		String [] values = page2Text.split(" ");
		
		double totalAmount = 0.0;

        for (String val : values) {
            try {
                // Try to parse each value as double
                double amount = Double.parseDouble(val);
                totalAmount += amount;
                System.out.println("Amount found: " + amount);
            } catch (NumberFormatException e) {
                // Ignore non-numeric values
            }
        }

        System.out.println("-------------------------");
        System.out.println("Total Amount: ₹ " + totalAmount);

	}

}
