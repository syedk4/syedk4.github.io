package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeads {
	
	/*http://leaftaps.com/opentaps/control/main
	 
	1	Launch the browser
	2	Enter the username
	3	Enter the password
	4	Click Login
	5	Click crm/sfa link
	6	Click Leads link
	7	Click Find leads
	8	Click on Email
	9	Enter Email
	10	Click find leads button
	11	Capture name of First Resulting lead
	12	Click First Resulting lead
	13	Click Duplicate Lead
	14	Verify the title as 'Duplicate Lead'
	15	Click Create Lead
	16	Confirm the duplicated lead name is same as captured name
	17	Close the browser (Do not log out)
	
	*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "http://leaftaps.com/opentaps/control/main";
		String UserName = "//input[@id='username']";
		String PassWord = "//input[@id='password']";
		String LoginButton = "//input[@class='decorativeSubmit']";
		String CRMSFA = "//a[contains(text(),'CRM/SFA')]";
		String Leads = "//a[text()='Leads']";
		String FindLeads = "//a[text()='Find Leads']";
		String Email = "//span[contains(text(),'Email')]";
		String EmailEnter = "//input[@name='emailAddress']";
		String FindLeadsButton = "//button[contains(text(),'Find Leads')]";
		//String FirstLead = "//*[@id=\"ext-gen848\"]";
		String FirstLead = "//*[@id=\"ext-gen1171\"]";
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
		//8 Click on Email
		driverChrome.findElement(By.xpath(Email)).click();
		//9 Enter Email
		driverChrome.findElement(By.xpath(EmailEnter)).clear();
		driverChrome.findElement(By.xpath(EmailEnter)).sendKeys("priyadharshini.ceg@gmail.com");
		//10 Click find leads button
		driverChrome.findElement(By.xpath(FindLeadsButton)).click();
		
	//	driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//11 Capture name of First Resulting lead
	/*
	 * String F1 = driverChrome.findElement(By.id(FirstLead)).getText();
	 * System.out.println(F1);
	 */
		driverChrome.findElement(By.xpath(FirstLead)).click();
		//12 Click First Resulting lead
		//driverChrome.findElement(By.linkText(F1)).click();
		//13 Click Delete
	}

}
