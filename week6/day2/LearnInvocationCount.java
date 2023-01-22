package week6.day2;

import org.testng.annotations.Test;

public class LearnInvocationCount {

	@Test(invocationCount = 3)
	public void createLead() {
		System.out.println("Create Lead");
		
	}
	
}
