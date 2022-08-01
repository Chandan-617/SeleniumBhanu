package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class Demo5 {

	static {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB=driver.findElement(By.id("username"));

		int x=unTB.getLocation().getX();
		int y=unTB.getLocation().getY();

		System.out.println(x);
		System.out.println(y);
		
		int height=unTB.getSize().getHeight();
		int width = unTB.getSize().getWidth();
		
		System.out.println(height);
		System.out.println(width);
		
		unTB.getRect().getX();
		unTB.getRect().getY();
		
		
		driver.quit();
	}

}
