package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class LoginTest {
	WebDriver driver;
	Properties prop;
	@BeforeTest
	public void readProp() throws IOException {
		String path = System.getProperty("user.dir")+"//src//test/resources//configFiles//Config.properties";
		FileInputStream fin = new FileInputStream(path);
		prop = new Properties();
		prop.load(fin);
	}
	
	@BeforeMethod
	public void setUp() {
		String strBrowser = prop.getProperty("browser");
		if(strBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(strBrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	@Test (dataProvider = "LoginData")
	public void ValidTest(String strUser, String strPwd) {
		
		
		driver.get(prop.getProperty("url"));
		System.out.println("Page Title 1 :" + driver.getTitle());
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		// WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys(strUser);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(strPwd);
	    WebElement Submit = driver.findElement(By.className("radius"));
//		WebElement Submit = driver.findElement(By.className("fa fa-2x fa-sign-"));
		Submit.click();

		WebElement LogOut = driver.findElement(By.xpath("//i[contains(text(),'Logout')]"));
		LogOut.click();

		driver.close();
	}
	
	@DataProvider(name="LoginData")
	public Object[][] getData() throws CsvValidationException, IOException{
		String path = System.getProperty("user.dir")+"//src//test//resources//TestData//LoginData.csv";
		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader(path));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		String Cols[];
		ArrayList<Object> dataList = new ArrayList<Object>();
		while((Cols=reader.readNext())!= null) {
			Object[] records = {Cols[0],Cols[1]};
			dataList.add(records);
			
		}
		return dataList.toArray(new Object[dataList.size()][]);
		
	}
}

