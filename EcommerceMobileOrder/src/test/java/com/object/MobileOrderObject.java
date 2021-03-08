package com.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.BaseClass;

public class MobileOrderObject extends BaseClass{

public MobileOrderObject() {
		
		PageFactory.initElements(driver, this);
	}
	
 @FindBy(id="twotabsearchtextbox")private WebElement searchtextbox;
 @FindBy(id="nav-search-submit-button") private WebElement submit;
 @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']") private WebElement clickmobile;
 
 

public WebElement getClickmobile() {
	return clickmobile;
}

public WebElement getSearchtextbox() {
	return searchtextbox;
}

public WebElement getSubmit() {
	return submit;
}








}

//span[@class='a-size-medium a-color-base a-text-normal']

 








//input[@id='twotabsearchtextbox']

//input[@id='nav-search-submit-button']
