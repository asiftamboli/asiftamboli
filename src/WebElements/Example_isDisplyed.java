package WebElements;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_isDisplyed 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		
		boolean result ;
		result = driver.findElement(By.xpath("//img[@class='ixigo-logo-1']")).isDisplayed();
		if(result==true)
		{
			System.out.println(result);
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		try
		{
		 
		System.out.println(result);
		}
		catch (NoSuchElementException e)
		{
			result=false;
			
		}
		System.out.println(result);
	}

}
