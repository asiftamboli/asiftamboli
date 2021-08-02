package Day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Exmple_getTitle2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\April21_A_selenium_Software\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		WebDriver driver1= new FirefoxDriver(capabilities);

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://google.com");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String actTitle=driver.getTitle();

		String expTitle="fb";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}

}
