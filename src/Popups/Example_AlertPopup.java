package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_AlertPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		Thread.sleep(500);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		String text = alt.getText();
		System.out.println(text);
		Thread.sleep(1500);
		alt.accept();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		String text1 = alt.getText();
		System.out.println(text1);
		Thread.sleep(1000);
		alt.accept();
	}

}
