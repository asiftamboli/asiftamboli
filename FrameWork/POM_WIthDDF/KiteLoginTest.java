package POM_WIthDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\workspace\\April21_A_Selenium\\TestData\\April21_A.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\April21_A_selenium_Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Kitelogin1Page k1=new Kitelogin1Page(driver);
	
		String Username=sh.getRow(0).getCell(0).getStringCellValue();
		k1.uname(Username);
		
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		k1.password(pwd);
		
		
		KiteLogin2Page k2=new KiteLogin2Page(driver);
		k2.upin();
		k2.btn();
		
		KiteHomePage k3=new KiteHomePage(driver);
		k3.verifyUserID();
		k3.logoverify();
				}

}
