package testPackages;

import static org.testng.Assert.assertEquals;

import java.text.Normalizer.Form;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import pages.Forms;

public class TestCases extends TestBase {
	
	@Test(priority = 1, dataProvider = "newdata")
	public void getSums(String value1, String value2) {
		
		Forms f = PageFactory.initElements(driver,  Forms.class);
		f.textbox1.sendKeys(value1);
		f.textbox2.sendKeys(value2);
		f.getTotal.click();
		Assert.assertEquals(3, Integer.parseInt(value1)+Integer.parseInt(value2), "Test passed");
	}		
		@DataProvider( name = "newdata")
		public Object[][] getData(){
			Object[][] data = new Object[1][2];
			data[0][0] = "1";
			data[0][1] = "2";
			return data;
			
			
		}
}
	
