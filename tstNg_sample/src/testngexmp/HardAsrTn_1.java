package testngexmp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsrTn_1 {
	@Test
	public void HardAssertionExample(){
		System.out.println("Test Started");
		Assert.assertEquals(10, 20,"Numbers are not equal");
		System.out.println("Test Completed");
	}

}
 