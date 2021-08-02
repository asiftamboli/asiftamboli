package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	String actTitle=driver.getTitle();
	String expTitle="MakeMyTrip";
	if(actTitle.equals(expTitle))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	System.out.println(actTitle);
	
	driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
	
	Thread.sleep(1500);
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
	
	}
	
	
		
}

