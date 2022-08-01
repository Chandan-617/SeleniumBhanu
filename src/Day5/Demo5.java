package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();// open the browser

		driver.get("https://www.fb.com");
		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();

		System.out.println(url);
		
		if(url.contains("facebook"))
		{
			
			System.out.println("PASS : Facebook page is ddisplayed");
		}
		
		
		else
		{
			
			System.err.println("Fail :  Facebook is not displayed");
		}
	}

}
