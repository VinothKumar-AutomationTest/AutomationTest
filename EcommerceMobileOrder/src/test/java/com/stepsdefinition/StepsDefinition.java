package com.stepsdefinition;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.library.BaseClass;
import com.object.MobileOrderObject;
import com.object.OrderPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepsDefinition extends BaseClass
{
WebDriver driver;
MobileOrderObject mainpage;
OrderPage orderPage;
	@Given("Launch chrome browser")
	public void launch_chrome_browser()
	{
	  
	driver=lanuchbrowser();
	}
	@Given("Enter amazon website")
	public void enter_amazon_website() 
	{
	    loadurl("https://www.amazon.in/");
	}


	@When("Search product {string} and Goto desired product details page")
	public void search_product_and_Goto_desired_product_details_page(String searchkeyword) 
	{
		mainpage=new MobileOrderObject();
	   searchboxvalue(mainpage.getSearchtextbox(),searchkeyword);
	   clicksearch(mainpage.getSubmit());
	   clicksearch(mainpage.getClickmobile());
	   windowhandling();
	  
	   
	}

	@When("Check the availability as In stock")
	public void check_the_availability_as_In_stock()
	{
		
		 if ( driver.getPageSource().contains("In stock")) 
		 {
	           System.out.println("Availble");
	       }else
	       {
	           System.out.println("Not in a stock");
	       }
		 
	   	}
	

	@When("Add product to cart \\(two qty)")
	public void add_product_to_cart_two_qty() 
	{
		
		 orderPage=new OrderPage();
		dropDownList(orderPage.getSelectclass(),1);
		
	}
	   	

	@Then("Go to the cart page and check the product names and total prices")
	public void go_to_the_cart_page_and_check_the_product_names_and_total_prices() throws AWTException 
	{
		orderPage=new OrderPage();
		//clicksearch(orderPage.getCartbutton());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement currentElement = driver.switchTo().activeElement();
	System.out.println(currentElement);
		//clicksearch(orderPage.getAddcartbutton());
		Assert.assertEquals(driver.getCurrentUrl().contains("Lenovo-Black-Storage-4000mAh-Battery"),driver.getPageSource().contains("Lenovo-Black-Storage-4000mAh-Battery" )); 
		//driver.quit();
	}
}
	
		
	