package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_rowsize 
{
	//To get Size of Row
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
		
		 int Rowsize =WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum()+1;
		 
		 System.out.println(Rowsize);
	}
	
}
