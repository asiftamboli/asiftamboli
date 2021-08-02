package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_sendKeys 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("Mobile");
		
		WebElement We = driver.findElement(By.tagName("input"));
		Thread.sleep(2000);
		We.sendKeys("Asif");
		We.clear();
		Thread.sleep(1000);
		We.clear();
		Thread.sleep(1500);
		We.sendKeys("ABC");
		
		
	}

}
