package test;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import pages.GenStorePages;

public class GenStoreBaseClass {

	AppiumDriverLocalService service;
	GenStorePages genstorepages;

	String mainjsloc = "C:\\Users\\COLLABERA.DIGITAL\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	String apploc = "C:\\Users\\COLLABERA.DIGITAL\\eclipse-workspace\\GenStoreApp\\src\\test\\resources\\app\\General-Store.apk";
	String appiumUrl = "http://127.0.0.1:4723";
	AndroidDriver driver;

	@BeforeTest
	public void startServerAndApp() {
		try {
			Properties properties = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\COLLABERA.DIGITAL\\eclipse-workspace\\"
					+ "GenStoreApp\\src\\test\\java\\config\\config.properties");

			properties.load(fis);
			
			String ipAddress = properties.getProperty("ipAddress");
			String portNo = properties.getProperty("port");
			String deviceName = properties.getProperty("androidDeviceName");
			String platformVersion = properties.getProperty("platformVersion");
			String platformName = properties.getProperty("platformName");
			
			service = new AppiumServiceBuilder().withAppiumJS(new File(mainjsloc))
					.withIPAddress(ipAddress).usingPort(Integer.parseInt(portNo)).build();
			
			service.start();
			
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName(deviceName);
			options.setPlatformName(platformName);
			options.setApp(apploc);
			options.setPlatformVersion(platformVersion);
			
			driver=new AndroidDriver(new URL(appiumUrl),options);
			
			genstorepages= new GenStorePages(driver);
			
		}

		catch (Exception e) 
		{
			System.out.println("error message" + e);
			e.printStackTrace();
		}
		
	}


	@AfterTest
	public void teardown() {
		System.out.println("Test Close");
		driver.quit();
	}
}


/*
 * NEW TESTCASE: 
 * 1. Test Case in Filling the form details for shopping
 * 2. Verify toast message for error validations 
 * 3. Scrolling in product list 
 * 4.Dynamically selecting Product by scanning list based on text
 * savinitw@gmail.com
 */