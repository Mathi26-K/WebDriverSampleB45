package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePageSearchTest {
	WebDriver driver;
	//@BeforeMethod 
	@BeforeTest
	public void launch() {
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		
	}
  @Test(enabled = true, dependsOnMethods= "searchSeleniumTest")
  public void searchJavaTest() {

	  driver.get("https://www.google.co.in/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Java Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	//  Assert.assertEquals("Java tutorial - Google Search", driver.getTitle());
	  }
  @Test(enabled = true)
  public void searchSeleniumTest() {
	  driver.get("https://www.google.co.in/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Selenium Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	//  Assert.assertEquals("Selenium tutorial - Google Search", driver.getTitle());
	  
  }
 // @Test(enabled = true,priority = -1)
  public void searchCucumberTest() {
	  driver.get("https://www.google.co.in/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Cucumber Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	//  Assert.assertEquals("Selenium tutorial - Google Search", driver.getTitle());
	  
  }
 // @Test(enabled = true, priority = 2)
  public void searchAppiumTest() {
	  driver.get("https://www.google.co.in/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Appium Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	//  Assert.assertEquals("Selenium tutorial - Google Search", driver.getTitle());
	  
  }
  @AfterTest
  public void close() {
	  driver.close();

  }
}
