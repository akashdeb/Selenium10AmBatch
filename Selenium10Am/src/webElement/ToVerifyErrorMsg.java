package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Username";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		String actualErrorMsg = driver.findElement(By.xpath("//span[contains(text(), 'Username')]")).getText();
		if(actualErrorMsg.contains(expectedErrorMsg)) {
			System.out.println("Pass: Error message is Verified");
		}
		else
			System.out.println("Failed: Error message is not Verified");

		driver.quit();
	}

}
