package TestScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutocompleteTest {
	WebDriver driver;
	public static final String expvalue = "javascript";
  @Test
  public void AutoComplete() throws InterruptedException {

	 
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/autocomplete/");
	  System.out.println("Page Title :"+driver.getTitle());
	  WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
	  driver.switchTo().frame(iframe);
	  
	 WebElement text = driver.findElement(By.xpath("//input[@id='tags']"));
	 text.sendKeys("sc");
	// Thread.sleep(5000);
	 List <WebElement> items = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
	 System.out.println("items numbers :"+items.size());
	 
	 for(WebElement item : items) {
		 System.out.println("items :"+item.getText());
		 if(item.getText().equalsIgnoreCase(expvalue)) {
			 item.click();
			
			 break;
		 }
	 }
	 
	  driver.quit();
	  
  }
  	
  
}
