package Helper_Class42;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	 static XSSFWorkbook wb= null;
	 // every method in a static method has to be static.
	 
	 public static Object[][] getData(String sheetName) {	 
	  //class 51.
	 File sourceFile=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	  // user.dir - will give us current user directory which will be till SeleniumJava in this case.
	  // C:\Users\rajar\OneDrive\Desktop\Jan 2025 Batch Selenium Java\SeleniumJava
	// full path: "C:\\Users\\rajar\\OneDrive\\Desktop\\Jan 2025 Batch Selenium Java\\SeleniumJava\\TestData\\SampleExcelData.xlsx"
	// if we do not keep this file in our working directory we can use it when it would be ran from remote.	 
	 
	 FileInputStream fis = null;
	 try {
		 fis=new FileInputStream(sourceFile);
	   } catch (FileNotFoundException e) {		
		System.out.println("please provide a valid file path/name."+e.getMessage());
	  }
	 
	 try {
		 wb=new XSSFWorkbook(fis);
	} catch (IOException e) {
		System.out.println("please provide a valid file workbook name."+e.getMessage());
	} 
	  XSSFSheet sheet=wb.getSheet(sheetName);
	  int row=sheet.getPhysicalNumberOfRows();
	  int col=sheet.getRow(0).getPhysicalNumberOfCells();
	 
	 Object arr[][]=new Object[row][col];
	 // it will make object array identical to the excel row and column.
	  
	 //row count.
	  for(int i=0;i<row;i++) {   	  
		  //col count.
		  for(int j=0;j<col;j++) {			 
			 arr[i][j]=Helper_Class42.ExcelUtility.getCellData(sheetName,i,j);  
		  }
	  }
	  return arr;
 }
  
//cell data type and return as string.
public static String getCellData(String sheetName, int row, int col) {
	 
	 CellType cellType=wb.getSheet(sheetName).getRow(row).getCell(col).getCellType();
	 String data=null;
	 
	  if(cellType==cellType.STRING) {
		  data=wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
		  
	  }
	  else if(cellType==cellType.BOOLEAN) {
		  data=String.valueOf(wb.getSheet(sheetName).getRow(row).getCell(col).getBooleanCellValue());
	  }
	  
	  else if(cellType==cellType.NUMERIC) {
		  data=String.valueOf(wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue());
	  }	  
	  // we are returning all these values as string as normally sendkeys() method takes otherwise we can directly take
	  // data and type cast it further.
	  
	  //these are three combination you can use rest everything you can use as a string as you can pass.
	  else if(cellType==cellType.BLANK) {
		  data="";
	  }
	   return data;
  }
}