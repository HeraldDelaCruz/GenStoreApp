package genStoreTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import genstoreUtility.GenstoreUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GenStoreAddtoCart extends GenStoreBaseClass {
	
	@Test
	public void getShoeNamesandCount () throws Throwable {
		//3. Scrolling in product list
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		genstorepages.appLoading(); 
		
		//setup country
		genstorepages.clickOnElement(genstorepages.countrybtn);
		genstorepages.selectCountry();
		
		//setup users name
		genstorepages.clickOnElement(genstorepages.nameField);
		genstorepages.enterUsersname(genstorepages.nameField);
		
		//setup gender to female
		//genstorepages.clickOnElement(genstorepages.femalebtn);
		
		//hide keyboard
		genstorepages.hideKeyboard();
		
		//submit
		genstorepages.clickOnElement(genstorepages.loginbtn);
		
		Thread.sleep(1000);
		
		String userInput = "PG 3";
		
		//scroll to Shoes and add it to Cart
		GenstoreUtils.scollToText(userInput);
			
		//genstorepages.moveItemtoCenter(genstorepages.shoeId);
		//GenstoreUtils.scrollUp();
		
		genstorepages.addtoCart();
		
		//navigate to Cart page
		genstorepages.clickOnElement(genstorepages.addToCartBasket);
		
		Thread.sleep(1000);
		
		//Verify product added to Cart
		String shoeDetails = genstorepages.getShoeDetails(userInput);
		
		System.out.println(shoeDetails);
		
		String expectedshoeDetails = userInput;
        assert shoeDetails.equals(expectedshoeDetails) : "Incorrect Shoe";
		
		System.out.print("Test 4 : Complete");
		
	}
}
