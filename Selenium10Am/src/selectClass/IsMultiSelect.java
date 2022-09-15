package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement element = driver.findElement(By.id("cars"));
		Select select=new Select(element);
		boolean multiple = select.isMultiple();
		if(multiple) {
			System.out.println("Pass: The dropdown is multi-select");
		}
		else
			System.out.println("Fail: The dropdown is single-select");
		
		driver.quit();
		

	}

}