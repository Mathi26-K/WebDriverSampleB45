package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandleTest {
	WebDriver driver;
  @Test
  public void WindowHandle() throws InterruptedException {

	 
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://stqatools.com/demo/Windows.php");
	  String ParentWindow = driver.getWindowHandle();
	  System.out.println("ParentWindow ID :"+ ParentWindow);
	  
	  WebElement newTab = driver.findElement(By.xpath("//button[contains(text(),'    Click to open new Tab  ')]"));
	  newTab.click();
	  System.out.println("Page Title :"+driver.getTitle());
	  Set<String> tabs = driver.getWindowHandles();
	  System.out.println("No of tabs :"+ tabs.size());
	  
	  for(String childWin : tabs) {
		  System.out.println("windows..."+childWin);
		  if(!childWin.equalsIgnoreCase(ParentWindow)) {
			  driver.switchTo().window(childWin);
			  System.out.println("Child Window page title:"+ driver.getTitle() );
		  }
	  }
	  
	  driver.close();
	  driver.switchTo().window(ParentWindow);
	  System.out.println("Parent page title :"+driver.getTitle());
	  driver.findElement(By.xpath("//button[contains(text(),'    Click to open new Window  ')]")).click();
	  
	  driver.quit();
	  
  }
  	
  
}
