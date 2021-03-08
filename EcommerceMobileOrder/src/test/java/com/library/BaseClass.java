package com.library;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver lanuchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		return driver= new ChromeDriver();
	}
	
	public static void loadurl(String url)
	{
		
		driver.get(url);
	    driver.manage().window().maximize();
	}
	

	public static void searchboxvalue(WebElement webelement,String keyword) 
	{
		webelement.sendKeys(keyword);
		
	}
	
	public  void dropDownList(WebElement e,int index) {
		
	      Select dropdown = new Select(e);
	      dropdown.selectByIndex(index); 
	     
	}
		
	    
	public static void clicksearch(WebElement webelement) 
	{
		webelement.click();
		
	}
	
	
	public static void windowhandling() 
	{
		 String MainWindow = driver.getWindowHandle();
		 
		   Set<String> s1 = driver.getWindowHandles();
		    Iterator<String> i1 = s1.iterator();
		 
		 while (i1.hasNext())
		       		      {
		 String ChildWindow = i1.next();
		 if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
		  driver.switchTo().window(ChildWindow);
		              
		 }
		
		       		      }
}
}