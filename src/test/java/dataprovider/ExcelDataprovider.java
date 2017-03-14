package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataprovider {
	
	 XSSFWorkbook wb;
	public ExcelDataprovider()
	{
		File src=new File("./ApplicationTestData/AppData.xlsx");
		try {
			FileInputStream fi=new FileInputStream(src);
			wb=new XSSFWorkbook(fi);
		    }
		catch (Exception e) {
			System.out.println("The exception is:"+e.getMessage());
		    }
	}
	public String getData(int sheetIndex,int row,int column)
	{
		String data=wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		return data;	}
	public String getData(String sheetName,int row,int column)
	{
		String data=wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		return data;	}
}
