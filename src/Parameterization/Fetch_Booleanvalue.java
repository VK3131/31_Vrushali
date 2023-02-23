package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Booleanvalue
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
		
		boolean value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(1).getBooleanCellValue();		//TRUE
		
		System.out.println(value);
		
	}
}
