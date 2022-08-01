package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

		// Set the path of driver executable
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);

		// open ythe chrome browser

		ChromeDriver driver = new ChromeDriver();

		// Enter the url
		driver.get("https://www.google.com/");

		// close the browser

		driver.close();
	}

}
