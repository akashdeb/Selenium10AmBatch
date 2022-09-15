package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		
		String expectedAltImageText = "Flipkart";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String actualAltTextImage = driver.findElement(By.xpath("//img[@title='Flipkart']")).getAttribute("alt");
		System.out.println("Alternative text of Image is : "+actualAltTextImage);
		if(actualAltTextImage.equals(expectedAltImageText)) {
			System.out.println("Pass: Alt image text is verified");
		}
		else
			System.out.println("Fail: Alt image text is not verified");
		driver.quit();
	
	}

}
