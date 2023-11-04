package genStoreTest;

import org.testng.annotations.Test;

public class GenStoreErrorValidation extends GenStoreBaseClass {
	
	@Test
	public void errorValidation () throws InterruptedException {
		//2. Verify toast message for error validations 
		
		//wait for app to load
		genstorepages.appLoading(); 
		
		//setup country
		//genstorepages.clickOnElement(genstorepages.countrybtn);
		//genstorepages.selectCountry();
				
		//setup gender to female
		genstorepages.clickOnElement(genstorepages.femalebtn);
		
		//submit
		genstorepages.clickOnElement(genstorepages.loginbtn);
		
		Thread.sleep(1000);
		
		//get toast message
		String toastMessage = genstorepages.getToastMessage();

        // Verify the toast message
        String expectedToastMessage = "Please enter your name";
        assert toastMessage.equals(expectedToastMessage) : "Toast message verification failed";
		
        System.out.print("Test 2 : Complete");
        
	}
}
