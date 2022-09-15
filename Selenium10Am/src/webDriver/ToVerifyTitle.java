package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToVerifyTitle {

	public static void main(String[] args) {
		String expectedTitle = "Shopping";
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//Openning the browser
		WebDriver driver=new FirefoxDriver();
		//Enter the URL
		driver.get("https://www.flipkart.com/");
		String actualTitle = driver.getTitle();
		System.out.println("Actaul Title : "+actualTitle);
		System.out.println("Expected Title : "+expectedTitle);
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: Title is verified");
		}
		else
			System.out.println("Fail: Title is not verified");

		driver.switchTo().fr
	}
	
	
	
	}


