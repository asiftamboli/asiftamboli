 package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_TakeScreenShot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		
		File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
		File dest=new File("D:\\Velocity_Family\\Sanjay_Sir_JAva\\Screenshots\\Google_Home.jpg");
		FileHandler.copy(sr, dest);
		System.out.println("Pass Sreenshot Test");
	}

}
