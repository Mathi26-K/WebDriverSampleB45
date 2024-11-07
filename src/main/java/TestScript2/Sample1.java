package TestScript2;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test(groups="Feature one")
	public void testOne() {
		System.out.println("Test1 in Sample 1..");
	}
	
	@Test(groups="Feature three")
	public void testTwo() {
		System.out.println("Test2 in Sample 1..");
	}
	
	@Test(groups="Feature two")
	public void testThree() {
		System.out.println("Test3 in Sample 1..");
	}
	
	@Test
	public void testFoue() {
		System.out.println("Test4 in Sample 1..");
	}
}
