package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RemoteWebDriverTest {
	WebDriver driver;
	
	
 @Test
  public void searchJavaTest() throws MalformedURLException {
	  ChromeOptions options = new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  String strHub = " http://10.0.12.12:4444";
	  driver = new RemoteWebDriver(new URL(strHub), options);
	//  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Java Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	//  Assert.assertEquals("Java tutorial - Google Search", driver.getTitle());
	  }
 
	  

  
  @AfterTest
  public void close() {
	  driver.close();

  }
}
