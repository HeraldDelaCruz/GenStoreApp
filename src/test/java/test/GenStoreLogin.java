package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import genstoreUtility.GenstoreUtils;
import pages.GenStorePages;

public class GenStoreLogin extends GenStoreBaseClass {
	

	@Test
	public void login () {
		
		//genstorepages.clickOnElement(genstorepages.Country);
		genstorepages.clickOnElement(genstorepages.NameField);
		genstorepages.NameField.sendKeys("Herald");
		
		//Thread.sleep(1000);
		//AndroidUtility.scrollDown();
		//AndroidUtility.scollToText("WebView");
		//AndroidUtility.scollToText();
		
	}
}
