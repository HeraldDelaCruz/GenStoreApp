package genStoreTest;

import org.testng.annotations.Test;
import genstoreUtility.GenstoreUtils;
public class GenStoreScrolltoProduct extends GenStoreBaseClass {
	
	@Test
	public void getShoeNamesandCount () throws InterruptedException {
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
		
		//GenstoreUtils.scollToText("Nike SFB Jungle");
		GenstoreUtils.scrollDown();
		
		genstorepages.getShoeNamesandCount();
		
		System.out.print("Test 3 : Complete");
		
	}
}
