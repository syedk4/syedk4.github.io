package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		
		//EdgeDriver driverEdge = new EdgeDriver();

		driverChrome.get("http://leaftaps.com/opentaps");
		//driverEdge.get("http://leaftaps.com/opentaps/control/main");

		WebElement UserName = driverChrome.findElement(By.id("username"));
		UserName.sendKeys("Demosalesmanager");
		
		WebElement PassWord = driverChrome.findElement(By.id("password"));
		PassWord.sendKeys("crmsfa");
		
		WebElement LogIn= driverChrome.findElement(By.className("decorativeSubmit"));
		LogIn.click();
		
		driverChrome.findElement(By.linkText("CRM/SFA")).click();
		driverChrome.findElement(By.linkText("Create Lead")).click();
		
		//Locate the parent element which is having <select>
		WebElement elesource = driverChrome.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Create object for Select class and pass the Parent Webelement
		Select dd1 = new Select(elesource);
		
		//Select the value using the visible text
		dd1.selectByVisibleText("Direct Mail");
		
		
		//driverChrome.close();
	}

}
