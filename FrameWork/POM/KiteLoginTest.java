package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.loginBtn();
		Thread.sleep(2000);
		
		
		KiteLogin2Page login2=new KiteLogin2Page(driver);
		login2.pin();
		login2.clickcontBtn();
	}

}
