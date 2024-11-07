package TestScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaScriptTest {
	WebDriver driver;
  @Test
  public void JsTest() throws InterruptedException {

	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.opencart.com/");
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  String strTitle = (String) js.executeScript("return document.title");
	  System.out.println("Title :"+ strTitle);
	  WebElement Button = (WebElement) js.executeScript("return document.getElementsByName('search')[0]");
	  Button.sendKeys("Hi");
	  Thread.sleep(3000);
	  
	  driver.close();
	  
  }
}
