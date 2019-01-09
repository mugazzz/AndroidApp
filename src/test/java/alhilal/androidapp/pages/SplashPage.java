package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.Locators.*;

import java.time.Duration;

public class SplashPage extends CommonPage{
	
	public void VerifySplashscreen() {
		appiumHelpers.assertTrue(elementExists(SPLASH_VIDEO), "Splash screen is displayed");
		
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
		appiumHelpers.assertFalse(elementExists(SPLASH_VIDEO), "Splash screen is displayed");
	}
	
}
