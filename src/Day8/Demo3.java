package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//locators
/*
 * tagName
 * id
 * name
 * className
 * linkText
 * partialLinkText
 * cssSelector
 * xpath
 */
public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/chandan.rai/Desktop/Demo3.html");

		driver.findElement(By.tagName("input")).sendKeys("Chandan");

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("akshara");

	}

}
