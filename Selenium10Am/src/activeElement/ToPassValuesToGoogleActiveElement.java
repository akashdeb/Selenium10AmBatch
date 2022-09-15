package activeElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValuesToGoogleActiveElement {

	public static void main(String[] args) {
		String expectedSuggestion = "python";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("naruto");
		activeElement.sendKeys(Keys.ENTER);
	
	}

}
