package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		Select select=new Select(driver.findElement(By.id("cars")));
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		select.selectByValue("saab");
		Thread.sleep(2000);
		select.deselectByVisibleText("Saab");
		Thread.sleep(2000);
		select.deselectAll();
		

	}

}
