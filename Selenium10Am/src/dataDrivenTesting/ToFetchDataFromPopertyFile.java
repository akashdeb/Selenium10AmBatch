package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPopertyFile {

	public static void main(String[] args) throws IOException {
		//the actual representation of property file is converted to java representation
		FileInputStream fis=new FileInputStream("./testData/PropertyDataFor10AM.properties");
		//creating an object of properties class 
		Properties property = new Properties();
		//we are load all the keys and values
		property.load(fis);
		//fetching the value using the key
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		//we are pring the values on the console
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);


		

	}

}
