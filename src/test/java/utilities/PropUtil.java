package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	public static Properties readData(String filename) throws IOException {
		
		Properties prop = new Properties();
		
		//Read the property file from specific location
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+filename);
		
		// Copy the date from the file and store it into 'prop' variable
		prop.load(fis);
		
		return prop;
		
	}

}
