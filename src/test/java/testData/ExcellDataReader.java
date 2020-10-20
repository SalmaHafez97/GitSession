package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellDataReader {
	
	 static FileInputStream fis= null;
	 
	 public Object[][] getExcelData() throws IOException {
		 String filePath =System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		 File scrFile = new File(filePath);
		 fis = new FileInputStream(scrFile);
		 
		 //Excel //
		 XSSFWorkbook wb =new XSSFWorkbook(fis);
		 XSSFSheet sheet = wb.getSheetAt(0);
		 int TotalRows =sheet.getLastRowNum()+1;
		 int TotalColm = 11;
		 String [][] arrExcel = new String [TotalRows][TotalColm];
		 
		 for(int row=0; row<TotalRows; row++)
		 {
			 for(int colm=0;colm<TotalColm; colm++) {
				 XSSFRow rowsh =sheet.getRow(row);
				 arrExcel[row][colm] =rowsh.getCell(colm).toString();
				 
		 }
		 
		 }
		 wb.close();
		 return arrExcel;
		 
	 }
	 

}
