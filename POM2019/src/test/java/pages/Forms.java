package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forms {
WebDriver driver;

public  Forms(WebDriver driver)
{
	this.driver = driver;
}

/*
 * page factory
 * 
 */

@FindBy(id ="sum1")
public WebElement textbox1;

@FindBy(id = "sum2")
public WebElement textbox2;

@FindBy(xpath = "//*[@onclick =\'return total()']")
public WebElement getTotal;

@FindBy(id = "displayvalue")
public WebElement sum;



public void getSum(String value1, String value2)
{
	textbox1.sendKeys(value1);
	textbox2.sendKeys(value2);
}
public void getTotalButton()
{
	getTotal.click();
}

}
