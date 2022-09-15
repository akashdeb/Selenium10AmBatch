package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupByIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_3_2_na_na_ps&otracker1=AS_Query_OrganicAutoSuggest_3_2_na_na_ps&as-pos=3&as-type=RECENT&suggestionId=iphone&requestId=84dcd0fe-05af-48c5-882d-3f8e700ada57&as-backfill=on");
		
		String text = driver.findElement(By.xpath("(//div[text()='₹46,999'])[3]")).getText();
		System.out.println(text);
		driver.quit();
	}

}
