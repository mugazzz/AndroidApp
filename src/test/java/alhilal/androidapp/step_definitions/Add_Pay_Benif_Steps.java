package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import alhilal.androidapp.pages.Add_Pay_Benifi;
import cucumber.api.java.en.Then;

public class Add_Pay_Benif_Steps extends Add_Pay_Benifi{

	@Then("^Tap on the pay bills icon on tab bar$")
	public void tap_on_the_pay_bills_icon_on_tab_bar() {
	   Tap_Pay_Bill();
	}

	@Then("^Tap on Make a payment tab$")
	public void tap_on_Make_a_payment_tab(){
	   Tap_Make_Payment();
	}

	@Then("^Tap on Add payee option and navigate to add payee screen$")
	public void tap_on_Add_payee_option_and_navigate_to_add_payee_screen() {
	  Add_Payee();
	}

	@Then("^Select the service provider ADDC$")
	public void select_the_service_provider_ADDC() {
		clickOnElement(SELECT_SERVICE);
		clickOnElement(ADDC);
	}

	@Then("^Enter the ADDC consumer number$")
	public void enter_the_ADDC_consumer_number() {
		enterText(CON_NUMB, Pay_Cons1);
	}

	@Then("^Enter the ADDC nick name$")
	public void enter_the_ADDC_nick_name() {
		enterText(CON_NICK, Pay_nick1);
		driver.hideKeyboard();
	}
	
	@Then("^Select the service provider Salik$")
	public void select_the_service_provider_Salik() {
		clickOnElement(SELECT_SERVICE);
		clickOnElement(SALIK);
	}

	@Then("^Enter the salik consumer number$")
	public void enter_the_salik_consumer_number() {
		enterText(CON_NUMB, Pay_Cons);
	}

	@Then("^Enter the salik nick name$")
	public void enter_the_salik_nick_name() {
		enterText(CON_NICK, Pay_nick);
		driver.hideKeyboard();
	}
	
	@Then("^Enter the salik PIN number$")
	public void enter_the_salik_pin_name() {
		enterText(CON_PIN, Pay_pin);
		driver.hideKeyboard();
	}

	@Then("^Tap on Next button and verify the navigated screen for payee SALIK$")
	public void tap_on_Next_button_and_verify_the_navigated_screen_for_payee_SALIK() {
		Tap_Nxt_Scr_SALIK();
	}
	
	@Then("^Tap on Next button and verify the navigated screen for payee ADDC$")
	public void tap_on_Next_button_and_verify_the_navigated_screen_for_payee_ADDC() {
		Tap_Nxt_Scr_ADDC();
	}


	@Then("^Verify the screen redirected to successfully account payment beneficiary added screen$")
	public void verify_the_screen_redirected_to_successfully_account_payment_beneficiary_added_screen() {
		appiumHelpers.waitForVisibilityOfElement(CNF_IMG);
	}

	
}
