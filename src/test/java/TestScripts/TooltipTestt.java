package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TooltipTestt {
	WebDriver driver;
  @Test
  public void ToolTipHandle() throws InterruptedException {

	 
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/tooltip/");
	  System.out.println("Page Title :"+driver.getTitle());
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  WebElement TooltiptextBox = driver.findElement(By.xpath("//input[@id='age']"));
	  TooltiptextBox.sendKeys(Keys.ARROW_DOWN);
	  TooltiptextBox.sendKeys("22");
	 WebElement Tooltiptext = driver.findElement(By.className("ui-tooltip-content"));
	// Tooltiptext.sendKeys(Keys.ARROW_DOWN);
	 System.out.println("Text :"+Tooltiptext.getText());
	 
	
	 Thread.sleep(5000);
	 
	  driver.quit();
	  
  }
  	
  
}
