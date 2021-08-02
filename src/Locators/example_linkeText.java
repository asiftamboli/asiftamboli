package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_linkeText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.get("https://twitter.com/?lang=en");
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.partialLinkText("")).click();
	}

}
