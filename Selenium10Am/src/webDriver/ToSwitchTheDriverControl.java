package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//Fetching parent window id
		String parentWindowId = driver.getWindowHandle();
		//clicking on the actitime link
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		//Fetching all the window IDs
		Set<String> allWindowIDs = driver.getWindowHandles();
		for(String windowId:allWindowIDs) {
			//Switching any window
			driver.switchTo().window(windowId);
			if(!windowId.equals(parentWindowId)) {
				driver.findElement(By.linkText("Try Free")).click();
				break;
			}
		}
	}

}
