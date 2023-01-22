package week6.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test2EdTexchTestCases extends BaseClass {
  @Test
  public void testCase1() {
	  System.out.println("testCase1");
  }


  @BeforeClass
  public void beforeClass() {
	  System.out.println("testCase2: BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("testCase2: AfterClass");
  }


}
