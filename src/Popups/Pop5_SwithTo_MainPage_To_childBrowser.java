package Popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop5_SwithTo_MainPage_To_childBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String>al=new ArrayList<String>(ids);
		driver.switchTo().window(al.get(1));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cypress']")).click();
		
		boolean result = driver.findElement(By.xpath("//img[@class=' preload-me']")).isDisplayed();
		if(result==true)
		{
			System.out.println("Logo Are displayed---Test Pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		
}
}