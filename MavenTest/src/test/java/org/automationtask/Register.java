package org.automationtask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skills = driver.findElement(By.id("Skills"));
		Select select = new Select(skills);
				List<WebElement> options = select.getOptions();
		
		
		File file = new File("C:\\Jayashree java\\MavenTest\\excelsheet\\skills.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Nish1");
		
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			
			Row row = sheet.createRow(i);
			Cell createCell = row.createCell(0);
			createCell.setCellValue(text);
		}
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		
		
		
		
		
	}}
// Mention the path of excel
//		File file=new File("C:\\Jayashree java\\MavenTest\\excelsheet\\Book1.xlsx");
//		//get object byte from file
//	    FileInputStream stream=new FileInputStream(file);
//	    //create work book
//	    Workbook workbook = new XSSFWorkbook (stream);
//	    //get the sheet name
//	   Sheet sheet = workbook.getSheet("Sheet1");

//}
