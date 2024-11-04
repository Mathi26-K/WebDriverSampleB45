package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DoubleClick {
	WebDriver driver;
  @Test
  public void searchJavaTest() throws InterruptedException {

	 
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  Actions actions = new Actions(driver);
	  driver.get("https://stqatools.com/demo/DoubleClick.php");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  Thread.sleep(3000);

	  WebElement srcbox = driver.findElement(By.xpath("//button[contains(text(),'Click Me / Double Click Me!')]"));
	  actions.doubleClick(srcbox);
	 
	  Thread.sleep(3000);

	  driver.close();
	  
  }
}
;