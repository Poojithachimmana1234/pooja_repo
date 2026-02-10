package testngexmp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest3 {
  @Test
  public void f() {
	  System.out.println("this is test class");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is test before");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is test after");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" this is aftersuite");
  }

}
