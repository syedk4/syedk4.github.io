package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
         */
		
		String url = "http://leaftaps.com/opentaps/control/login";
		String UserName = "//input[@id='username']";
		String PassWord = "//input[@id='password']";
		String LoginButton = "//input[@class='decorativeSubmit']";
		String CRMSFA = "//a[contains(text(),'CRM/SFA')]";
		String Contacts = "//a[text()='Contacts']";
		String CreateAccount = "//a[text() = 'Create Contact']";
		String firstname = "firstNameField";
		String lastname = "lastNameField";
		String firstnameL = "createContactForm_firstNameLocal";
		String lastnameL = "createContactForm_lastNameLocal";
		String dep = "departmentName";
		String description = "description";
		String Email = "createContactForm_primaryEmail";
		String State = "createContactForm_generalStateProvinceGeoId";
		String CCreateAccount = "submitButton";
		String ClearText = "//textarea[@name='description']";
		String ImpNote = "updateContactForm_importantNote";
		String UpdateB = "//input[@value='Update']";
		
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		
		driverChrome.get(url);
		//Enter UserName and Password Using Id Locator
		driverChrome.findElement(By.xpath(UserName)).sendKeys("democsr");
		driverChrome.findElement(By.xpath(PassWord)).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driverChrome.findElement(By.xpath(LoginButton)).click();
		//Click on CRM/SFA Link
		driverChrome.findElement(By.xpath(CRMSFA)).click();
		//Click on contacts Button
		driverChrome.findElement(By.xpath(Contacts)).click();
		// Click on Create Contact		
		driverChrome.findElement(By.xpath(CreateAccount)).click();
		//Enter FirstName Field Using id Locator
		driverChrome.findElement(By.id(firstname)).sendKeys("Syed");
		//Enter LastName Field Using id Locator
		driverChrome.findElement(By.id(lastname)).sendKeys("Sufdar Hussain");
		//Enter FirstName(Local) Field Using id Locator
		driverChrome.findElement(By.id(firstnameL)).sendKeys("Syed");
		//Enter LastName(Local) Field Using id Locator
		driverChrome.findElement(By.id(lastnameL)).sendKeys("Hussain");
		//Enter Department Field Using any Locator of Your Choice
		driverChrome.findElement(By.name(dep)).sendKeys("SALES");
		//12. Enter Description Field Using any Locator of your choice
		driverChrome.findElement(By.name(description)).sendKeys("HOW ARE YOU???????");
		//13. Enter your email in the E-mail address Field using the locator of your choice
		driverChrome.findElement(By.id(Email)).sendKeys("SufdarHussain@gmail.com");
		//14. Select State/Province as NewYork Using Visible Text
		WebElement StateProvince = driverChrome.findElement(By.id(State));
		Select StateP = new Select(StateProvince);
		StateP.selectByIndex(38);
		//15. Click on Create Contact
		driverChrome.findElement(By.name(CCreateAccount)).click();
		//16. Click on edit button 
		driverChrome.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		//17. Clear the Description Field using .clear
		driverChrome.findElement(By.xpath(ClearText)).clear();
		//18. Fill ImportantNote Field with Any text		
		driverChrome.findElement(By.id(ImpNote)).sendKeys("TEST");
		//19. Click on update button using Xpath locator
		driverChrome.findElement(By.xpath(UpdateB)).click();
		//20. Get the Title of Resulting Page.
		String gettexts = driverChrome.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		
		System.out.println(gettexts);
		
		
	}

}
