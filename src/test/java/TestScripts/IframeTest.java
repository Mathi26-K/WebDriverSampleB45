package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeTest {
	WebDriver driver;
  @Test
  public void FrameHandle() throws InterruptedException {

	 
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  System.out.println("Page Title :"+driver.getTitle());
	  driver.switchTo().frame("mce_0_ifr");
	  
	 WebElement text = driver.findElement(By.id("tinymce"));
	 System.out.println("Text :"+text.getText());
	 
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
	 Thread.sleep(5000);
	 
	  driver.quit();
	  
  }
  	
  
}
