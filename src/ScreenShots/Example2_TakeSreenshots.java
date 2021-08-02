package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example2_TakeSreenshots 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		String img = RandomString.make(2);
		File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
		File des=new File("D:\\Velocity_Family\\Sanjay_Sir_JAva\\Screenshots\\image"+img+".jpg");
		FileHandler.copy(sr, des);
		System.out.println("Takes Sreenshot pass");
	}

}
