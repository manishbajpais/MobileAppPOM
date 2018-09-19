/**
 * 
 */
package com.mobileum.zainsky.qa.pages;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author manishbajpai
 *
 */

public class EulaTC{
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Terms and Conditions']")
	MobileElement EulaTitle;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text='I have read and agree to above T&C.']")
	MobileElement TCClick;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Agree']")
	MobileElement TCAgree;
	
	public EulaTC(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver,this);
	}
	
	public String validateEulaTitle(AndroidDriver<MobileElement> driver) {
		
		return EulaTitle.getText();
	}
	
	public void EulaClick() {
		TCClick.click();
		TCAgree.click();		
	}
	
}
