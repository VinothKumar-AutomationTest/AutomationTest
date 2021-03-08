package com.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.BaseClass;

public class OrderPage extends BaseClass {

	public OrderPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="add-to-cart-button") private WebElement cartbutton;
	 @FindBy(xpath="//select[@name='quantity']") private WebElement selectclass;
	 @FindBy(xpath="//input[@class='a-button-input']") private WebElement addcartbutton;
	 
	 public WebElement getCartbutton() {
			return cartbutton;
		}

	 public WebElement getSelectclass() {
			return selectclass;
		}
	 public WebElement getAddcartbutton() {
			return addcartbutton;
		}
}
