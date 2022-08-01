package Day6;

import java.net.MalformedURLException;


// give an example for method overloading

//driver.navigate.to(args) args can be either string or url

//What is difference detween get and navigates?

// get-only enter url
//navigate -enter url,back,forward,refresh

// difference between get() and navigateTo();

// to method internally call get methods 

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.gmail.com");
		
		Thread.sleep(1000);
		

		URL url = new URL("https://www.fb.com");

		driver.navigate().to(url);
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
