package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToPerformClosingServer {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}

}
