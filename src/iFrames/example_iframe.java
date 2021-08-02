package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_iframe
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.switchTo().frame("iframeResult");
	 driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time')]")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
	
}
