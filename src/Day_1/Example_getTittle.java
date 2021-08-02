package Day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_getTittle
{
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://facebook.com");
	
	String title=driver.getTitle();

	System.out.println(title);
	Thread.sleep(2000);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	String title1=driver.getTitle();
	System.out.println(title1);
	
	driver.quit();
}
	
	
}
