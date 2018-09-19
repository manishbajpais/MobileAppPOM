/**
 * 
 */
package com.mobileum.zainsky.qa.testcases;


import org.testng.annotations.Test;

import com.mobileum.zainsky.qa.base.SetupDriver;
import com.mobileum.zainsky.qa.base.TestBase;
import com.mobileum.zainsky.qa.pages.EulaTC;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author manishbajpai
 *
 */
public class RegressionTestZain extends TestBase {
	AndroidDriver<MobileElement> driver;
	SetupDriver Setup;
	EulaTC eulaTC;
	
	public RegressionTestZain() {
		super();
	}
	
	/*@BeforeMethod
	public void setup() throws MalformedURLException {
		initialization();
		eulaTC = new EulaTC();
		System.out.println("============Setup Ready============");
	}*/
	
	@Test(priority=0)
	public void EulaTest() {
		//EulaTC Eulaclick = new EulaTC();
		//Eulaclick.EulaClick();
		//System.out.println("============Eula Accepted============");		
	}
	
	/*@Test(priority=1)
	public void WalkthroughTest() {
		Walkthrough walkthrough = new Walkthrough();
		walkthrough.WalkthroughConfirm();
		System.out.println("============WalkThrough Displayed============");
	}*/
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("============Test Closed============");
	}*/
	
}
