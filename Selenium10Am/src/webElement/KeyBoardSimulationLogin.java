package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulationLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTxtField = driver.findElement(By.id("username"));
		usernameTxtField.sendKeys("trainee");
		Thread.sleep(2000);
		usernameTxtField.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		usernameTxtField.sendKeys(Keys.CONTROL, "c");
		Thread.sleep(2000);
		WebElement passwordTxtField = driver.findElement(By.name("pwd"));
		passwordTxtField.sendKeys(Keys.CONTROL, "v");
		Thread.sleep(2000);
		passwordTxtField.sendKeys(Keys.ENTER);
	}

}
