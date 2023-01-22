package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Step 1: Download and set the path 

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String url = "https://en-gb.facebook.com/";
		String CreateAccount = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']";
		String firstname = "firstname";
		String lastname = "lastname";
		String mobile = "reg_email__";
		String password = "password_step_input";
		String day = "day";
		String month = "month";
		String year = "year";
		String Gender = "//input[@value='1']";
		//String Gender = "//input[@value='2']";
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driverChrome = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		driverChrome.get("https://en-gb.facebook.com/");
		driverChrome.manage().window().maximize();
		
		// Step 5: Add implicit wait - I added but its not working
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		//driverChrome.manage().timeouts().implicitlyWait(null) ;
		//driverChrome.close();
		
		// Step 6: Click on Create New Account button
		driverChrome.findElement(By.xpath(CreateAccount)).click();
		
		// Step 7: Enter the first name
		driverChrome.findElement(By.name(firstname)).sendKeys("Syed");
		
		// Step 8: Enter the last name
		driverChrome.findElement(By.name(lastname)).sendKeys("Hussain");
		
		// Step 9: Enter the mobile number
		driverChrome.findElement(By.name(lastname)).sendKeys("988422222");
		
		// Step 10: Enterthe password
		driverChrome.findElement(By.id(password)).sendKeys("Password11@");
		
		// Step 11: Handle all the three drop downs
		WebElement Daydropdown = driverChrome.findElement(By.id(day));
		Select Daydd = new Select(Daydropdown);
		Daydd.selectByIndex(14);
		
		WebElement Monthdropdown = driverChrome.findElement(By.id(month));
		Select Monthdd = new Select(Monthdropdown);
		Monthdd.selectByValue("7");
		
		WebElement Yeardropdown = driverChrome.findElement(By.id(year));
		Select Yeardd = new Select(Yeardropdown);
		Yeardd.selectByValue("1988");
		
		// Step 12: Select the radio button "Female" 
		driverChrome.findElement(By.xpath(Gender)).click();
		
		
		driverChrome.close();
		
	}

}
