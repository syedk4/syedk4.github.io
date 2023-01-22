package week6.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIncidents extends BaseClassServiceNow {
  @Test
  public void deleteIncidents() throws InterruptedException {
	  
	  Thread.sleep(5000);
		WebElement getInc = driver.findElement(By.xpath("//a[@class='linked formlink']"));
		
		
		System.out.println(getInc.getText());
		
		WebElement searchInc = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		searchInc.sendKeys(getInc.getText(),Keys.ENTER);
	  
	  driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	  driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
	  driver.findElement(By.id("ok_button")).click();
	  
  }
}
