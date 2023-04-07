package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorReusableFunctions {

	private static String PAGE_URL="https://www.calculator.net/";
	private WebDriver driver;
	
	public void givenNavigateToCalculator(WebDriver driver){
		this.driver=driver;
	    driver.get(PAGE_URL);
	}
	
	public String ReusableFunction(String numb1,String operator,String numb2) throws InterruptedException
	{
		int numb1length = numb1.length();
		int numb2length = numb2.length();
		if(numb1length > 1) {
			if(numb1.startsWith("-")) {
				driver.findElement(By.xpath("//span[text()='–']")).click();
			for(int i=1;i<numb1length;i++) {
				driver.findElement(By.xpath(CalculatorXpath.numbFunc(String.valueOf(numb1.charAt(i))))).click();
			}
			}
			else
			{
				for(int i=0;i<numb1length;i++) {
					driver.findElement(By.xpath(CalculatorXpath.numbFunc(String.valueOf(numb1.charAt(i))))).click();
				}
			}
		}
		
		else  {
				driver.findElement(By.xpath(CalculatorXpath.numbFunc(numb1))).click();
		}
		driver.findElement(By.xpath(CalculatorXpath.numbFunc(operator))).click();
		if(numb2length > 1) {
			if(numb2.startsWith("-")) {
				driver.findElement(By.xpath("//span[text()='–']")).click();
			for(int i=1;i<numb2length;i++) {
				driver.findElement(By.xpath(CalculatorXpath.numbFunc(String.valueOf(numb2.charAt(i))))).click();	
			}
			}
			else {
				for(int i=0;i<numb2length;i++) {
					driver.findElement(By.xpath(CalculatorXpath.numbFunc(String.valueOf(numb2.charAt(i))))).click();	
				}
			}
		}
		else  {
				driver.findElement(By.xpath(CalculatorXpath.numbFunc(numb2))).click();
				
		}
		String funcAddAns = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("Answer is:"+funcAddAns);
		return funcAddAns;
	}
	
	public boolean ValidateValue(String RetAns)
	{
		String getAnswer = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		if(getAnswer == RetAns) {
			return true;
		}
		else {
			return false;
		}
	}
}
