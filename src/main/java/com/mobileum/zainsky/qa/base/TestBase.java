package com.mobileum.zainsky.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class TestBase {	
	public AndroidDriver<MobileElement> driver;
	public static Properties prop;
	static Capabilities desiredCapabilities;
	MobileElement elementM;
	WebDriverWait wait;
	String result;
	static String huburl = "http://0.0.0.0:4723/wd/hub";
	/*String androidDevicename = "One Plus 2";
	String androidVersion = "6.0.1";*/
	static String androidDevicename = "Galaxy Note4";
	static String androidVersion = "6.0.1";
	/*String androidDevicename = "Mi A1";
	String androidVersion = "8.0.0";*/
	/*String androidDevicename = "Moto";
	String androidVersion = "7.1.1";*/
	/*String androidDevicename = "Lenovo A6010";
	String androidVersion = "5.0.2";*/
	static String androidPlatform = "Android";
	String DesiredCapabilities;
	String BundleId ="com.mobileum.tdm.trips.zain";
	AppiumDriverLocalService appiumService;
	String appiumServiceUrl;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/manishbajpai/Documents/workspace/ZainSkyPOM/src/main/java/com/mobileum/zainsky/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public AndroidDriver<MobileElement> initialization() throws MalformedURLException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apk/");
		File app = new File(appDir, "ZainSkyAppDebug.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, androidPlatform);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, androidDevicename);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidVersion);
		capabilities.setCapability(MobileCapabilityType.VERSION, androidVersion);
		capabilities.setCapability("PACKAGE_NAME", "com.mobileum.tdm.trips.zain");
		capabilities.setCapability("appActivity", "com.mobileum.tdm.trips.activitives.AdsActivity");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("resetKeyboard", true);
		capabilities.setCapability("noReset", false);
		capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		capabilities.setCapability("session-override", true);
		try {
			driver = new AndroidDriver<MobileElement>(new URL(huburl),capabilities);
		} catch(MalformedURLException e) {
			System.out.println("Appium is Starting");
			e.printStackTrace();
		} catch(SessionNotCreatedException e) {
			System.out.println("Stil Running");
		}
		System.out.println("Driver created "+ driver);
		return driver;		
	}
}
