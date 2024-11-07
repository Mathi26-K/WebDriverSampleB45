package TestScript2;

import org.testng.annotations.Test;

public class Sample3 {
	
	@Test
	public void testOne() {
		System.out.println("Test1 in Sample 3..");
	}
	
	@Test(groups="Feature one")
	public void testTwo() {
		System.out.println("Test2 in Sample 3..");
	}
	
	@Test
	public void testThree() {
		System.out.println("Test3 in Sample 3..");
	}
	
	@Test(groups="Feature three")
	public void testFoue() {
		System.out.println("Test4 in Sample 3..");
	}
}
