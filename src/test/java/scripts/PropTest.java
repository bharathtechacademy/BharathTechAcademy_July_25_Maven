package scripts;

import java.io.IOException;
import java.util.Properties;

import utilities.PropUtil;

public class PropTest {

	public static void main(String[] args) throws IOException {
		Properties prop = PropUtil.readData("Config.properties");
		System.out.println(prop.getProperty("APP_URL"));
		System.out.println(prop.getProperty("USERNAME"));
	}

}
