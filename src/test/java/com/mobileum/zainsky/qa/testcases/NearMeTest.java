/**
 * 
 */
package com.mobileum.zainsky.qa.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
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
public class NearMeTest extends TestBase {
	EulaTC eulaTC;
	Walkthrough walkthrough;
	NearMe nearMe;
	
	public NearMeTest() {
		super();
	}
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		initialization();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		eulaTC = new EulaTC(driver);
		eulaTC.EulaClick();
		walkthrough = new Walkthrough(driver);
		walkthrough.WalkthroughConfirm();
		//nearMe = new NearMe(driver);
		System.out.println("=============ready===========");		
	}
	
	@Test(priority=1)
	public void NearMeScreenTest() {
		nearMe = new NearMe(driver);
		nearMe.InAppT(driver);
		System.out.println("=============In App Tutorial===========");
		String nearMetitle = nearMe.NearMeScreenTitle(driver);
		Assert.assertEquals(nearMetitle, "Explore Bengaluru");
		System.out.println("=============Title Matched===========");
		
	}
	
	/*@Test(priority=2)
	public void nearMetitlevalidate() {
		String nearMetitle = nearMe.NearMeScreenTitle(driver);
		Assert.assertEquals(nearMetitle, "Explore Bengaluru");
		System.out.println("=============Title Matched===========");
		
	}*/
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("============Test Closed============");
	}
	

}
