package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_last_index_of_cell
{
	//To get last index of cell
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("D:\\Parameterization\\1_oct_Morning.xlsx");
		
		 int Colindex=WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getLastCellNum()-1;
		
		System.out.println(Colindex);
	}
}
