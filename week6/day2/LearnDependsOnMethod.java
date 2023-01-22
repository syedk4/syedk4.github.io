package week6.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {

	@Test
	public void createLead() {
		System.out.println("Create Lead");
		
	}
	
	@Test (dependsOnMethods = "createLead", priority = 1)
	public void editLead() {
		System.out.println("Edit Lead");
		
	}
	
	@Test (dependsOnMethods = {"createLead","editLead"})
	public void deleteLead() {
		System.out.println("Delete Lead");
		
	}
	
}
