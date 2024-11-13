package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	//@BeforeMethod 
	@BeforeTest
	public void setUpExtent() {
		extentReports = new ExtentReports();
		spark = new ExtentSparkReporter("test-output/sparkReporter.html");
		extentReports.attachReporter(spark);
		 
	}
	
		  @BeforeMethod
		  public void launch() {
				
				 driver = new ChromeDriver();
				  driver.manage().window().maximize();
		
	}
  @Test
  public void searchJavaTest() {
	  extentTest = extentReports.createTest("Java Test");
	  driver.get("https://www.google.co.in/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Java Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	//  Assert.assertEquals("Java tutorial - Google Search", driver.getTitle());
	  }
  @Test(retryAnalyzer = RetryAnalyzerImpl.class)
  public void searchSeleniumTest() {
	  extentTest = extentReports.createTest("Selenium Test");
	  driver.get("https://www.google.co.in/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Selenium Tutorial");
	  searchBox.sendKeys(Keys.ENTER);
	//  Assert.assertEquals("Selenium tutorial - Google Search", driver.getTitle());
	  
  }
 
  @AfterTest
  public void extentReports1() {
	  extentReports.flush();
	  //driver.close();

  }
  @AfterMethod
  public void close() {
	//  extentReports.flush();
	 driver.close();

  }
}
