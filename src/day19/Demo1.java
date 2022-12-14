package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

//what is the default value of ITO?
//--> 0 Seconds
//What is the default value polling period? where it is specified?
//-->500 ms (0.5S), specified in FluentWait class/*
/*what is the other name of WebDriverWait?
 * Explicit wait
 * 
 * why?
 * Because in WebDriverWait, we should specify waiting condition explicitly 
 * 
 * In which class we have all the waiting conditions?
 * ->present in ExpectedConditions class
 * 
 * ExpectedConditions - class
 * ExpectedCondition- interface
 * 
 * Note: all the waiting conditions are static methods and they are called predicate
 * 
 * We can handle synchronization of only one statement using explicit wait
 * 
 */


public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		Duration dITO = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(dITO);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dITO = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(dITO);
		driver.get("https://demo.actitime.com/login.do");
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Enter"));
		String title2=driver.getTitle();
		System.out.println(title2);
				
		driver.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		String title3=driver.getTitle();
		System.out.println(title3);
		
		driver.quit();
	}

}
