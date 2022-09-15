package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/selenium10amBatch.html");

		Point usernameLocation = driver.findElement(By.id("id1")).getLocation();
		Point passwordLocation = driver.findElement(By.id("id2")).getLocation();

		int usernameStartX = usernameLocation.getX();
		int passwordStartX = passwordLocation.getX();
		
		System.out.println("Username StartX : "+usernameStartX);
		System.out.println("Password StartX : "+passwordStartX);
		
		if(usernameStartX == passwordStartX) {
			System.out.println("Pass: Allignment is verified");
		}
		else
			System.out.println("Fail: Allignment is not verified");

		driver.quit();


	}

}
