package br.sp.alex.core;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverManager {
	
	private static WebDriver driver;
	
		
	private DriverManager() {}
	
	public static WebDriver getDriver(){
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1200, 765));
			
		}
		
		return driver;			
	}
	
	public static void JS(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
	}
	
	
	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
