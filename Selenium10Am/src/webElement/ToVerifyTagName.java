package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) {
		String expectedUsernameTagName = "input";
		String expectedPasswordTagName = "input";
		String expectedLoginButtonTagName = "div";

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actaulUsernameTagName = driver.findElement(By.id("username")).getTagName();
		String actaulPasswordTagName =driver.findElement(By.name("pwd")).getTagName();
		String actualLoginButtonTagName=driver.findElement(By.xpath("//div[text()='Login ']")).getTagName();
		
		System.out.println("Username TagName : "+actaulUsernameTagName);
		System.out.println("Password TagName : "+actaulPasswordTagName);
		System.out.println("Login Button TagName : "+actualLoginButtonTagName);
		
		if(actaulUsernameTagName.equals(expectedUsernameTagName)) {
			driver.findElement(By.id("username")).sendKeys("admin");
		}
		if(actaulPasswordTagName.equals(expectedPasswordTagName)) {
			driver.findElement(By.name("pwd")).sendKeys("manager");
		}
		if(actualLoginButtonTagName.equals(expectedLoginButtonTagName)) {
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}
		else
			System.out.println("Tag names are not matching");
		driver.quit();
	}

}
