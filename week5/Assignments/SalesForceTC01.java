package week5.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SalesForceTC01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action = new Actions(driverChrome);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driverChrome; Actions action =
		 * new Actions(driverChrome);
		 */
		
		driverChrome.get("https://qeagle-dev-ed.my.salesforce.com/");
		WebElement logIn1 = driverChrome.findElement(By.id("login_form"));
		logIn1.click();
		WebElement userName = driverChrome.findElement(By.id("username"));
		WebElement passWord = driverChrome.findElement(By.id("password"));
		userName.sendKeys("hari.radhakrishnan@qeagle.com");
		passWord.sendKeys("Testleaf$321");
		WebElement logIn2 = driverChrome.findElement(By.id("Login"));
		logIn2.click();
		driverChrome.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driverChrome.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		
		WebElement searchTask = driverChrome.findElement(By.xpath("//input[@class='slds-input']"));
		searchTask.sendKeys("tasks");
		
		WebElement tasks = driverChrome.findElement(By.xpath(" //mark[contains(text(),'Tasks')]"));
		tasks.click();
		
		WebElement taskDD = driverChrome.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Task']//div"));
		taskDD.click();
		
		/*
		 * Thread.sleep(2000); WebElement newTask =
		 * driverChrome.findElement(By.xpath("//span[text()='New Task']"));
		 * newTask.click();
		 */
		
		driverChrome.executeScript("arguments[0].click();", driverChrome.findElement(By.xpath("//span[text()='New Task']/..")));
		
		driverChrome.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("BootCamp");
		
		driverChrome.findElement(By.xpath("//a[contains(text(),'Not Started')]")).click();
		driverChrome.findElement(By.xpath("//a[contains(text(),'Waiting on someone else')]")).click();
		driverChrome.findElement(By.xpath("//span[text()='Save']/..")).click();
		
		//assert driverChrome.findElement(By.xpath("//div[@role='alertdialog']")).isDisplayed();
		
		WebElement alertDialog = driverChrome.findElement(By.xpath("//div[@role='alertdialog']"));
		//System.out.println(alertDialog.getText());
		assert alertDialog.isDisplayed();
	}

}
