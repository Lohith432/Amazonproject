package Utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility1 {


	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell celldata_name,celldata_password;
	
	public XSSFSheet setworkbook() throws IOException {
		
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+("\\src\\Testdata\\Data1.xlsx"));
			
		 workbook =new XSSFWorkbook(fs);
		 sheet = workbook.getSheetAt(0);
			
			return sheet;
	}

	public XSSFCell Get_Username(int rownum, int colnum) throws IOException {
		
		sheet = setworkbook();
		celldata_name = sheet.getRow(rownum).getCell(colnum);
		return celldata_name;
	}
	
    public XSSFCell Get_password(int rownum, int colnum) throws IOException {
		
		sheet = setworkbook();
		celldata_password=sheet.getRow(rownum).getCell(colnum);
		return celldata_password;
	}
	
}
