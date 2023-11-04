package genstoreUtility;

import org.openqa.selenium.JavascriptExecutor;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class GenstoreUtils {
	static AndroidDriver driver;
	
	public GenstoreUtils(AndroidDriver driver) {
		GenstoreUtils.driver=driver;
	}
	
	
	public static void scrollDown() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 450, "width", 200, "height", 950,
			    "direction", "DOWN",
			    "percent", 10
			));
	}
	
	public static void scrollUp() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 450, "width", 200, "height", 950,
			    "direction", "UP",
			    "percent", 5
			));
	}
	
	public static void scollToText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))"));
		
	}
}
