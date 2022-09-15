package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		int startX = pos.getX();
		int startY=pos.getY();
		System.out.println("X coordinate : "+startX);
		System.out.println("Y coordibate : "+startY);
	}

}
