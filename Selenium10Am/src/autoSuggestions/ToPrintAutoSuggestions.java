package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[text()='selenium']"));
		System.out.println("The number of AutoSuggestions is : "+autoSuggestions.size());
		for(WebElement suggestion:autoSuggestions) {
			System.out.println(suggestion.getText());
		}
	}

}
