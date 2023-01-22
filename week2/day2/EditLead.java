package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/
		
		
		String url = "http://leaftaps.com/opentaps/control/main";
		String UserName = "//input[@id='username']";
		String PassWord = "//input[@id='password']";
		String LoginButton = "//input[@class='decorativeSubmit']";
		String CRMSFA = "//a[contains(text(),'CRM/SFA')]";
		String Leads = "//a[text()='Leads']";
		String FindLeads = "//a[text()='Find Leads']";
		String FirstName = "//input[@id='ext-gen248']";
		String FindLeadsButton = "//button[contains(text(),'Find Leads')]";
		String FirstLead = "//td[@tabindex='0']/div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@href='/crmsfa/control/viewLead?partyId=10440']";
		String GetTitle = "//div[@id='sectionHeaderTitle_leads']";
		String VerifyTitle = "View Lead";
		//String EditButton = "//div[@class='x-panel-tc']/div[@class='frameSectionExtra']/a[@id='ext-gen565']";
		String EditButton ="//div[@class='x-panel-tc']/div[@class='frameSectionExtra']/a[@href=\"updateLeadForm?partyId=10440\"]";
		//String CompanyChange = "//td[@id='ext-gen519']/input[@id='updateLeadForm_companyName']";
		String CompanyChange = "//*[@id=\"updateLeadForm_companyName\"]";
		String ClicKUpdate = "//div[@id='_G80747__body']//td[@id='ext-gen542']/input[@id='ext-gen565']";
		
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
				//8	Enter first name
				driverChrome.findElement(By.xpath(FirstName)).sendKeys("Loga");
				//9	Click Find leads button
				driverChrome.findElement(By.xpath(FindLeadsButton)).click();
				
				driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//10 Click on first resulting lead
				driverChrome.findElement(By.xpath(FirstLead)).click();
				//11 Verify title of the page
						
				String Title = driverChrome.findElement(By.xpath(GetTitle)).getText();
				
				driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				if (Title.equals(VerifyTitle)) {
					System.out.println(Title);
				}else {
					System.out.println("Title Not Match");
				}
				driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//12 Click Edit
				driverChrome.findElement(By.xpath(EditButton)).click();
				//13 Change the company name
				driverChrome.findElement(By.xpath(CompanyChange)).clear();
				driverChrome.findElement(By.xpath(CompanyChange)).sendKeys("Change Company");
				
				driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driverChrome.findElement(By.xpath(ClicKUpdate)).click();
				
	}

}
