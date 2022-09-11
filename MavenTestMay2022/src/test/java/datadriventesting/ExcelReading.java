package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {

	@Test
	public void readSheetDetails() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file
		// location to its constructor
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\TestData.xlsx");
		// create an instance of required workbook class and pass FileInputStream
		// instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		// get the number of sheets present in the excel
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("Sheet count: " + sheetCount);
		// print all the sheets name from the excel
		for (int i = 0; i < sheetCount; i++) {
			String sheetName = workbook.getSheetName(i);
			System.out.println("Sheet name is: " + sheetName);
		}
		// get the required sheet from excel
		Sheet sheet = workbook.getSheet("Sheet1");
	}

	@Test
	public void getRowDetails() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file location to its constructor
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\TestData.xlsx");
		// create an instance of required workbook class and pass FileInputStream instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		// get the required sheet from excel
		Sheet sheet = workbook.getSheet("Sheet1");
		// get row count from the excel( rowCount = ActualCount -1)
		int rowCount=sheet.getLastRowNum();
		System.out.println("Row count is: "+rowCount);
		// get specific row from the sheet
		Row row=sheet.getRow(1);
	}
	
	@Test
	public void getCellDetails() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file location to its constructor
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\TestData.xlsx");
		// create an instance of required workbook class and pass FileInputStream instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		// get the required sheet from excel
		Sheet sheet = workbook.getSheet("Sheet1");
		// get specific row from the sheet
		Row row=sheet.getRow(0);
		//get the cell count from the Row
		int cellCount=row.getLastCellNum();
		System.out.println("Cell count on row0 : "+cellCount);
		//get cell-2 data from cell from row0
		Cell cell=row.getCell(2);
		System.out.println("Row0, Cell2 data is : "+cell.getStringCellValue());
		//get all cell data from row0
		for(int i=0;i<cellCount;i++) {
			
//			Cell col=row.getCell(i);
//			String cellData=col.getStringCellValue();
//			System.out.println("Cell data: "+cellData);
							//or
			System.out.println("Cell data: "+row.getCell(i).getStringCellValue());
		}
	}
		@Test
		public void getDiffTypeOfCellData() throws IOException {
			// Create instance of FileInputStream class and pass the required excel file location to its constructor
			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\TestData.xlsx");
			// create an instance of required workbook class and pass FileInputStream instance to its constructor
			Workbook workbook = new XSSFWorkbook(fis);
			// get the required sheet from excel
			Sheet sheet = workbook.getSheet("Sheet1");
			// get specific row from the sheet
			Row row=sheet.getRow(3);
			//get the cell count from the Row
			int cellCount=row.getLastCellNum();
			System.out.println("Cell count on row3 : "+cellCount);
			//get all cell data from row3
			for(int i=0;i<cellCount;i++) {
				//System.out.println("Cell data: "+row.getCell(i).getStringCellValue());
				
				Cell cell=row.getCell(i);
				switch(cell.getCellType()) {
				
					case(Cell.CELL_TYPE_STRING): 
						System.out.println("Cell Data: "+cell.getStringCellValue());
						break;
					case(Cell.CELL_TYPE_NUMERIC): 
						System.out.println("Cell Data: "+cell.getNumericCellValue());
						break;
					case(Cell.CELL_TYPE_BOOLEAN): 
						System.out.println("Cell Data: "+cell.getBooleanCellValue());
						break;
					default:
						System.out.println("Invalid cell details");
						break;
				}				
			}
	}
}
