package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*Notification popup
 * 1. displayed below the address bar, but left side
 * 2. it will have 2 button -allow and block
 * 3. we cant inspect 
 * Note: in selenium no option to switch to Notification popup
 * 
 * to handle it we should change setting of the browser programatically
 * 
 * below code is to hide the notification popup 
 */
public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/chandan.rai/Desktop/Demo9.html");
		
		driver.findElement(By.id("A6")).click();
		
		driver.findElement(By.xpath("//button[.='OK']")).click();
		
		
	}


}
