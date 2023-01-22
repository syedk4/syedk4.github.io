package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{
	
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String comp, String fName, String lName) {
		
	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comp);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		return ReadExcelData.readData();
		
		/*
		 * String[][] readData = ReadExcelData.readData(); return readData;
		 */
		
		
		/*
		 * String[][] tData = new String[2][3];
		 * tData[0][0] = "Testleaf"; tData[0][1] = "Syed"; tData[0][2] = "S";
		 * 
		 * tData[1][0] = "Qeagle"; tData[1][1] = "Hari"; tData[1][2] = "R";
		 * return tData;
		 */
		
		
		
		
	}
	
}






