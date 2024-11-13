package TestScripts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.Test;

public class CDPTest {
	ChromeDriver driver;
	DevTools devTools;
  @SuppressWarnings("unchecked")
@Test
  public void ToolTipHandle() throws InterruptedException {

	 
	  
	  driver = new ChromeDriver();
	  devTools = driver.getDevTools();
	  devTools.createSession(driver.getWindowHandle());
	  driver.manage().window().maximize();
	  
	  @SuppressWarnings({ "unchecked", "serial" })
	Map deviceMetrices = new HashMap(){ {
		  put("width",600);
		  put("height",900);
		  put("deviceScaleFactor",50);
		  put("mobile",true);
		  
		  
	  }};
	  driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrices);
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
