package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURL {

	public static void main(String[] args) {
		String expectedUrl = "flipkart";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL : "+actualUrl);
		System.out.println("Expected URL : "+expectedUrl);
		
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("Pass: URL is verified");
		}
		else
			System.out.println("Fail: URL is not verified");
	}

}
