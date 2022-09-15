package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseContainsFunction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String text1 = driver.findElement(By.xpath("//td[contains(text(), 'Please')]")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("//input[contains(@title, 'Do')]")).click();
		System.out.println("Clicked on the check box");
		String text2 = driver.findElement(By.xpath("//nobr[contains(., 'actiTIME')]")).getText();
		System.out.println(text2);
	}

}
