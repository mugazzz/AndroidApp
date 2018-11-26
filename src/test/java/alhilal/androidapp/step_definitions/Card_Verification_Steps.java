package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Card_Verification_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Card_Verification_Steps extends Card_Verification_Page{
	
	@Then("^Check the My Cards section is available for user$")
	public void check_the_My_Cards_section_is_available_for_user(){
	   Check_For_MyCards();
	}

	@Then("^Tap on specific card and navigate to card details screen$")
	public void tap_on_specific_card_and_navigate_to_card_details_screen(){
	   Navigate_Card_Detail();
	}

	@Then("^Verify the available card limit and total outstanding balance$")
	public void verify_the_available_card_limit_and_total_outstanding_balance(){
	   Verify_Card_Details();
	}

	@Then("^Tap on card and navigate to verify card additional detail screen$")
	public void tap_on_card_and_navigate_to_card_additional_detail_screen() {
	  Verify_Add_Card_Details();
	}
	
	@Given("^Register using credit card to create existing user scenario$")
	public void register_using_credit_card_to_create_existing_user_scenario() {
	  Register_using_Credit_Card();
	}

	@Then("^Close and relaunch the app$")
	public void close_and_relaunch_the_app() {
	  driver.closeApp();
	  driver.launchApp();
	}

	@Then("^Verify the card section is not displayed in case of no cards$")
	public void verify_the_card_section_is_not_displayed_in_case_of_no_cards() {
	 Verify_Absence_Card_Section();
	}
	
	@Then("^Verify the Bill payment button is not displayed for specific card statuses$")
	public void verify_the_Bill_payment_button_is_not_displayed_for_specific_card_statuses() {
	 Verify_Absence_Bill_Payment();
	}

}