package com.util;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	void m1() {
		try {
	String input=System.getProperty("user.dir")+"/Readfile.xlsx";
	
	
		FileInputStream inputpath = new FileInputStream (input);
		
		
		XSSFWorkbook book=new XSSFWorkbook(inputpath);
		
		
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
	
		for(int r=0;r<rows;r++) {
			
		XSSFRow row=sheet.getRow(r);
			
				for(int c=0;c<cols;c++) {
					
					XSSFCell col=row.getCell(c);
					
					switch(col.getCellType()) {
					
					case STRING:System.out.print(col.getStringCellValue());break;
					case NUMERIC:System.out.print(col.getNumericCellValue());break;
					
					case BOOLEAN:System.out.print(col.getNumericCellValue());break;
					}
					System.out.print(" ");
				}
				System.out.println();
				
				
		}
		
		book.close();
		inputpath.close();
		
		
		
		
		/*for(int i=1;i<=lastrow;i++) {
			
			XSSFRow row=sheet.getRow(i);
			Cell Name=row.getCell(0);
			
			Cell Age=row.getCell(1);
			Cell Email=row.getCell(2);
		    System.out.println(Name+" "+Age+" "+Email);
			
		}*/
		
		
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	public static void main(String[] args) {

		ReadExcelFile obj= new ReadExcelFile();

         obj.m1();
	}

}
