package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_numeric_as_string 
{
	//Read numeric information as a string 
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
		
		 String Value=WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Value);
	}
}
