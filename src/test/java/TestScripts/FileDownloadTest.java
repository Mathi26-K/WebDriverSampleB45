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

public class FileDownloadTest {
	WebDriver driver;
  @Test
  
  public void FileDownload() throws InterruptedException {
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.16/");
  Thread.sleep(4000);
  driver.findElement(By.xpath("//a[contains(text(),'chromedriver_linux64.zip')]")).click();  
  Thread.sleep(4000);
  }
}
