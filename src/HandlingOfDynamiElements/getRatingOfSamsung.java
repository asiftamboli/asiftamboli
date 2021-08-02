package HandlingOfDynamiElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRatingOfSamsung 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung f41");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String RatingSmsung = driver.findElement(By.xpath("//div[@class='col col-7-12']//div[2]//span[1]/span[1]")).getText();
		System.out.println(RatingSmsung);
		String ReviewSmsng = driver.findElement(By.xpath("//div[@class='col col-7-12']//div[2]//span[1]/span[3]")).getText();
		String expReviw="35,718 Reviews";
		System.out.println(ReviewSmsng);
		
		if(ReviewSmsng==expReviw)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		System.out.println(ReviewSmsng);
	
	}

}
