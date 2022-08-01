package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String html_code=driver.getPageSource();
		
		System.out.println(html_code);
		driver.quit();

	}

}
