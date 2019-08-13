package testPackages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {

	WebDriver driver;
	@BeforeTest
	public void initializeThis() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/nihalsa/eclipse-workspace/POM2019/src/test/java/resources/dataProvider.properties");
		prop.load(fis);
		String browserName = prop.getProperty("webBrowser");
		String urlName = prop.getProperty("URL");
		int waitTime = Integer.parseInt(prop.getProperty("implicitWaitTime"));
		
		if(browserName.contains("chromeG"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/nihalsa/Desktop/FlexonAutomation/drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			driver.get(urlName);
		}
		else if(browserName.contains("firefox"))
		{
			
		}
		
	}
		@AfterTest
		public void closeThis() throws IOException
		{
			//driver.quit();
		
		
		
	
}
}