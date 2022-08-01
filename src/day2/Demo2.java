package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// open ythe chrome browser
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		// Enter the url
		driver.get("https://www.google.com/");

		// close the browser

		driver.close();
	}

	

}
