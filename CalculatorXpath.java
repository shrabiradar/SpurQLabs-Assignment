package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorXpath {
	static WebDriver driver;
	public static String numbFunc (String number)
    {
		String Xpath = "//span[text()="+number+"]";
		return Xpath;
    }
	
	public static String operatorFunc(String Opeartor)
	{
		String Xpath = "//span[text()='+opeartor+']";
		return Xpath;
		
	}
	
}
