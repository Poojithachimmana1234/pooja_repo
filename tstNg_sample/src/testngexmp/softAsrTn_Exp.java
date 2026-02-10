package testngexmp;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAsrTn_Exp {
	@Test
	public void softAssertionExample() {
		SoftAssert softAssert=new SoftAssert();
		System.out.println("Test Started");
		softAssert.assertEquals(10,20,"Numbers are not equal");
		System.out.println("After first assertion");
		softAssert.assertTrue(false,"Condition is false");
		System.out.println("After second assertion");
		softAssert.assertAll();
		System.out.println("Test Completed");
	}

}
