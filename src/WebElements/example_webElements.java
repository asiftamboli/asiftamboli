package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_webElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.get("https://www.ixigo.com/");
		
	
		String acttitle=driver.getTitle();
		String exptitle="ixigo - Flights, IRCTC Train Booking, Bus Booking, Air Tickets & Hotels";
		if(acttitle.equals(exptitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
		System.out.println(acttitle);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("//a[@href='/flights']")).click();
		
		String flightUrl=driver.getCurrentUrl();
		System.out.println(flightUrl);
		
	}

}
