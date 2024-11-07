package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DropdownIteration {
	WebDriver driver;
  @Test
  public void searchJavaTest() {
//	  ChromeOptions options = new ChromeOptions();
//	  options.setBrowserVersion("115");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Java Tutorial");
	  
	  List<WebElement> items = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']"));
	  for (int i=0; i<items.size(); i++) {
		  WebElement item = items.get(i);
		  if(item.getText().equalsIgnoreCase("java tutorial oracle")) {
			  item.click();
			  break;
		  }
	  }
  } 
  
}
