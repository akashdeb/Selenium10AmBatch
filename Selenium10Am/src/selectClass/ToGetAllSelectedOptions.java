package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		Select select=new Select(driver.findElement(By.id("cars")));
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Saab");
		select.selectByVisibleText("Audi");
		
		List<WebElement> allOptions = select.getAllSelectedOptions();
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
		System.out.println("=====================================");
		System.out.println("First Selected Option is "+select.getFirstSelectedOption().getText());
		
	}

}
