package excel_create_file;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook; 

public class create_excel {

	public static void main(String[] args) throws IOException {
		 
	

		// Creating Workbook instances 
		HSSFWorkbook wb = new HSSFWorkbook(); 

		// An output stream accepts output bytes and sends them to sink. 
		OutputStream fileOut = new FileOutputStream("Geeks.xlsx"); 
		
		// Creating Sheets using sheet object 
		HSSFSheet sheet1 = wb.createSheet("Array"); 
		HSSFSheet sheet2 = wb.createSheet("String"); 
		HSSFSheet sheet3 = wb.createSheet("LinkedList"); 
		HSSFSheet sheet4 = wb.createSheet("Tree"); 
		HSSFSheet sheet5 = wb.createSheet("Dynamic Programing"); 
		HSSFSheet sheet6 = wb.createSheet("Puzzles"); 
		

System.out.println("Sheets Has been Created successfully"); 

		wb.write(fileOut); 
	} 
} 

