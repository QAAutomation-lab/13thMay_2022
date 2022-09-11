package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelOperations {

	/**
	 * 1. Get sheet count 2. All sheet name 3. Add new sheet 4. Delete existing
	 * sheet
	 * 
	 * @throws IOException
	 */
	@Test(enabled = false)
	public void performOperationOnSheet() throws IOException {

		/* Identify the path and name of excel file */
		FileInputStream fis = new FileInputStream(".\\TestData\\DDT.xlsx");
		/* Create an instance of required workbook class */
		Workbook workbook = new XSSFWorkbook(fis);
		/* Perform required operation on sheet */
		/**
		 * 1. get sheet count
		 */
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("Sheet count: " + sheetCount);
		/**
		 * 2. get sheet names
		 */
		for (int i = 0; i < sheetCount; i++) {
			System.out.println("Sheet name is : " + workbook.getSheetName(i));
		}
		/**
		 * 3. create new sheet
		 */
		// workbook.createSheet("TestSheet");

		/**
		 * 4. Delete sheet
		 */
		workbook.removeSheetAt(3);

		/* Create an instance of FileOutputStream */
		FileOutputStream fos = new FileOutputStream(".\\TestData\\DDT.xlsx");
		/* write/store the content into required file */
		workbook.write(fos);
		/**/
		fos.flush();
		fos.close();

	}

	/**
	 * 1. get row count 2. create new row 3. delete row
	 */
	@Test(enabled = false)
	public void performRowOperations() throws IOException {
		/* Identify the path and name of excel file */
		FileInputStream fis = new FileInputStream(".\\TestData\\DDT.xlsx");
		/* Create an instance of required workbook class */
		Workbook workbook = new XSSFWorkbook(fis);
		/* get the sheet on which operation needs to be performed */
		Sheet sheet = workbook.getSheet("Sheet1");

		/* perform required operation on sheet */
		/**
		 * 1. get row count
		 */
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count is : " + rowCount);

		/**
		 * 2. add new row
		 */
		// sheet.createRow(rowCount+1);
		/**
		 * 3. delete row
		 */
		Row row = sheet.getRow(rowCount);
		sheet.removeRow(row);

		/* Create an instance of FileOutputStream */
		FileOutputStream fos = new FileOutputStream(".\\TestData\\DDT.xlsx");
		/* write/store the content into required file */
		workbook.write(fos);
		/**/
		fos.flush();
		fos.close();

		System.out.println("Updated Row count is : " + sheet.getLastRowNum());
	}

	@Test(enabled = false)
	public void performOperationOnCell() throws IOException {

		/* Identify the path and name of excel file */
		FileInputStream fis = new FileInputStream(".\\TestData\\DDT.xlsx");
		/* Create an instance of required workbook class */
		Workbook workbook = new XSSFWorkbook(fis);
		/* get the sheet on which operation needs to be performed */
		Sheet sheet = workbook.getSheet("Sheet1");

		/* get row */
		Row row = sheet.getRow(1);
		/* perform required operation on Row1 cell */
		int cellCount = row.getLastCellNum();
		System.out.println("cell count : " + cellCount);
		
		/*read cell contents*/
//		for (int i = 0; i < cellCount; i++) {
//
//			try {
//				/* switch to check cell type and read the content accordingly */
//				switch (row.getCell(i).getCellType()) {
//
//				case Cell.CELL_TYPE_STRING:
//					System.out.println("Cell contents are :" + row.getCell(i).getStringCellValue());
//					break;
//				case Cell.CELL_TYPE_NUMERIC:
//					System.out.println("Cell contents are :" + (int) row.getCell(i).getNumericCellValue());
//					break;
//
//				case Cell.CELL_TYPE_BLANK:
//
//					break;
//				default:
//					System.out.println("No matching cell found");
//					break;
//				}
//			} catch (NullPointerException e) {
//				System.out.println("Cell contents are :");
//			}
//
//		}
		
//		/*Create new cell and set its value*/
//		Cell cell=row.createCell(cellCount);
//		cell.setCellValue("pass");
		
		Cell cell=row.getCell(cellCount-1);
		cell.setCellValue("failed");
		
		/* Create an instance of FileOutputStream */
		FileOutputStream fos = new FileOutputStream(".\\TestData\\DDT.xlsx");
		/* write/store the content into required file */
		workbook.write(fos);
		/**/
		fos.flush();
		fos.close();

	}

	public void getCellValue(String path,String sheetName,int cellNum) throws IOException {
		
		/* Identify the path and name of excel file */
		FileInputStream fis = new FileInputStream(path);
		/* Create an instance of required workbook class */
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet=workbook.getSheet(sheetName);
		
		int rowCount=sheet.getLastRowNum();
		for(int i=0;i<rowCount;i++){
			
			Row row=sheet.getRow(i);
			/* switch to check cell type and read the content accordingly */
			switch (row.getCell(cellNum).getCellType()) {

			case Cell.CELL_TYPE_STRING:
				System.out.println("Cell contents are :" + row.getCell(cellNum).getStringCellValue());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				System.out.println("Cell contents are :" + (int) row.getCell(cellNum).getNumericCellValue());
				break;
			default:
				System.out.println("No matching cell found");
				break;
			}
		}		
	}	
	
	@Test
	public void getFirstCellValueFromEachRow() throws IOException{
		
		getCellValue(".\\TestData\\DDT.xlsx", "Sheet1", 0);
	}
	
	@Test
	public void getCompleteDataFromScepecificSheet(){
		
	}
	
	@Test
	public void getRowsCountFromSheet(){
		
	}
	
	@Test
	public void getCellValueFromParticularRow(){
		
	}
	
	@Test 
	public void getSheetName(){
		
	}
	
	@Test 
	public void updateCellValue(){
		
	}
	
	@Test 
	public void createAndInsertValueInCell(){
		
	}
}








