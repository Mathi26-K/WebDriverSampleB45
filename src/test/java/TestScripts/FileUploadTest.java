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

public class FileUploadTest {
	WebDriver driver;
  @Test
  public void FileUpload() throws InterruptedException {

	 
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	  WebElement addFile = driver.findElement(By.xpath("//input[@type='file']"));
	  String path = System.getProperty("user.dir")+"//download.jpg";
	  
	  addFile.sendKeys(path);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("(//i[@class='glyphicon glyphicon-upload'])[2]")).click();
	  driver.close();
	  
  }
  
}
