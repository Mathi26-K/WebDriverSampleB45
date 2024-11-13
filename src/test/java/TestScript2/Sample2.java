package TestScript2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Sample2 {
	WebDriver driver;
	
	@Test
	public void testOne() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		System.out.println("Test1 in Sample 2..");
	}
	
	@Test(groups="Feature two")
	public void testTwo() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Test2 in Sample 2..");
	}
	
	@Test(groups="Feature one")
	public void testThree() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Test3 in Sample 2..");
	}
	
	@Test(invocationCount =4, threadPoolSize = 2, timeOut = 1000)
	public void testFoue() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Test4 in Sample 2..");
	}
}
