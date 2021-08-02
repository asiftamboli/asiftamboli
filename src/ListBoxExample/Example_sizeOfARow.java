package ListBoxExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_sizeOfARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Velocity_Family\\Sanjay_Sir_JAva\\Parameterization\\April21_A.xlsx");
		int lastRowIndex = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(lastRowIndex);
	}

}
