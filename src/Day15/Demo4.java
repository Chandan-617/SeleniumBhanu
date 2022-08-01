package Day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Taking the screenshot of completed page section
 * 
 * we can take screenshot of element/area/visible area on the page
 */
public class Demo4 {

	static {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot t = (TakesScreenshot) driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);

		File dstFile = new File("./img/loginpage.png");

		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();

	}

}
