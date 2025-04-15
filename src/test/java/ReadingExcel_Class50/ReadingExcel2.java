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

public class ReadingExcel2 {

	//re-factoring of the code.
	@Test
    public void readExcelMethod() throws IOException {
      
	  /* predefined classes.
	   * XSSFWorkbook
	   * XSSFSheet
	   * XSSFRow
	   * XSSFCell
	   */
	 		
   XSSFWorkbook	workBook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\rajar\\OneDrive\\Desktop\\Jan 2025 Batch Selenium Java\\SeleniumJava\\src\\main\\resources\\SampleExcelData.xlsx")));
   System.out.println(workBook.getSheet("Sample1").getRow(0).getCell(1).getStringCellValue());
   
	int count=workBook.getNumberOfSheets();
	System.out.println(count);
    
	//System.out.println(workBook.getSheet("Sample1").getRow(0).getCell(2).getStringCellValue());
	//java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell 
	// because value if cell is of integer.
	System.out.println(workBook.getSheet("Sample1").getRow(0).getCell(2).getNumericCellValue());
	System.out.println(workBook.getSheet("Sample1").getRow(0).getCell(4).getBooleanCellValue());
	workBook.close();
    }	
}