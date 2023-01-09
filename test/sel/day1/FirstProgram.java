package test.sel.day1;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action = new Actions(driver);
		String verTitle1 = "Manager Time Punch Approval Form";
		String verTitle2 = "Manager Time Punch Approval History";

		driver.get("http://stage.ashleynet.com/SiteLogin/Forms/Login.aspx?hm=1&hmt=1&hph=1");
		WebElement userId = driver.findElement(By.id("txtUserID"));
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		js.executeScript("arguments[0].style.border='3px solid red'", userId);
		js.executeScript("arguments[0].style.backgroundColor='yellow'", passWord);

		userId.sendKeys("ssufdarhussain");
		passWord.sendKeys("*Ashnov@2022");

		driver.findElement(By.id("cmdLogin")).click();

		List<WebElement> findSecurityMaint = driver.findElements(By.id("awmAnchor-SiteNavigation"));
		for (WebElement webElement : findSecurityMaint) {
			String menu = webElement.getText();
			System.out.println(menu);
		}

		WebElement supTools = driver.findElement(By.xpath("//a[contains(text(),'Supervisor Tools')]"));
		action.moveToElement(supTools).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Time Punch Approval')]")).click();
		String manTitle1 = driver.getTitle();
		Assert.assertEquals(verTitle1, manTitle1);
		System.out.println(manTitle1);

		List<WebElement> legendEle = driver.findElements(By.xpath("//div[@class='legenddiv floatleft']"));
		String legend;
		if (legendEle.size() > 0) {
			for (WebElement names : legendEle) {

				legend = names.getText();
				System.out.println(legend);
			}
		} else {
			System.out.println("No Legends");
			driver.close();
		}
		
		List<WebElement> findElements = driver.findElements(By.xpath("//th[@class='tblthcenter']"));
		for (WebElement webElement : findElements) {
			String timePunchApproval = webElement.getText();
			System.out.println(timePunchApproval);
		}
		
		driver.findElement(By.className("btnstartdate")).click();
		List<WebElement> popEle = driver.findElements(By.xpath("//table[@class='table table-striped']//th"));
		for (WebElement webElement : popEle) {
			String timePunchApprovalPop = webElement.getText();
			System.out.println(timePunchApprovalPop);
		}
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.className("btntogglefilter")).click();
		
		WebElement search1 = driver.findElement(By.id("ObjFilter_EmpNo"));
		search1.sendKeys(driver.findElement(By.xpath(" //td[@class='pendingnotified'][2]")).getText());
		driver.findElement(By.xpath(" //button[@class='btnfilter']")).click();
		
		
		action.scrollToElement(driver.findElement(By.xpath(" //div[@class='pagerdiv']"))).perform();
		
	}

}
