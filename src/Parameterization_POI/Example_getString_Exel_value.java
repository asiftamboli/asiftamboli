package Parameterization_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_getString_Exel_value 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Velocity_Family\\Sanjay_Sir_JAva\\Parameterization\\April21_A.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sh = book.getSheet("sheet1");
		Row rw = sh.getRow(2);
		Cell cell = rw.getCell(2);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		
	}

}
