package utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Excelutils {		

		public static String getCellvalue(String x1,String sheet,int r,int c)
		{
			try
			{
				FileInputStream f=new FileInputStream(x1);
			    XSSFWorkbook wb=new XSSFWorkbook(f);
			    XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c); 
			    if(cell.getCellType()==CellType.STRING)
			    {
			    	return cell.getStringCellValue();
			    }
			    else
			    {
			    	double d=cell.getNumericCellValue();
			    	int val=(int)d;
			    	return String.valueOf(val);
			    }
		
			
		    }
			catch(Exception e)
			{
				return "";
			}
		}
		
		public static int getRowcount(String x1,String sheet) 
		{
			try
			{
				FileInputStream f=new FileInputStream(x1);
			    XSSFWorkbook wb=new XSSFWorkbook(f);
			    return wb.getSheet(sheet).getLastRowNum();
			}
			catch(Exception e)
			{
				return 0;
			}
			
		    	
		}
		
		
		

		

	


}
