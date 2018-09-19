/**
 * 
 */
package com.mobileum.zainsky.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author manishbajpai
 *
 */
public class NearMe {
	WebDriverWait wait;
	
	//@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tvExploreIcon')]")
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Swipe up for more']")
	MobileElement InAppGotit;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Explore Bengaluru']")
	MobileElement NearMePageTitle;
	
	public NearMe(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//commented code because of
	/*Finding '//android.widget.TextView[@content-desc='NEAR ME']' using 'XPATH' with the contextId: '' multiple: false*/
	/*public void InAppT(AndroidDriver<MobileElement> driver) {
		InAppGotit.click();
	}*/

	public void InAppT(AndroidDriver<MobileElement> driver) {
		//wait.until(ExpectedConditions.visibilityOf(InAppGotit));
		//wait.until(ExpectedConditions.visibilityOf(NearMePageTitle));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Swipe up for more']")));
		InAppGotit.click();
	}
	
	public String NearMeScreenTitle(AndroidDriver<MobileElement> driver) {
		//wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@text='Explore Bengaluru']")));
		//wait.until(ExpectedConditions.visibilityOf(NearMePageTitle));
		return NearMePageTitle.getText();
		
	}

	
}
