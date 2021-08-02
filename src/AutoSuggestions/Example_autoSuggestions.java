package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_autoSuggestions 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi")).sendKeys("redmi");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		List<WebElement> Alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		String expTitle="redmi note10";
		for(WebElement option:Alloptions)
		{
			String atTitle=option.getText();
			System.out.println(atTitle);
			
			if(atTitle.equals(expTitle))
			{
				option.click();
				break;
			}
		}
		
		
		

	}

}
