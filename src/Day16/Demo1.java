package Day16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;


class Demo1 {

	static {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.actimind.com/");
		driver.manage().window().maximize();
		Shutterbug.shootPage(driver, Capture.FULL).save("./img/");
		driver.quit();
	}

}
