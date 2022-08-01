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
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WindowType option1=WindowType.TAB;
		
		driver.switchTo().newWindow(option1);
		
		driver.get("https://www.fb.com");
		WindowType option2=WindowType.WINDOW;
		
		driver.switchTo().newWindow(option2);
		
		driver.get("https://aksharatraining.com/");
	}

}
