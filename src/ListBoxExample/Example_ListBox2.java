package ListBoxExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_ListBox2 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(1000);
	WebElement day = driver.findElement(By.xpath("////select[@id='day']"));
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
	Select s1=new Select(day);
	Select s2=new Select(month);
	Select s3=new Select(year);
	
	s1.selectByIndex(2);
	s2.selectByValue("10");
	s3.selectByVisibleText("2001");
	
}
}
