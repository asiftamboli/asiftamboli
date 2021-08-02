package ListBoxExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_SizeOfListBox 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5'][1]")).click();
		WebElement frm = driver.findElement(By.xpath("///span[@class='lbl_input latoBold  appendBottom5'][1]"));
		
		Select s=new Select(frm);
		
		List<WebElement> Alloptions = s.getOptions();
		//int size=Alloptions(size);
		System.out.println(Alloptions.size());
		//int size = s.getOptions().size();
		//System.out.println(size);
		
	}

}
