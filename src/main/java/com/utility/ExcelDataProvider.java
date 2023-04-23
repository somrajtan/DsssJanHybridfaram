package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook workbook;

	public ExcelDataProvider() throws IOException {
		
		
		File file=new File(System.getProperty("user.dir")+"\\testData\\Data.xlsx");
		FileInputStream fl=new FileInputStream(file);
		
		 workbook = new XSSFWorkbook(fl);
		
		
		
	}
	
	
	public String getStringData(String name, int row,int cell) {
		String val= workbook.getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(val);
		return val;
		
	}
	
}
