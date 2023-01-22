package week6.day2;

import org.testng.annotations.Test;

public class LearnEnable {

	

	@Test
	public void createLead() {
		System.out.println("Create Lead");
		
	}
	
	@Test(enabled = false)
	public void editLead() {
		System.out.println("Edit Lead");
		
	}
	
	@Test
	public void deleteLead() {
		System.out.println("Delete Lead");
		
	}
	
}
