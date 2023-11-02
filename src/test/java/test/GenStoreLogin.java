package test;


import org.testng.annotations.Test;


public class GenStoreLogin extends GenStoreBaseClass {
	
	@Test
	public void login () {
		
		//genstorepages.clickOnElement(genstorepages.Country);
		genstorepages.clickOnElement(genstorepages.NameField);
		genstorepages.NameField.sendKeys("Herald");
		
		//Thread.sleep(1000);
		//AndroidUtility.scrollDown();
		//AndroidUtility.scollToText();
		
	}
}

