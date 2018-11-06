package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.NonReg_HomeScreenpage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NonReg_HomeScreen_Steps extends NonReg_HomeScreenpage{

	@Then("^Verify the homescreen button Register using card number$")
	public void verify_the_homescreen_button_Register_using_card_number() {
		VerifyRegbtn();
	}

	@Then("^Verify the homescreen link Register using your customer number$")
	public void verify_the_homescreen_link_Register_using_your_customer_number(){
		VerifyEnroll();
	}

	@Then("^Verify the homescreen link Contact Us$")
	public void verify_the_homescreen_link_Contact_Us() {
		VerifyContactUs();

	}

	@Then("^Verify the homescreen link Branch Locator$")
	public void verify_the_homescreen_link_Branch_Locator() {
		VerifyBranchLocator();
	 
	}
	
	@When("^Verify the toggle is English by default$")
	public void verify_the_toggle_is_English_by_default() {
		VerifyRegbtn();
	}

	@Then("^Tap on toggle button and change the language to Arabic$")
	public void tap_on_toggle_button_and_change_the_language_to_Arabic(){
		Change_toggle_button();
	}

	@Then("^Verify the home screen language changed to Arabic$")
	public void verify_the_home_screen_language_changed_to_Arabic() throws Throwable {
		VerifyArabChange();
	}

	@Then("^Navigate to card number registration screens from home screen to confirm the language change$")
	public void navigate_to_card_number_registration_screens_from_home_screen_to_confirm_the_language_change(){
		NavigateCardReGArabCheck();
	}
	
	@Then("^Navigate to customer number registration screens from home screen to confirm the language change$")
	public void navigate_to_customer_number_registration_from_home_screen_to_confirm_the_language_change(){
		NavigateCusReGArabCheck();
		
	}

	@Then("^change the languate to english and verify the screen$")
	public void change_the_languate_to_english_and_verify_the_screen() {
		VerifyEngChange();
	}
}
