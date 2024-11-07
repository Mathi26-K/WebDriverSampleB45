package TestScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertTest {
	WebDriver driver;
  @Test
  public void AlertHandle() throws InterruptedException {
//	  ChromeOptions options = new ChromeOptions();
//	  options.setBrowserVersion("115");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/alerts");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	 
	  WebElement Alert1 = driver.findElement(By.id("alertButton"));
	  WebElement Alert2 = driver.findElement(By.id("confirmButton"));
	  WebElement Alert3 = driver.findElement(By.id("promtButton"));
	 
	  Alert3.sendKeys(Keys.DOWN);
	  Alert1.click();
	  Thread.sleep(3000);
	  Alert alert = driver.switchTo().alert();
	  System.out.println("Alert 1 :"+alert.getText());
	  alert.accept();
	  

	 
	  Alert2.click();
	  Thread.sleep(3000);
	  Alert Confirm = driver.switchTo().alert();
	  System.out.println("Alert 2 :"+Confirm.getText());
	  Confirm.dismiss();
	  
	  
	  Alert3.sendKeys(Keys.DOWN);
	  Alert3.click();
	  Thread.sleep(3000);
	  Alert promt = driver.switchTo().alert();
	  System.out.println("Alert 3 :"+promt.getText());
	  promt.sendKeys("Hi");
	  promt.accept();
	  
	  driver.close();
	  
  }
}
