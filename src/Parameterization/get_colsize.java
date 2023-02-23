package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_colsize 
{
	//To get Size of Cell
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException
		{
			//To reach upto Excelsheet
			FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
			
			int Colsize=WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getLastCellNum();
			
			System.out.println(Colsize);
		}
}
