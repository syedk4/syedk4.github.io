package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readData() throws IOException {
		// TODO Auto-generated method stub
		//Step1: Identify the WorkBook ./ - represents the root folder of my project
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//Step2: Identify the worksheet.
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		/*
		 * //Step3: Identify the row XSSFRow row = sheet.getRow(1);
		 * 
		 * //Step4: Identify the Cell. XSSFCell cell = row.getCell(0);
		 * 
		 * //Step5: read the data from cell. String cellValue =
		 * cell.getStringCellValue();
		 * 
		 * System.out.println(cellValue);
		 */
		
		//to get the number of rows there is a method call ws.getLastRowNum();
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: "+rowCount);
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Actual Row Count: "+physicalNumberOfRows);
		
		//to get the number of cells in a row we can use short or int datatype
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Cell Count: "+ lastCellNum);
		
		//declare 2D array
		String[][] data = new String[rowCount][lastCellNum];
		
		for (int i = 1; i <= rowCount; i++) {//traverse through the row
			for (int j = 0; j < lastCellNum; j++) {//0,1,2
			
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j] = stringCellValue;
				
				System.out.println(stringCellValue);
			}
			
		}
		
		
		
		wb.close();
		
		return data;
	}

}
