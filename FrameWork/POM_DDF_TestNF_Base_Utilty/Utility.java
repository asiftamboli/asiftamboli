package POM_DDF_TestNF_Base_Utilty;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	
	//Author name:Asif
	//this method is use to get inputs from exel sheet
	public static String getTestData(int rowindex,int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\workspace\\April21_A_Selenium\\TestData\\April21_A.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	    
		return value;
	}
	
	public static void captureScreenshot (WebDriver driver,int ID)throws IOException
	{
		
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file1=new File("C:\\Users\\Admin\\workspace\\April21_A_Selenium\\SrrenShot\\abj.jpg");
	    FileHandler.copy(file, file1);
		
	}

	public static String readPropertyFileData(String Key) throws IOException
	{
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\workspace\\April21_A_Selenium\\Property.properties");
		obj.load(file);
		String value = obj.getProperty(Key);		
		return value;
		
	}
}
