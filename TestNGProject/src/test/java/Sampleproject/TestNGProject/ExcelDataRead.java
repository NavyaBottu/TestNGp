package Sampleproject.TestNGProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("C:\\Users\\Navya Bottu\\OneDrive\\Documents\\Book1.xlsx");
FileInputStream filedata= new FileInputStream(file);
XSSFWorkbook workbook = new XSSFWorkbook(filedata);
XSSFSheet sheet = workbook.getSheet("Test cases");
XSSFRow row = sheet.getRow(8);
String item = row.getCell(4).getStringCellValue();
System.out.println(item);



	}

}
