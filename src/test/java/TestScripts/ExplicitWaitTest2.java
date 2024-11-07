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

public class ExplicitWaitTest2 {
	WebDriver driver;
  @Test
  public void Explicit2() throws InterruptedException {

	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://uitestingplayground.com");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  WebElement Button = driver.findElement(By.xpath("//a[contains(text(),'Load Delay')]"));
	  Button.click();
	  WebElement Button2 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	  Button2.click();
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
