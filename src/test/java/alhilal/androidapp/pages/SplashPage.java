package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;
import static alhilal.androidapp.utils.AppStrings.*;

import java.time.Duration;

import org.hamcrest.CoreMatchers;

public class SplashPage extends CommonPage{
	
	public void VerifySplashscreen() {
		String xmlFormat = driver.getPageSource();
		assertThat(xmlFormat, CoreMatchers.containsString(splash));
		
	}
	
	public void Verifylandingscreen() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		
	}
	
	public void MovingApptoBackground(){
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		driver.runAppInBackground(Duration.ofSeconds(4));
	}
	
	public void RetriveAppFromBG(){
		driver.activateApp("com.ahb.mb.qa");
	}
	
	public void AbscenceOfSplashScreen() {
		String xmlFormat = driver.getPageSource();
		assertThat(xmlFormat, CoreMatchers.not(splash));
	}
	
}
