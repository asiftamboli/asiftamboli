package DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_drag_drop_operations 
{
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.xpath("//div[@id='column-a']"));
		
		WebElement to = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(from, to).perform();
		
		act.moveToElement(from).clickAndHold().moveToElement(to).release().build().perform();
		String textTo = to.getText();
		if(textTo.equals(to))
		{
		System.out.println("PASS: File is dropped to target as expected");
		}else 
		{
			System.out.println("FAIL: File couldn't be dropped to target as expected");
		}
		//	driver.close();
		
	}

}
