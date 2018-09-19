/**
 * 
 */
package com.mobileum.zainsky.qa.pages;

import java.sql.Driver;
import java.util.List;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
public class FlyLOB {
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Fly']")
	MobileElement Fly;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Got it']")
	MobileElement InAppTFly;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Flights']")
	MobileElement FlightSearchPageTitle;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'llFrom')]")
	MobileElement FromFieldFlight;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Search for Airport']")
	MobileElement FromFieldInput;
	//sendkeys "BLR"
	
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]")
	MobileElement FromAirportSelect;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='To']")
	MobileElement ToFieldFlight;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Search for Airport']")
	MobileElement ToFieldInput;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	MobileElement ToAirportSelect;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Depart on']")
	MobileElement DepartOnCalendarClick;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Next month']")
	MobileElement NextMonthClick;
	
	@AndroidFindBy(xpath="//android.view.View[@index='11']")
	MobileElement DepartOnDate;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Return on']")
	MobileElement ReturnOnCalendarClick;
	
	@AndroidFindBy(xpath="//android.view.View[@index='23']")
	MobileElement ReturnOnDate;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Travellers']")
	MobileElement TravellerClick;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	MobileElement AdultSelect;
	
	/*@AndroidFindBy(xpath="")
	MobileElement ChildrenSelect;
	
	@AndroidFindBy(xpath="")
	MobileElement InfantSelect;*/
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	MobileElement TravellerSelect;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Class']")
	MobileElement ClassClick;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Economy']")
	MobileElement ClassSelect;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Search']")
	MobileElement SearchClick;
	
	/*@AndroidFindBy(xpath="")
	MobileElement FlightListView;
	
	@AndroidFindBy(xpath="")
	MobileElement FlightSelect;
	
	@AndroidFindBy(xpath="")
	MobileElement BackButton;
	
	@AndroidFindBy(xpath="")
	MobileElement NearMeHome;*/
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'flight_sort_time')]")
	MobileElement TimeSort;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'flight_sort_duration')]")
	MobileElement DurationSort;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'flight_sort_price')]")
	MobileElement PriceSort;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'menu_hotel_filter')]")
	MobileElement FilterClick;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='No Flights Found']")
	MobileElement NoFlights;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='BLR']")
	MobileElement FromTitle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='SFO']")
	MobileElement ToTitle;
	
	/*@AndroidFindBy(xpath="")
	MobileElement ListPageTitle;*/
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	MobileElement OkClick;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[contains(@resource-id,'card_view')]")
	MobileElement FlightCard;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Outbound:']")
	MobileElement OutBoundText;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Return:']")
	MobileElement ReturnText;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue Booking']")
	MobileElement BookFlight;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Disclaimer:']")
	MobileElement DisclaimerTitle;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Proceed']")
	MobileElement DisclaimerProceed;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	MobileElement BackButton;

	public FlyLOB(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void FlyLOBClick() {
		Fly.click();
	}
	
	public void FlightSearchInApp() {
		InAppTFly.click();
	}
	
	public String FlightSearchPageTitle() {
		return FlightSearchPageTitle.getText();
	}
	
	public void FromAirportSelect() {
		FromFieldFlight.click();
		FromFieldInput.sendKeys("BLR");
		FromAirportSelect.click();
	}
	
	public void ToAirportSelect() {
		ToFieldFlight.click();
		ToFieldInput.sendKeys("SFO");
		ToAirportSelect.click();
	}
	
	public void DepartOnDateSelect() {
		DepartOnCalendarClick.click();
		NextMonthClick.click();
		DepartOnDate.click();
		OkClick.click();
	}
	
	public void ReturnOnDateSelect() {
		ReturnOnCalendarClick.click();
		NextMonthClick.click();
		ReturnOnDate.click();
		OkClick.click();
	}
	
	public void Traveller() {
		TravellerClick.click();
		AdultSelect.click();
		TravellerSelect.click();
	}
	
	public void ClassSelect() {
		ClassClick.click();
		ClassSelect.click();
	}
	
	public void FlightSearchList() {
		SearchClick.click();
	}
	
	
	
	public String FlightFrom(AndroidDriver<MobileElement> driver) {
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@resource-id,'menu_hotel_filter')]")));
		return FromTitle.getText();
		
	}
	
	public String FlightTo(AndroidDriver<MobileElement> driver) {
		return ToTitle.getText();
	}
	
	public String NoFlightCondition(AndroidDriver<MobileElement> driver) {
		return NoFlights.getText();
	}
	
	public void SelectFlight() {
		FlightCard.click();		
	}
	
	
	public String FlightOutBound(AndroidDriver<MobileElement> driver) {
		return OutBoundText.getText();
	}
	
	public String FilghtReturn(AndroidDriver<MobileElement> driver) {
		return ReturnText.getText();
	}
	
	public void BookFlight() {
		BookFlight.click();
	}
	
	public String DisclaimerTitleMatch(AndroidDriver<MobileElement> driver) {
		return DisclaimerTitle.getText();
	}
	
	public void DisclaimerProceed() {
		DisclaimerProceed.click();		
	}
	
	public void BackNavigation() {
		BackButton.click();
	}
	
	public void Sort() {
		TimeSort.click();
		DurationSort.click();
		PriceSort.click();
	}
	
	public void FilterClick() {
		FilterClick.click();
	}
	

}
