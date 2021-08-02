package DragAndDrop;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Example_MouseRightclick
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(loginBtn).perform();
		Thread.sleep(1000);
		act.contextClick().perform();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File File1=new File("D:\\Velocity_Family\\Sanjay_Sir_JAva\\Screenshots\\asif.jpg");
		FileHandler.copy(file, File1);
	}

}
