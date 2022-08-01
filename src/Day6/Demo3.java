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

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		Dimension s = driver.manage().window().getSize();

		System.out.println(s);

		Dimension d = new Dimension(300, 400);

		driver.manage().window().setSize(d);

		Thread.sleep(1000);

		Point p1 = driver.manage().window().getPosition();
		System.out.println(p1);

		// reposition browser
		Point p = new Point(400, 50);

		// get the current location and current position of the browser and print it

		driver.manage().window().setPosition(p);

		//driver.quit();

	}

}
