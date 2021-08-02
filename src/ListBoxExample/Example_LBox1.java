package ListBoxExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Example_LBox1
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(1500);
	
  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Asif");
	//System.out.println(name);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tamboli");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8698037349");
	WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select s1=new Select(date);
	Select s=new Select(month);
	Select s2=new Select(year);
	
	s1.selectByIndex(2);
	s.selectByVisibleText("Oct");
	s2.selectByVisibleText("1997");
	
	boolean gender = driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
	
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);
	
	
}
}
