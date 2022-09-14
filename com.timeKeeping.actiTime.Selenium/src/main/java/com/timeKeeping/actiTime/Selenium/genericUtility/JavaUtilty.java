package com.timeKeeping.actiTime.Selenium.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
/**
 * 
 * @author Akash
 *
 */
public class JavaUtilty {
	/**
	 * This method generates random no
	 * @param limit
	 * @return
	 */
	public int generateRandomNo(int limit) {
		Random random=new Random();
		return random.nextInt(limit);
	}
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/PropertyData.properties");
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty(key);
		
	}

}
