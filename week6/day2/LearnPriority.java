package week6.day2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LearnPriority {
	@BeforeClass
	public void testMethod() {
		System.out.println("Test Method");
	}
	
	@BeforeClass
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test(priority=-1)
	public void createLead() {
		System.out.println("Create Lead");
		
	}
	
	@Test
	public void editLead() {
		System.out.println("Edit Lead");
		
	}
	
	@Test(priority=3)
	public void deleteLead() {
		System.out.println("Delete Lead");
		
	}
	
}
