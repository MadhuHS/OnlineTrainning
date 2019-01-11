package files;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static void main(String[] args) 
	{
       File f1 = new File("Desktop/UserDetails.xlsx");
       try 
       {
		Workbook wb = WorkbookFactory.create(f1);
		Sheet s1 = wb.getSheetAt(0);
		Row r1 =s1.getRow(1);
		Cell c1 = r1.getCell(1);
		String str = c1.getStringCellValue();
		System.out.println(str);
		
		int frow = s1.getFirstRowNum();
		int lrow = s1.getLastRowNum();
		
		for (int rowcount = frow; rowcount < lrow; rowcount++) 
		{
			Row rw =s1.getRow(rowcount);
			int clast = rw.getLastCellNum();
			
			for (int cellcount = 0; cellcount < clast; cellcount++) 
			{
				Cell cl = rw.getCell(cellcount);
				if(cellcount == 0)
				{
					int id = (int)cl.getNumericCellValue();
					System.out.print(id + " ");
				}
				else
				{
				 String val = cl.getStringCellValue();
				 System.out.println(val);
				}
			}
		}
		
	   } 
       catch (Exception e) 
       {
		e.printStackTrace();
	 }
}
}
