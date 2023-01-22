package week6.day1.Assignment2.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class BaseClassServiceNow {
	public ChromeDriver driver;
	
	@Parameters({"url","user_name","user_password"})
	  @BeforeMethod
	  public void beforeMethod(String url, String user, String passWord) throws InterruptedException {
		  
		  	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("user_name")).sendKeys(user);
			driver.findElement(By.id("user_password")).sendKeys(passWord);
			driver.findElement(By.id("sysverb_login")).click();
			
			Shadow s = new Shadow(driver);
			s.setImplicitWait(10);
			s.findElementByXPath("//div[text()='All']").click();
			s.setImplicitWait(10);
			s.findElementByXPath("//span[(contains(text(),'Incidents'))]").click();
			  Thread.sleep(5000);
				driver.switchTo().frame(s.findElementByXPath("//iframe[@name='gsft_main']"));
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}
