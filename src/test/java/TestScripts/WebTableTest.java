package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
	WebDriver driver;
  @Test
  public void verifyBookDetails() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Page Title 1 :" + driver.getTitle());
		List<WebElement> list = driver.findElements(By.xpath("//td[contains(text(),'Learn Java')]//following-sibling::td"));
		System.out.println("List size"+list.size());
		for(WebElement listDetails : list) {
			System.out.println("Book details :"+listDetails.getText());
		}
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//descendant::tr"));
		System.out.println("rows size"+rows.size());
		for(WebElement rowDetails : rows) {
			System.out.println("Book details :"+rowDetails.getText());
		}
		driver.close();
		//https://github.com/Mathi26-K/WebDriverSampleB45
		
  }
}
