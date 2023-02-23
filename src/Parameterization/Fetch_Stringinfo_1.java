package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Stringinfo_1 
{
	
			public static void main(String[] args) throws EncryptedDocumentException, IOException
			{
				//To reach upto Excelsheet
				FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
				
				
				String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();		//Vrushali
				
				System.out.println(value);
			}
}
