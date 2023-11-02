package genstoreUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GenstoreUtils {
	static AndroidDriver driver;
	
	public GenstoreUtils(AndroidDriver driver) {
		GenstoreUtils.driver=driver;
	}
	
	
	public static void scollToText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))"));
		
	}
}
