package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyUsingId {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		  
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		
		usernameTextField.sendKeys("admin");
		Thread.sleep(2000);
		passwordTextField.sendKeys("manager");
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkBox.click();
	}

}
