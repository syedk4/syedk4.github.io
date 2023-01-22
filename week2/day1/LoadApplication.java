package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoadApplication {

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
		
		driverChrome.close();
	}

}
