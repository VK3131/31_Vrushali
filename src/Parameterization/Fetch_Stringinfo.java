package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Stringinfo 
{
		public static void main(String[] args) throws EncryptedDocumentException, IOException
		{
			//To reach upto Excelsheet
			FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
			
			//To open an Excelsheet 
			 Workbook S1=WorkbookFactory.create(file);
			 
			 //To enter into perticular sheet
			 Sheet Sh=S1.getSheet("Sheet1");
			 
			 //To Highlight row
			 Row S2=Sh.getRow(0);
			 
			 //To Highlight Cell/Column
			 Cell S3=S2.getCell(0);
			 
			 //To fetch information
			String info= S3.getStringCellValue();					//Vrushali
			 
			 System.out.println(info);
			 
		}
}
