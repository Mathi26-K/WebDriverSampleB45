package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorTest {
	WebDriver driver;
  @Test
  public void searchJavaTest() {
//	  ChromeOptions options = new ChromeOptions();
//	  options.setBrowserVersion("115");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationbookstore.dev/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement BookId = driver.findElement(RelativeLocator.with(By.tagName("li")));
	  BookId.click();
	  driver.close();
	  
  }
}
