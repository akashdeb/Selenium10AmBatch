package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//converting the physical representation of excel sheet into java representation
		FileInputStream fis = new FileInputStream("./testData/ExcelData10AM.xlsx");
		//loading the excel sheet
		Workbook workbook = WorkbookFactory.create(fis);
		//accessing the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		//accessing the row
		Row row = sheet.getRow(1);
		//accessing the cell
		Cell cell = row.getCell(0);
		//we converting the the cell type of object to string type of obect
		String url = cell.getStringCellValue();
		
		String username = row.getCell(1).getStringCellValue();
		String password=row.getCell(2).toString();
		//Printing the values in the console
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		
	}

}
