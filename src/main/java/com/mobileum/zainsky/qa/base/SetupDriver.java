package com.mobileum.zainsky.qa.base;

import java.io.File;
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

public class SetupDriver {
	public static AndroidDriver<MobileElement> driver;
	public static Properties pro;
	static Capabilities desiredCapabilities;
	MobileElement elementM;
	WebDriverWait wait;
	String result;
	String huburl = "http://0.0.0.0:4723/wd/hub";
	/*String androidDevicename = "One Plus 2";
	String androidVersion = "6.0.1";*/
	String androidDevicename = "Galaxy Note4";
	String androidVersion = "6.0.1";
	/*String androidDevicename = "Mi A1";
	String androidVersion = "8.0.0";*/
	/*String androidDevicename = "Moto";
	String androidVersion = "7.1.1";*/
	String androidPlatform = "Android";
	String DesiredCapabilities;
	String BundleId ="com.mobileum.tdm.trips.zain";
	AppiumDriverLocalService appiumService;
	String appiumServiceUrl;
	
	/*public SetupDriver() {
		try {
			File src = new File("/Users/manishbajpai/Documents/workspace/ZainSkyPOM/src/main/java/com/mobileum/zainsky/qa/config/config.properties");
			FileInputStream fis1 = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception is =="+e.getMessage());
		}
		
	}*/
	
	
	public AndroidDriver<MobileElement> Setup() throws MalformedURLException, InterruptedException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apk/");
		File app = new File(appDir, "ZainSkyAppDebug20180418v1.apk");
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
		Thread.sleep(3000);
		
		
		/*driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(pro.getProperty("hubUrl"));*/
		return driver;
		}
	

}
