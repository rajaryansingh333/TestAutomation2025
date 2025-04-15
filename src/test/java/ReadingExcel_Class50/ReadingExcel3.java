package ReadingExcel_Class50;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcel3 {
	//iterating through all row and column from a sheet. reading data using nested for loop.

	@Test
    public void readExcelMethod() throws IOException {
      
	  /* predefined classes.
	   * XSSFWorkbook
	   * XSSFSheet
	   * XSSFRow
	   * XSSFCell
	   */	 		
   XSSFWorkbook	workBook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\rajar\\OneDrive\\Desktop\\Jan 2025 Batch Selenium Java\\SeleniumJava\\src\\main\\resources\\SampleExcelData.xlsx")));
   
   int rowsCount=workBook.getSheet("registerUser").getPhysicalNumberOfRows();
   //no of rows which is defined/filled already.
   
   //we do not have dedicated method to get the no of formated column for each row and column value may vary. so here is a assumption that
   //our excel is formated and no of cols is same for each row same as it have for first row.
   //?? how to handle un-structured formatted cols data?
   
   int colCount=workBook.getSheet("registerUser").getRow(0).getPhysicalNumberOfCells(); 
   
   //outer loop for rows.
    for(int i=1;i<rowsCount;i++) {
    	//System.out.println(workBook.getSheet("registerUser").getRow(i).getCell(0).getStringCellValue());
    	
    	//outer loop for columns.
    	for(int j=0;j<colCount;j++) {    		
    		System.out.println(workBook.getSheet("registerUser").getRow(i).getCell(j).getStringCellValue());   	    
    	}
    	System.out.println("******************");
       }
    
    }
}