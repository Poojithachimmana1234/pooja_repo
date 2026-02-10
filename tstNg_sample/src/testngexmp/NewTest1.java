package testngexmp;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest1 {
	@BeforeGroups
	public void bgroup() {
		System.out.println("The Test is tommorow");
	}
	@AfterGroups
	public void agroup() {
		System.out.println("Results will be announced shortly!!");
	}
  @Test(groups= {"Assesment"})
  public void test() {
	  System.out.println("welcome to the assessment");
  }
  @Test
  public void test1() {
	  System.out.println("All the best");
	  
  }
  @Test(groups= {"Assessment"})
  public void test2() {
	  System.out.println("pass percentage is 60");
  }
}
