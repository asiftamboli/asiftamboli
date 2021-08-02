
package Popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop3_childBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> multipleID = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(multipleID);
		
		
		String addressofchildWindows = al.get(1);
		System.out.println(addressofchildWindows);
		
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(1000);
		
		  driver.findElement(By.xpath("//span[text()='Selenium']")).click();
		
		
	}

}
