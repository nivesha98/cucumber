package org.tech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
public static void main(String[] args) throws IOException {
	//Mention the path of excel
	File file=new File("C:\\Jayashree java\\MavenTest\\excelsheet\\Book1.xlsx");
	//get object byte from file
    FileInputStream stream=new FileInputStream(file);
    //create work book
    Workbook workbook = new XSSFWorkbook (stream);
    //get the sheet name
   Sheet sheet = workbook.getSheet("Sheet1");
   //get row
   Row row = sheet.getRow(4);
   //getcell
   Cell cell = row.getCell(1);
   //System.out.println(cell);
   //row count
   //int count = sheet.getPhysicalNumberOfRows();
  // System.out.println(count);
   //to get cell count
   //Row row1=sheet.getRow(3);
   
   //int count1 = row1.getPhysicalNumberOfCells();
   //to get all the cell value
   Row row11=sheet.getRow(3);
   for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	   Cell cell1=row.getCell(i);
	   System.out.println(cell1);
	
	
}
   
}


}
