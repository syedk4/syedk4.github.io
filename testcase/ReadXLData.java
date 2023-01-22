package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");

		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: " + rowCount);

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Actual Row Count: " + physicalNumberOfRows);

		int lastRowNum = sheet.getLastRowNum();

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < lastRowNum; j++) {
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
			}

		}

	}

}
