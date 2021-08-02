package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_WebTables 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//1st Approahes
		//List<WebElement> Allrows = driver.findElements(By.xpath("//tr"));
		//System.out.println("Row Size " + Allrows.size());
		//driver.close();
		
		//2nd Apprahes
		
	List<WebElement> collsize = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Allrws " + collsize.size());
		driver.close();
		
	
	}

}
