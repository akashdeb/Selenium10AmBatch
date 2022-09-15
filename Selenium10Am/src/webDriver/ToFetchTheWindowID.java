package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTheWindowID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String googleWindowID = driver.getWindowHandle();
		System.out.println(googleWindowID);
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/");
		String googleWindowID2 = driver1.getWindowHandle();
		System.out.println(googleWindowID2);
	}

}
