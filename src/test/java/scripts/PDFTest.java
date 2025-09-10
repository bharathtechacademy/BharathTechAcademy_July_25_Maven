package scripts;

import utilities.PdfUtil;

public class PDFTest {

	public static void main(String[] args) {
		String page2Text = PdfUtil.getText("Data.pdf", 1, 3);
		System.out.println(page2Text);
	}

}
