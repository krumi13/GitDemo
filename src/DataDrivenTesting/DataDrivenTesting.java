package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, BiffException {
//	FileInputStream input = new FileInputStream(new File("C:\\Users\\Kabir\\OneDrive\\Desktop\\ExcelData.xlsx"));
//	XSSFWorkbook workbook = new XSSFWorkbook(input);
//	XSSFSheet sheet = workbook.getSheetAt(0);
	
	File inputFile = new File("C:\\Users\\Kabir\\OneDrive\\Desktop\\ExcelData.xlsx");
	Workbook excelApp = Workbook.getWorkbook(inputFile);
	Sheet inputSheet = excelApp.getSheet(0); 
	
	
	}

}
