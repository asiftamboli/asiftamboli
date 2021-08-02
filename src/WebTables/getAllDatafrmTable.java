package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllDatafrmTable
{
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		int Collsize = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td")).size();
		for(int i=1;i<=Collsize;i++)
		{
			String data = driver.findElement(By.xpath("//div[@id='leftcontainer']//tr/td")).getText();
			System.out.println(data);
		}
	}

}
