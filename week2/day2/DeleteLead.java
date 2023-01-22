package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/
		String url = "http://leaftaps.com/opentaps/control/main";
		String UserName = "//input[@id='username']";
		String PassWord = "//input[@id='password']";
		String LoginButton = "//input[@class='decorativeSubmit']";
		String CRMSFA = "//a[contains(text(),'CRM/SFA')]";
		String Leads = "//a[text()='Leads']";
		String FindLeads = "//a[text()='Find Leads']";
		String Phone = "//span[contains(text(),'Phone')]";
		String Code1 = "//input[@name='phoneCountryCode']";
		String Code2 = "//input[@name='phoneAreaCode']";
		String PhoneNumber = "//input[@name='phoneNumber']";
		String FindLeadsButton = "//button[contains(text(),'Find Leads')]";
		String getFirstLead = "//*[@id=\"ext-gen1171\"]";
		
		//Launch the browser
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		
		//Launch URL "http://leaftaps.com/opentaps/control/main"
		
		driverChrome.get(url);
		//Enter UserName and Password
		driverChrome.findElement(By.xpath(UserName)).sendKeys("democsr");
		driverChrome.findElement(By.xpath(PassWord)).sendKeys("crmsfa");
		//Click on Login Button using
		driverChrome.findElement(By.xpath(LoginButton)).click();
		//Click on CRM/SFA Link
		driverChrome.findElement(By.xpath(CRMSFA)).click();
		//6	Click Leads link
		driverChrome.findElement(By.xpath(Leads)).click();
		//7	Click Find leads
		driverChrome.findElement(By.xpath(FindLeads)).click();
		//8	Click on Phone
		driverChrome.findElement(By.xpath(Phone)).click();
		//9	Enter phone number
		driverChrome.findElement(By.xpath(Code1)).sendKeys("1");
		driverChrome.findElement(By.xpath(Code2)).sendKeys(" ");
		driverChrome.findElement(By.xpath(PhoneNumber)).sendKeys("123456");
		//10 Click find leads button
		driverChrome.findElement(By.xpath(FindLeadsButton)).click();
		//11 Capture lead ID of First Resulting lead
		driverChrome.findElement(By.xpath(getFirstLead)).click();
		
		
		
	}

}
