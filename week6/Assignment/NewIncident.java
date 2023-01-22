package week6.Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class NewIncident extends BaseClassServiceNow {
  @Test
  public void createNewIncident() throws InterruptedException {
	  
	
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		
		WebElement shortDesc = driver.findElement(By.id("incident.short_description"));
		shortDesc.sendKeys("TEST-SYED");
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//th[@class='text-align-left list_header_cell list_hdr '])[1]")).click();
		Thread.sleep(5000);
		WebElement getInc = driver.findElement(By.xpath("//a[@class='linked formlink']"));
		
		
		System.out.println(getInc.getText());
		
		WebElement searchInc = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		searchInc.sendKeys(getInc.getText(),Keys.ENTER);

	  
  }
 

}
