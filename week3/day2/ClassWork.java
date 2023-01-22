package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		String url = "https://amazon.in";
		String find = "phones";
		
		
		driverChrome.get(url);
		driverChrome.findElement(By.id("twotabsearchtextbox")).sendKeys(find);
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driverChrome.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement>phones=driverChrome.findElements(By.className("a-price-whole"));
		List<Integer> phoneprices = new ArrayList<Integer>();
		
		for (int i = 0; i < phones.size(); i++) {
			
			if(phones.get(i).getText() !="") {
				String whole = phones.get(i).getText().replaceAll(",", "");
				phoneprices.add(Integer.parseInt(whole));
			}
			
			
		}
		
		
		Collections.sort(phoneprices);
		System.out.println("List of low price :" + phoneprices.get(0));
		
		
		
		
	}

}
