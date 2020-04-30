package myDemo_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingCredentials {

	public static void main(String[] args) throws IOException {
//		File f = new File("C:\\Users\\ayagi\\Desktop\\credentials.xlsx");
//		FileInputStream fi =  new FileInputStream(f);
//			
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstsheet");
		
//		Row row0 = sheet0.createRow(0);// using sheetI create row
//		Cell cellA = row0.createCell(0);
//		Cell cellB = row0.createCell(1);
//		
//		cellA.setCellValue("first cell");
//		cellB.setCellValue("second cell");
		
		for (int rows=0; rows<10; rows++) {
			Row row = sheet0.createRow(rows);
			
					for(int cols=0; cols<10; cols++) {
						
						Cell cell = row.createCell(cols);
						cell.setCellValue((int)(Math.random()*100));
					}
		}
		
		
		
		// connecting streams
		
		File f = new File("C:\\Users\\ayagi\\Desktop\\myExcel.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		//closing the stream
		fo.close();
		
		
		System.out.println("file created");
		


	}

}
