package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_WE1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1500);
		 /*W driver.findElement(By.tagName("input"));
		
		 A.sendKeys("Asif");
	
		 Thread.sleep(1000);
		 
		 A.clear();
		 
		 Thread.sleep(1000);
		 
		 A.sendKeys("ABC");
		
		A.clear();
		*/
		
	}

}
