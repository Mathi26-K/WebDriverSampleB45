package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShadowDomTest {
	WebDriver driver;
  @Test
  
  public void ShadowDom() throws InterruptedException {
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://watir.com/examples/shadow_dom.html");
  
  WebElement shadowHost = driver.findElement(By.xpath("//div[@id='shadow_host']"));
  SearchContext context = shadowHost.getShadowRoot();
  WebElement shadowContent = context.findElement(By.cssSelector("span#shadow_content"));
  System.out.println("Shadow DOM content : "+ shadowContent.getText());
  SoftAssert softAssert = new SoftAssert();
  softAssert.assertEquals(shadowContent.getText(), "some text");
  
  WebElement innerShadowHost = context.findElement(By.cssSelector("div#nested_shadow_host"));
  SearchContext innerContext = innerShadowHost.getShadowRoot();
  WebElement InnerShadowContent = innerContext.findElement(By.cssSelector("div#nested_shadow_content"));
  System.out.println("Inner Shadow DOM content : "+ InnerShadowContent.getText());
  softAssert.assertEquals(InnerShadowContent.getText(), "nested text");
  softAssert.assertAll();
  
  driver.close();
  }
}
