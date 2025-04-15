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

public class ReadingExcel {

	//we use third party libraries to work from excel. anything that goes beyond the
	//browser selenium can not do anything.
	@Test
    public void readExcelMethod() throws IOException{
      
	  /* predefined classes.
	   * XSSFWorkbook
	   * XSSFSheet
	   * XSSFRow
	   * XSSFCell
	   */		
//Step 1: find where is the file located.		
	File source=new File("C:\\Users\\rajar\\OneDrive\\Desktop\\Jan 2025 Batch Selenium Java\\SeleniumJava\\src\\main\\resources\\SampleExcelData.xlsx");
		
//Step 2: Convert into raw stream. because java does not understand whether it is excel,
// csv or any other file. it ask to give in raw stream so that I can convert it to any
// form and can start reading. Raw stream is basically converting into a format that other libraries/java libraries
// can understand. because if you directly pass the file, if the libraries does not support it will exception.
//because in this case if we pass the source directly it will read but there could be possibilities where a 3rd party
//libraries does not read the external file but every file will support FileInputStream() because it is raw stream.
// in this case it is optional but not the best practices if we do not use.
	
	FileInputStream fileName=null;
   try {
	fileName=new FileInputStream(source);	
} catch (FileNotFoundException e) {
	System.out.println("please provide correct file name/path.");
}   		
	//to create object of complete work book.
   XSSFWorkbook workBook=null;
	try {
		workBook=new XSSFWorkbook(fileName);
	} catch (IOException e) {
		System.out.println("please provide a valid workbook name/path.");
	}
	
	int count=workBook.getNumberOfSheets();
	System.out.println(count);	
	
	XSSFSheet sheet1=workBook.getSheet("Sample1");	
	//row and cell starts at zero.
	// when row is n0t created and if you tried to read it wi/l throw null pointer exception.
	//XSSFRow row1=sheet1.getRow(5); - in this case.
	
	XSSFRow row1=sheet1.getRow(0);
	XSSFCell cell1=row1.getCell(1);
	
	//note: when cells are empty it will give null as value.	
	//System.out.println(cell1);	
	//or
	//right way to fetch data is with corresponding method. best practice.
	System.out.println(cell1.getStringCellValue());
    
	workBook.close();
	//why it is asking to handle again at here.
    }	
}