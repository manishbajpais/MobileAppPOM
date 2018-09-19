/**
 * 
 */
package com.mobileum.zainsky.qa.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobileum.zainsky.qa.base.TestBase;
import com.mobileum.zainsky.qa.pages.EulaTC;
import com.mobileum.zainsky.qa.pages.NearMe;
import com.mobileum.zainsky.qa.pages.Walkthrough;

/**
 * @author manishbajpai
 *
 */
public class WalkthroughTest extends TestBase {
	EulaTC eulaTC;
	Walkthrough walkthrough;
	NearMe nearMe;
	
	public WalkthroughTest() {
		super();
	}
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		initialization();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		eulaTC = new EulaTC(driver);
		eulaTC.EulaClick();
	}
	
	@Test
	public void WalkthroughDisplay() {
		walkthrough = new Walkthrough(driver);
		walkthrough.WalkthroughConfirm();
		System.out.println("============Walkthrough Displayed============");
		//NearMe nearMe = new NearMe(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("============Test Closed============");
	}
	

}
