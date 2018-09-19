/**
 * 
 */
package com.mobileum.zainsky.qa.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobileum.zainsky.qa.base.TestBase;
import com.mobileum.zainsky.qa.pages.EulaTC;


/**
 * @author manishbajpai
 *
 */
public class EulaPageTest extends TestBase {
	//TestBase initialization;
	EulaTC eulaTC;
	
	public EulaPageTest() {
		super();
	}
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		initialization();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		eulaTC = new EulaTC(driver);
		System.out.println("============Setup Ready============");
	}
	
	/*@Test(priority=0)
	public void EulaTitleTest() throws InterruptedException {
		//eulaTC = new EulaTC(driver);
		String title = eulaTC.validateEulaTitle();
		Assert.assertEquals(title, "Terms and Conditions");
		System.out.println("============Title Matched============");
		
	}*/
	
	@Test(priority=0)
	public void EulaTitleTest() {
		//eulaTC = new EulaTC(driver);
		String title = eulaTC.validateEulaTitle(driver);
		Assert.assertEquals(title, "Terms and Conditions");
		System.out.println("============Eula Title Matched============");		
	}
	
	@Test(priority=1)
	public void EulaTest() {
		String title = eulaTC.validateEulaTitle(driver);
		Assert.assertEquals(title, "Terms and Conditions");
		System.out.println("============Eula Title Matched============");
		eulaTC.EulaClick();
		System.out.println("============Eula Accepted============");		
		//Walkthrough walkthrough =  new Walkthrough(driver);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("============Test Closed============");
	}
	
	


}
