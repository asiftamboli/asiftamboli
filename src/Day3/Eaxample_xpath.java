package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eaxample_xpath
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\April21_A_selenium_Software\\geckodriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifierId")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("Snohar1997@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Next")).click();
		
		
		
	}

}
