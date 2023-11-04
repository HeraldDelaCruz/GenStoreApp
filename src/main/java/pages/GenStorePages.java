package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import genstoreUtility.GenstoreUtils;

public class GenStorePages extends GenstoreUtils {
	AndroidDriver driver;

	public GenStorePages(AndroidDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// page object
	@AndroidFindBy(id = "android:id/text1")
	public WebElement countrybtn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[8]")
	public WebElement antartica;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	public WebElement nameField;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
	public WebElement malebtn;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
	public WebElement femalebtn;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	public WebElement loginbtn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.Toast[1]")
	public WebElement toaster;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
	public WebElement shoeName;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/productAddCart")
	public List<WebElement> addToCartbtn;

	@AndroidFindBy(className = "android.widget.TextView")
	public WebElement shoeId;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement addToCartBasket;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
	public WebElement cartProductName;
	
	// methods
	public void navigateBack() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public void clickOnElement(WebElement ele) {
		ele.click();
	}

	String usersname = "Herald";
	public void enterUsersname(WebElement ele) {
		ele.sendKeys(usersname);
	}

	public void appLoading() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public String getText(WebElement ele) {
		return ele.getText();
	}

	public void selectCountry() {
		antartica.click();
	}

	public void hideKeyboard() {
		driver.hideKeyboard();
	}

	public String getToastMessage() {
		WebElement toastElem = driver.findElement(By.xpath(".//*[contains(@text, 'Please enter your name')]"));
		return toastElem.getText();
	}
	
	
	public void getShoeNamesandCount() {
		List<WebElement> shoeNameId = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));

		List<String> shoeName = new ArrayList<>();

		for (WebElement productElement : shoeNameId) {
			String productName = productElement.getText();

			shoeName.add(productName);

		int productCount = shoeName.size();
		System.out.println("Number of Shoes Listed: " + productCount);
		System.out.println("Jordan Shoes Names:");
		
		for (String name : shoeName) {
				System.out.println(name);
				
			}
		System.out.println("----");
		}

	}
	
	public void addtoCart () {
		addToCartbtn.get(1).click();
		
	}
	
	public void moveItemtoCenter(WebElement shoeId) {
		Dimension screenSize = driver.manage().window().getSize();
		
		org.openqa.selenium.Point elemLocation = shoeId.getLocation();
		
		int centerX = screenSize.width / 2;
        int centerY = screenSize.height / 2;
        
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(elemLocation.getX(), elemLocation.getY()))
            .moveTo(PointOption.point(centerX, centerY))
            .release()
            .perform();
	}

	public String getShoeDetails(String str) {
		WebElement cartProductName = driver.findElement(By.xpath(".//*[contains(@text, '" +str+ "')]"));
		return cartProductName.getText();
	}
	
	
}
