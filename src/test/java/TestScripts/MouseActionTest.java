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

public class MouseActionTest {
	WebDriver driver;
  @Test
  public void searchJavaTest() throws InterruptedException {

	 
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--blink-settings=imagesEnabled=false");
	  driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  
	  Actions actions = new Actions(driver);
	  driver.get("https://demo.opencart.com/");
	  System.out.println("Page Title 1 :"+ driver.getTitle());
	  Thread.sleep(3000);

	  WebElement srcbox = driver.findElement(By.name("search"));
	//  actions.contextClick(srcbox).perform();
	  WebElement menu = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//descendant::a[(text()='Components')]"));
	  actions.moveToElement(menu).perform();
	  
	  //iterate and click the element
	  
	  
	  
	 // WebElement menuitem = driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(),'Monitors (2)')]"));
	//  actions.moveToElement(menu).click(menuitem).build().perform();
	  Thread.sleep(3000);
	 
	  
//	  actions.scrollToElement(driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"))).perform();
//	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
;