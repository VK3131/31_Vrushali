package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data_perticular_Row 
{
		//Fetch data of perticular row
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet6");
		
		int LastCellIndex=Sh.getRow(0).getLastCellNum()-1;
		
		//Take for loop for Cell
		
				//i=0 	 0<=3 			1
					   //1<=3 			2
					   //2<=3			3
					   //3<=3			4
					   //4<=3
		
		for (int i=0; i<=LastCellIndex; i++)
		{
			 String Value=Sh.getRow(0).getCell(i).getStringCellValue();
			 
			 System.out.print(Value+"   ");
		}
	}
}
