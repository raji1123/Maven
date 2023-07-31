package com.util;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExceldata {

	void m2() 
	
	{
		try {
       	
			
       	
       	XSSFWorkbook book=new XSSFWorkbook ();
       	
       	XSSFSheet sheet=book.createSheet("Sheet 1");//object is a holds all type of data it is hetergenous we have row and coloumns so we create two matrix
       	
       	Object emplydetail[][]= {
       		{"Name",	"Age"	,"Email"},
       		{"JohnDeo",	30, "john@test.com"},
       		{"JohnDeo"	,28	,"john@test.com"},
       		{"BobSmith"	,35	 ,"jacky@.example.com"},
       		{"Swapnil",	37	 ,"joe@example.com"},
	};
       	
       	
       	int rowlength=emplydetail.length;
       	int collength=emplydetail[0].length;
       	
       	for(int r=0;r<rowlength;r++) {
       		
       		
       		XSSFRow row=sheet.createRow(r);
       		for(int c=0;c<collength;c++) {
       			
       			XSSFCell col=row.createCell(c);
       			Object value= emplydetail[r][c];
       			
       			
       			
       			if(value instanceof String)
       				col.setCellValue((String)value);

       			if(value instanceof Integer)
       				col.setCellValue((Integer)value);
       			
       			if(value instanceof Boolean)
       				col.setCellValue((Boolean)value);
       		}
       		
       	}
       	
        String path=System.getProperty("user.dir")+"/writefile.xlsx";
        
        FileOutputStream outstream=new FileOutputStream(path);
        
       	book.write(outstream);
		
		outstream.close();
		
       	System.out.println("code excecuted");
       	
		}	
		
	
		catch(Exception e) {
			e.printStackTrace();
		}}
		
		
	
	
	
	
	
	public static void main(String[] args) {
		WriteExceldata s=new WriteExceldata();
		s.m2();

	}

}
