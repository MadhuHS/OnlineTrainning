package files;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel
{
	public static void main(String[] args)
	{
		File f1 = new File("Desktop/UserDemo.xlsx");

		try 
		{
			XSSFWorkbook wb = new  XSSFWorkbook();
			Sheet sh = wb.createSheet("Sheet1");
			
			for (int rowcount = 0; rowcount < 5; rowcount++) 
			{	
			
			  Row r1 = sh.createRow(rowcount);
		    
			 for (int cellcount = 0; cellcount < 5; cellcount++)
			 {
				Cell c1 = r1.createCell(cellcount);
			    c1.setCellValue("hello "+cellcount);	
			 }
			
			}
			
		    
		    FileOutputStream fos = new FileOutputStream(f1);
		    wb.write(fos);
		    
		    System.out.println("Write compeleted");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}
}


