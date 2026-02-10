package testngexmp;

import org.testng.annotations.Test;

public class prior_exp {
	@Test(priority=2)
	public void back() {
		System.out.println("This is back seat");
	}
	@Test(priority=1)
    public void front()
    {
		System.out.println("This is front seat");
    }
	@Test
	public void driver() {
		System.out.println("Test is driver seat");
	}
	@Test(priority=3)
	public void baby() {
		System.out.println("This is baby seat");
	}
}
