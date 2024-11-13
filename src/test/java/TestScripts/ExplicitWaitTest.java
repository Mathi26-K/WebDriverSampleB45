package TestScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
	WebDriver driver;
  @Test
  public void Explicit() throws InterruptedException {

	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://uitestingplayground.com/ajax");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  WebElement Button = driver.findElement(By.id("ajaxButton"));
	  Button.click();
	  WebElement text = driver.findElement(By.cssSelector("div#content"));
	  wait.until(ExpectedConditions.textToBePresentInElement(text,"Data loaded with AJAX get request."));
	  Button.click();
	  driver.close();
	  
  }
}
