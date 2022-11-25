package day3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertDemo {
	
	
	@Test(dependsOnMethods = "test2")
	public void test() {
		Assert.assertEquals(12, 12);
	}
	@Test
	public void test2() {
		Reporter.log("test 2 failed");
		Assert.assertTrue(false);
	}

}
