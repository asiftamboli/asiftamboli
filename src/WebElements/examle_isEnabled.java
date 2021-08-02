package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examle_isEnabled
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		WebElement We = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/ul/li[3]/span"));
		boolean result=We.isDisplayed();
		boolean r1=We.isSelected();
		boolean r2=We.isEnabled();
		System.out.println(r2);
		System.out.println(result);
		System.out.println(r1);
		
	}

}
