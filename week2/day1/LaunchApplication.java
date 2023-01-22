package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("username"));
		
		WebElement eleUser = driver.findElement(By.id("username"));
		
		eleUser.sendKeys("DemoSalesManager");
		
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		elePassword.sendKeys("crmsfa");
		
		WebElement eleClick = driver.findElement(By.className("decorativeSubmit"));
		eleClick.click();
		
		
	}

}
