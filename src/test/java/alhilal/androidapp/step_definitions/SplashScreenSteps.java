package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.SplashPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SplashScreenSteps extends SplashPage{
	
	@Given("^I am launching the fresh app$")
	public void i_am_launching_the_fresh_app() {
		VerifySplashscreen();
		
	}
	
	@Then("^Verify the screen redirected to landing page$")
	public void Verify_the_screen_redirected_to_landing_page() {
		Verifylandingscreen();
	}

	@Given("^Moving the app to device background$")
	public void moving_the_app_to_device_background() {
		MovingApptoBackground();
	}
	
	@Then("^Restore the app the app from background$")
	public void restore_the_app_the_app_from_background() {
		RetriveAppFromBG();
	}

	@Then("^Verify the splash screen is displayed$")
	public void verify_the_splash_screen_is_displayed(){
		AbscenceOfSplashScreen();
	}

}
