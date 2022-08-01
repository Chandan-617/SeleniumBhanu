package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}

	
	public static void testBrowser(WebDriver driver)
	{
		
		driver.get("https:\\www.google.com");// enter the url
		String title = driver.getTitle();// get the title of browser

		System.out.println(title);
		driver.quit();// close browser
		
	}
	
	
	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();//open the browser
		Demo4.testBrowser(driver);
		
		WebDriver driver1=new FirefoxDriver();
		Demo4.testBrowser(driver1);
		

	}

}
