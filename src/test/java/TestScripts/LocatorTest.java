package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTest {
	WebDriver driver;

	@Test(enabled = true)
	public void LoginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Page Title 1 :" + driver.getTitle());
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		// WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("tomsmith");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("SuperSecretPassword!");
	    WebElement Submit = driver.findElement(By.className("radius"));
//		WebElement Submit = driver.findElement(By.className("fa fa-2x fa-sign-"));
		Submit.click();

		WebElement LogOut = driver.findElement(By.xpath("//i[contains(text(),'Logout')]"));
		LogOut.click();

		driver.close();
	}
}

