package Day5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}

	
	public static void testBrowser(ChromeDriver driver)
	{
		
		driver.get("https:\\www.google.com");// enter the url
		String title = driver.getTitle();// get the title of browser

		System.out.println(title);
		driver.quit();// close browser
		
	}
	
	public static void testBrowser(FirefoxDriver driver)
	{
		
		driver.get("https:\\www.google.com");// enter the url
		String title = driver.getTitle();// get the title of browser

		System.out.println(title);
		driver.quit();// close browser
		
	}
	
	
	
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();// open the browser
		
		Demo3.testBrowser(driver);
		
		
		FirefoxDriver driver1=new FirefoxDriver();
		Demo3.testBrowser(driver1);
		

	}

}
