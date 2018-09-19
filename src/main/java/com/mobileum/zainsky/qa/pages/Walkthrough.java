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
public class Walkthrough {
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Get Started']")
	MobileElement WalkthroughClick;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Allow']")
	MobileElement WalkThroughPermission;
	
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'permission_allow_button')]")
	MobileElement LocationPermission;
	
	public Walkthrough(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void WalkthroughConfirm() {
		WalkthroughClick.click();
		WalkThroughPermission.click();
		LocationPermission.click();
		
		
	}
}

