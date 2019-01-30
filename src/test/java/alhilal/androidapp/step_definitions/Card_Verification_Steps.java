package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.AppStrings.*;

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
	
	@Given("^Verify the login check$")
	public void verify_login_check() {
		Verify_Login_check();
	}
	
	@Given("^Verify the login check tran$")
	public void verify_login_check_tran() {
		Verify_Login_check_tran();
	}
	
	@Given("^Verify the login reset$")
	public void verify_login_reset() {
		Verify_Login_Res();
	}
	
	@Given("^Verify the login debit$")
	public void verify_login_debit() {
		Verify_Login_debit();
	}
	
	@Given("^Verify the login credit$")
	public void verify_login_credit() {
		Verify_Login_credit();
	}
	
	@Given("^Verify the login Tpin$")
	public void verify_login_Tpin() {
		Verify_Login_Tpin();
	}
	
	@Given("^Verify the login check Acc$")
	public void verify_login_check_Acc() {
		Verify_Login_check_Acc();
	}
	
	@Given("^Verify the login check Card$")
	public void verify_login_check_card() {
		Verify_Login_check_Card();
	}
	
	@Given("^Verify the login check with Bio$")
	public void verify_login_check_Bio() {
		Verify_Login_check_Bio();
	}

	@Given("^Verify the login check with Bio1$")
	public void verify_login_check_Bio1() {
		Verify_Login_check_Bio1();
	}
	@Then("^Close and relaunch the app$")
	public void close_and_relaunch_the_app() {
	  driver.closeApp();
	  driver.launchApp();
	}

	@Then("^Verify the card section is displayed in case of no cards$")
	public void verify_the_card_section_is_not_displayed_in_case_of_no_cards() {
	 Verify_Absence_Card_Section();
	}
	
	@Then("^Verify the Bill payment button is displayed for specific card statuses$")
	public void verify_the_Bill_payment_button_is_not_displayed_for_specific_card_statuses() {
	 Verify_Presence_Bill_Payment();
	}
	
	@Given("^Register the user whose card should not show specific card status$")
	public void register_the_user_whose_card_should_not_show_specific_card_status() {
		Register_Specific_user_no_bill_pay();
	}

	@Given("^Verify the Bill payment option is not available for the user$")
	public void verify_the_Bill_payment_option_is_not_available_for_the_user() {
		Verify_Absence_Bill_Payment();
	}
	
	@Given("^Register the user who doesnot have card account$")
	public void register_the_user_who_doesnot_have_card_account() {
		Register_Specific_user(Act_Cust_No_Card, Act_SMS_PN_Spec_No_bill);
	}

}
