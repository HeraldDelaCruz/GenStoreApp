package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import genstoreUtility.GenstoreUtils;

public class GenStorePages extends GenstoreUtils {
	AndroidDriver driver;
	
	public GenStorePages (AndroidDriver driver) {
		
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	public WebElement Country;
	
	//jump to country , canada
	@AndroidFindBy()
	public WebElement Canada;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement NameField;

	
	
	
	public void navigateBack() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public void clickOnElement(WebElement ele) {
		ele.click();
	}
	
	public String getText(WebElement ele) {
		return ele.getText();
	}
	
}
