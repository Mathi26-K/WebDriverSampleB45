package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest {
	WebDriver driver;
  @Test
  public void searchJavaTest() throws InterruptedException {

	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://stqatools.com/demo/Multiselect.php");
	  System.out.println("Page Title 1 :"+ driver.getTitle());

	  Thread.sleep(3000);
	 
	  WebElement Date = driver.findElement(By.cssSelector("select.date_s"));
	  Select dateDropdown = new Select(Date);
	  dateDropdown.selectByVisibleText("1983");
	  Thread.sleep(3000);
	  
	  WebElement names = driver.findElement(By.cssSelector("select.name_s"));
	  Select NameDropdown = new Select(names);
	  NameDropdown.selectByVisibleText("Jonny Wayne");
	  NameDropdown.selectByValue("Martina");
	  NameDropdown.selectByIndex(3);
	  List<WebElement> rows = NameDropdown.getAllSelectedOptions();
	  for(WebElement DropdownDetails : rows) {
			System.out.println("Dropdown details :"+DropdownDetails.getText());
		}
	  Thread.sleep(4000);
	  driver.close();
	  
  }
}
;