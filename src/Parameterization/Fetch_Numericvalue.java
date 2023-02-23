package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Numericvalue
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
		
		
		double  value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();		//
		
		System.out.println(value);
	}
}
