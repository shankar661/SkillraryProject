package common_Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils 
{
	public String getDataFromExcelFile(String Sheetname,int Rownum,int cellname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("src\\test\\resources\\skillrary.xlsx");
		
		Workbook wb= WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet(Sheetname);
		Row rw=sh.getRow(Rownum);
		Cell cl=rw.getCell(cellname);
		String value=cl.getStringCellValue();
		return value;
		
		
	}

}
