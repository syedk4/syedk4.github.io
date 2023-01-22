package week6.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {
  @Test
  public void testCase2() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

}
