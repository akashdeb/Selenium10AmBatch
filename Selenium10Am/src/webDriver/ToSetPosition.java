package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point point=new Point(100, 100);
		driver.manage().window().setPosition(point);
		Point point1=new Point(-50, 50);
		driver.manage().window().setPosition(point1);
	}

}
