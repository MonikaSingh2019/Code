package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTesting1 {

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./Data/Book1.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet1");
		int lastRow =sh.getLastRowNum();
		for( int i=0;i<=lastRow;i++)
		{
		Row row = sh.getRow(i);
		Cell cell =row.getCell(0);
		String cellValue = cell.getStringCellValue();
		
		System.out.println(cellValue);
		
		}
	}

}