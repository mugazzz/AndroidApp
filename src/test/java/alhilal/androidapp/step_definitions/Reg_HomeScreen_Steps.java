package alhilal.androidapp.step_definitions;


import alhilal.androidapp.pages.Reg_HomeScreen_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reg_HomeScreen_Steps extends Reg_HomeScreen_Page{

	@When("^Close the app and relaunch the app to redirect registration screen$")
	public void close_the_app_and_relaunch_the_app_to_redirect_registration_screen() {	
		driver.close();
	}

	@Then("^Verify the pop up is displayed asking user to login by Facial recognition/fingerprints$")
	public void verify_the_pop_up_is_displayed_asking_user_to_login_by_Facial_recognition_fingerprints() {
		driver.launchApp();
	    VerifyFingerPopup();
	}
	
	@Then("^Verify the pop up is not displayed asking user to login by Facial recognition/fingerprints$")
	public void verify_the_pop_up_is_not_displayed_asking_user_to_login_by_Facial_recognition_fingerprints() {
		driver.launchApp();
	    VerifyNoFingerPopup();
	}

	@Then("^Dismiss the popup and verify the landing screen options and links$")
	public void dismiss_the_popup_and_verify_the_landing_screen_options_and_links() {
		ClosePopup();
		VerifyRegHome();
	}
	
	@Then("^Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen$")
	public void tap_on_Skip_without_Enable_the_Fingerprints_button_and_verify_the_screen_redirects_to_Dashboard_screen(){
		SkipEnableFingerPrint();
	}

	@Then("^Tap on English to Arabic language button$")
	public void tap_on_English_to_Arabic_language_button() {
	    driver.hideKeyboard();
	    TapOnArabicButton();
	}

	@Then("^Verify the Home screen Arabic contents$")
	public void verify_the_Home_screen_Arabic_contents() {
		VerifyArabLang();
	}
	
	@Then("^Tap on Arabic to English language button$")
	public void tap_on_Arabic_to_English_language_button() throws Throwable {
		driver.hideKeyboard();
		TapOnEnglishButton();
	}

	@Then("^Verify the Home screen English contents$")
	public void verify_the_Home_screen_English_contents() throws Throwable {
		VerifyRegHome();
	}
}
