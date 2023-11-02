package genStoreTest;


import org.testng.annotations.Test;



public class GenStoreLogin extends GenStoreBaseClass {
	
	@Test
	public void login () throws InterruptedException {
		// 1. Test Case in Filling the form details for shopping 
		
		
		Thread.sleep(4000);
		genstorepages.clickOnElement(genstorepages.nameField);
		genstorepages.nameField.sendKeys("Herald");

		
	}
}
