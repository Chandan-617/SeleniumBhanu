package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* findElement returns WebElement
 * in WebElement we following methods to perform action on the element
 * 1. clear
 * 2. click
 * 3. sendKeys
 * 4. submit
 */
public class Demo1 {

	static {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///C:/Users/chandan.rai/Desktop/Element.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).sendKeys("Akshara");
		Thread.sleep(1000);
		driver.findElement(By.id("A6")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("A8")).submit();//click on submit button
		Thread.sleep(1000);
		driver.quit();
	}

}
