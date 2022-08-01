package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* findElement returns WebElement
 * in WebElement we following methods to perform validation on the element
*1. isDisplayed - any element
*2. isEnabled  - any element
*3. isSelected - check box, radio button & list box option
 */
public class Demo3 {

	static {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///C:/Users/chandan.rai/Desktop/Element.html");
		
		
		
	
		WebElement element = driver.findElement(By.id("A2"));
		
		String tag = element.getTagName();
		System.out.println(tag);
		
		String href=element.getAttribute("href");
		System.out.println(href);
		
		String text=element.getText();
		System.out.println(text);
		
		
		driver.quit();
	}

}
