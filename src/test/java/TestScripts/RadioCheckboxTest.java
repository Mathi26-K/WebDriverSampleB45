package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RadioCheckboxTest {
	WebDriver driver;
  @Test
  public void searchJavaTest() throws InterruptedException {

	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  System.out.println("Page Title 1 :"+ driver.getTitle());

	  Thread.sleep(3000);
	  WebElement CheckBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	  CheckBox.click();
	  Thread.sleep(3000);
	  WebElement CheckBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	  if(CheckBox2.isSelected()) {
		  CheckBox2.click();
	  }
	  driver.close();
	  
  }
}
;