package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_clicl 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean butt = driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).isSelected();
		System.out.println(butt);
	}

}
