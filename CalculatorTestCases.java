package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorTestCases {
	public static String value2,value3,value4,addAns;
	@Test
	public  void testcase1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		CalculatorReusableFunctions  cf=new CalculatorReusableFunctions();
		driver.manage().window().maximize();
		cf.givenNavigateToCalculator(driver);
		Thread.sleep(5000);
		String RetAns=cf.ReusableFunction("423","'×'","525");
		cf.ValidateValue(RetAns);
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public  void testcase2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		CalculatorReusableFunctions  cf=new CalculatorReusableFunctions();
		driver.manage().window().maximize();
		cf.givenNavigateToCalculator(driver);
		Thread.sleep(5000);
		String RetAns=cf.ReusableFunction("4000","'/'","200");
		cf.ValidateValue(RetAns);
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public  void testcase3() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		CalculatorReusableFunctions  cf=new CalculatorReusableFunctions();
		driver.manage().window().maximize();
		cf.givenNavigateToCalculator(driver);
		Thread.sleep(5000);
		String RetAns=cf.ReusableFunction("-234234","'+'","345345");
		cf.ValidateValue(RetAns);
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public  void testcase4() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		CalculatorReusableFunctions  cf=new CalculatorReusableFunctions();
		driver.manage().window().maximize();
		cf.givenNavigateToCalculator(driver);
		Thread.sleep(5000);
		String RetAns=cf.ReusableFunction("234823","'–'","-23094823");
		cf.ValidateValue(RetAns);
		Thread.sleep(5000);
		driver.quit();
	}
	
}