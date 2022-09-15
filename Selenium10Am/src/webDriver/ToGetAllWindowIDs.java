package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllWindowIDs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//Clicking action on the actitime link
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		//Getting the parent window id
		String parentID = driver.getWindowHandle();
		//Getting all the window id
		Set<String> allWindowIDs = driver.getWindowHandles();
		System.out.println("Parent ID : "+parentID);
		System.out.println("All Ids : "+allWindowIDs);
	}

}
