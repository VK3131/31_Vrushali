package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_all_data 

		//Fetch all the data
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet8");
		
		 int LastRowIndex=Sh.getLastRowNum();
		 
		 //Outer for loop for Rows
		 
		 	 //i=0		0<=3			1
		 			//1<=3				2
		 			//2<=3				3
		 			//3<=3				4
		 			//4<=3
		 
		 for(int i=0; i<=LastRowIndex; i++)
		 {
			 //1		//3				//2-1
			 
			 int LastCellIndex=Sh.getRow(i).getLastCellNum()-1;
			 
			 //Inner for loop for Cell
			 	//a=0		0<=1     		1
			 			  //1<=1			2
			 			 //2<=1
			 
			 for(int a=0; a<=LastCellIndex; a++)
			 {
				String value=Sh.getRow(i).getCell(a).getStringCellValue();
				
				System.out.println(value+"  ");
			 }
			 System.out.println();
		 }
		 
	}
}
