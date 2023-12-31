package genStoreTest;

import org.testng.annotations.Test;

public class GenStoreLogin extends GenStoreBaseClass {
	
	@Test
	public void login () throws InterruptedException {
		// 1. Test Case in Filling the form details for shopping 
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		genstorepages.appLoading(); 
		
		//setup country
		genstorepages.clickOnElement(genstorepages.countrybtn);
		genstorepages.selectCountry();
		
		//setup users name
		genstorepages.clickOnElement(genstorepages.nameField);
		genstorepages.enterUsersname(genstorepages.nameField);
		
		//setup gender to female
		genstorepages.clickOnElement(genstorepages.femalebtn);
		
		//hide keyboard
		genstorepages.hideKeyboard();
		
		//submit
		genstorepages.clickOnElement(genstorepages.loginbtn);
		
		
		System.out.print("Test 1 : Complete");
		
	}
}
