package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheSizeOfWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int width = 1000;
		int height = 200;
		Dimension dim = new Dimension(width, height);
		driver.manage().window().setSize(dim);
	}

}
