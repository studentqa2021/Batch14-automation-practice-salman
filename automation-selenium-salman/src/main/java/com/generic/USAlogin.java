package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.HighLighter;

import com.util.TakeScreenShot;


public class USAlogin implements Login  {

	@Override
	public void getlogin() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(BaseConfig.getconfig("URL"));
		driver.manage().window().maximize();
		MasterPageFactory obj=new MasterPageFactory(driver);
		TakeScreenShot.getscreenshot(driver, "firstscreenshot");
		HighLighter.gethlighter(driver, obj.getSigninbtn());
		obj.getSigninbtn().click();
		TakeScreenShot.getscreenshot(driver, "emailfield");
		HighLighter.gethlighter(driver,obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getconfig("user"));
		//HighLighter.gethlighter(driver,	obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getconfig("password"));
		TakeScreenShot.getscreenshot(driver, "afetlogin");
		HighLighter.gethlighter(driver,	obj.getLogin());
		obj.getLogin().click();
		driver.quit();
	}

}
