package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSalesForceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// https://login.salesforce.com/
		
		ChromeDriver driverChrome = new ChromeDriver();
		
		driverChrome.get("https://login.salesforce.com/");
		
		WebElement UserName = driverChrome.findElement(By.id("username"));
		UserName.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement PassWord = driverChrome.findElement(By.id("password"));
		PassWord.sendKeys("Testleaf$321");
		
		WebElement LogIn = driverChrome.findElement(By.id("Login"));
		LogIn.click();
	}

}
