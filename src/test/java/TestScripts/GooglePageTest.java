package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooglePageTest {
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
	  searchBox.sendKeys(Keys.ENTER);
	  System.out.println("Page Title 2 :"+ driver.getTitle());
	  driver.navigate().back(); 
	  System.out.println("Page Title 1 again :"+ driver.getTitle());
	  driver.navigate().forward();
	  System.out.println("Page Title 2 again :"+ driver.getTitle());
	  driver.close();
	  
  }
}
