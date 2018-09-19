/**
 * 
 */
package com.mobileum.zainsky.qa.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobileum.zainsky.qa.base.TestBase;
import com.mobileum.zainsky.qa.pages.EulaTC;
import com.mobileum.zainsky.qa.pages.FlyLOB;
import com.mobileum.zainsky.qa.pages.NearMe;
import com.mobileum.zainsky.qa.pages.Walkthrough;

/**
 * @author manishbajpai
 *
 */
public class FlyLOBTest extends TestBase {
	EulaTC eulaTC;
	Walkthrough walkthrough;
	NearMe nearMe;
	FlyLOB flyLOB;
	
	public FlyLOBTest() {
		super();
	}
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		initialization();
		eulaTC = new EulaTC(driver);
		eulaTC.EulaClick();
		walkthrough = new Walkthrough(driver);
		walkthrough.WalkthroughConfirm();
		nearMe = new NearMe(driver);
		nearMe.InAppT(driver);
		nearMe.NearMeScreenTitle(driver);
		System.out.println("=============ready===========");		
	}
	
	@Test(priority=1)
	public void FlightTest() {
		flyLOB = new FlyLOB(driver);
		flyLOB.FlyLOBClick();
		String FlightSearchTitle = flyLOB.FlightSearchPageTitle();
		Assert.assertEquals(FlightSearchTitle, "Flights");
		System.out.println("=============Flight Search Page Title Matched===========");
		flyLOB.FlightSearchInApp();
		System.out.println("=============Flight Page In App Tutorial===========");
		
	}
	
	@Test(priority=2)
	public void RoundTripFlightSearch() {
		flyLOB = new FlyLOB(driver);
		flyLOB.FromAirportSelect();
		flyLOB.ToAirportSelect();
		flyLOB.DepartOnDateSelect();
		flyLOB.ReturnOnDateSelect();
		flyLOB.Traveller();
		flyLOB.ClassSelect();
		flyLOB.FlightSearchList();		
	}
	
	@Test(priority=3)
	public void RoundTripFilghtList() {
		flyLOB = new FlyLOB(driver);
		String flightFrom = flyLOB.FlightFrom(driver);
		Assert.assertEquals(flightFrom, "BLR");
		System.out.println(flightFrom);
		//String flightTo = flyLOB.
		String flightTo = flyLOB.FlightTo(driver);
		Assert.assertEquals(flightTo, "SFO");
		System.out.println(flightTo);
		System.out.println("=============Title Matched=============");
	}
	
	@Test(priority=4)
	public void RoundTripFlightDetails() {
		flyLOB = new FlyLOB(driver);
		/*if(driver.findElement(By.xpath("//android.widget.TextView[@text='No Flights Found']"))!=null){			
			System.out.println("=============Flight List View not Displayed=============");			
		}
		else {
			flyLOB.SelectFlight();
			System.out.println("Filght Not found");
		}*/
		flyLOB.SelectFlight();
		String OutBoundJ = flyLOB.FlightOutBound(driver);
		Assert.assertEquals(OutBoundJ, "Outbound:");
		System.out.println("=============Outboud text Matched=============");
		String ReturnJ = flyLOB.FilghtReturn(driver);
		Assert.assertEquals(ReturnJ, "Return:");
		System.out.println("=============Return text Matched=============");
	}
	
	@Test(priority=5)
	public void BookFlight() {
		flyLOB = new FlyLOB(driver);
		flyLOB.BookFlight();
		String TitleDisclamer = flyLOB.DisclaimerTitleMatch(driver);
		Assert.assertEquals(TitleDisclamer, "Disclaimer:");
		System.out.println("=============Disclaimer Displayed=============");		
		flyLOB.DisclaimerProceed();
		System.out.println("=============Deep link URL is opening=============");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=6)
	public void NavigateBack() {
		flyLOB = new FlyLOB(driver);
		flyLOB.BackNavigation();
		System.out.println("=============Back To Details View=============");
		flyLOB.BackNavigation();
		System.out.println("=============Back To List View=============");
		/*flyLOB.BackNavigation();
		System.out.println("=============Back To List View=============");
		*/
	}
	
	@Test(priority=7)
	public void FlightSort() {
		flyLOB = new FlyLOB(driver);
		flyLOB.Sort();
		System.out.println("=============Sorting is working=============");
	}
	
	@Test(priority=8)
	public void FlightFiler() {
		flyLOB = new FlyLOB(driver);
		flyLOB.FilterClick();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("============Test Closed============");
	}
}
