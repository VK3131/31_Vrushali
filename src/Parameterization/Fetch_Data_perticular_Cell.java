package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data_perticular_Cell 
{
	//Fetch data of perticular Cell 
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException
		{
			//To reach upto Excelsheet
			FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
			
			Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet7");
			
			 int LastRowIndex=Sh.getLastRowNum();
			 
			 //Take for loop for Rows
			 
			 	// i=o		0<=3			1
			 			  //1<=3			2
			 			 //2<=3				3
			 			//3<=3				4
			 			//4<=3
			 
			 for(int i=0; i<=LastRowIndex; i++)
			 {
				String value=Sh.getRow(i).getCell(0).getStringCellValue();
				
				System.out.println(value);
			 }
		}
		
}
