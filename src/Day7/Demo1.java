package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement e=driver.switchTo().activeElement();
		e.sendKeys("chandan");
		

	}

}
