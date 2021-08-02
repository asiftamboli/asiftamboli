package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_GetDataFrmWebTables 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
	 
	    String text = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[1]")).getText();
	   String text1 = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[2]")).getText();
		System.out.println(text);
		System.out.println(text1);
	
	}

}
