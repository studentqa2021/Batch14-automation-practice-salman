package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath="//*[contains(text(),'Sign in')]")
private WebElement signinbtn;

@FindBy(xpath="(//*[contains(@id,'email')])[2]")
private WebElement email;

@FindBy(xpath="//*[@id='passwd']")
private WebElement password;

@FindBy(xpath="//*[contains(@class,'icon-lock left')]")
private WebElement login;

public WebElement getSigninbtn() {
	return signinbtn;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}



}
