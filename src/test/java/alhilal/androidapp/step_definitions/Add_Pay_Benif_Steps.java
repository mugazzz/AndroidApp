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

	@Then("^Select the service provider DEWA$")
	public void select_the_service_provider_DEWA() {
		clickOnElement(SELECT_SERVICE);
		clickOnElement(DEWA);
	}

	@Then("^Enter the DEWA consumer number$")
	public void enter_the_DEWA_consumer_number() {
		enterText(CON_NUMB, Pay_Cons3);
	}
	
	@Then("^Enter the DEWA consumer number1$")
	public void enter_the_DEWA_consumer_number1() {
		enterText(CON_NUMB, Pay_Cons4);
	}

	@Then("^Enter the DEWA nick name$")
	public void enter_the_DEWA_nick_name() {
		enterText(CON_NICK, Pay_nick3);
		driver.hideKeyboard();
	}
	
	@Then("^Enter the DEWA nick name1$")
	public void enter_the_DEWA_nick_name1() {
		enterText(CON_NICK, Pay_nick4);
		driver.hideKeyboard();
	}
	
	@Then("^Enter the DEWA nick name2$")
	public void enter_the_DEWA_nick_name2() {
		enterText(CON_NICK, Pay_nick6);
		driver.hideKeyboard();
	}
	
	@Then("^Select the service provider ADDC$")
	public void select_the_service_provider_ADDC() {
		clickOnElement(SELECT_SERVICE);
		clickOnElement(ADDC);
	}

	@Then("^Enter the AADC consumer number$")
	public void enter_the_AADC_consumer_number() {
		enterText(CON_NUMB, Pay_Cons2);
	}

	@Then("^Enter the AADC nick name$")
	public void enter_the_AADC_nick_name() {
		enterText(CON_NICK, Pay_nick2);
		driver.hideKeyboard();
	}
	
	@Then("^Enter the AADC consumer number1$")
	public void enter_the_AADC_consumer_number1() {
		enterText(CON_NUMB, Pay_Cons5);
	}

	@Then("^Enter the AADC nick name1$")
	public void enter_the_AADC_nick_name1() {
		enterText(CON_NICK, Pay_nick5);
		driver.hideKeyboard();
	}
	
	@Then("^Select the service provider AADC$")
	public void select_the_service_provider_AADC() {
		clickOnElement(SELECT_SERVICE);
		clickOnElement(AADC);
	}
	
	@Then("^Select the service provider SEWA$")
	public void select_the_service_provider_SEWA () {
		clickOnElement(SELECT_SERVICE);
		clickOnElement(SEWA );
	}

	@Then("^Enter the ADDC consumer number$")
	public void enter_the_ADDC_consumer_number() {
		enterText(CON_NUMB, Pay_Cons1);
	}
	
	@Then("^Enter the ADDC consumer number1$")
	public void enter_the_ADDC_consumer_number1() {
		enterText(CON_NUMB, Pay_Cons6);
	}
	
	@Then("^Enter the AADC incorrect consumer number$")
	public void enter_the_ADDC_incorrect_onsumer_number() {
		enterText(CON_NUMB, Pay_inCons);
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
		//driver.hideKeyboard();
	}
	
	@Then("^Enter the salik PIN number$")
	public void enter_the_salik_pin_name() {
		enterText(CON_PIN, Pay_pin);
		//driver.hideKeyboard();
	}

	@Then("^Tap on Next button and verify the navigated screen for payee SALIK$")
	public void tap_on_Next_button_and_verify_the_navigated_screen_for_payee_SALIK() {
		Tap_Nxt_Scr_SALIK();
	}
	
	@Then("^Tap on Next button and verify the navigated screen for payee ADDC$")
	public void tap_on_Next_button_and_verify_the_navigated_screen_for_payee_ADDC() {
		Tap_Nxt_Scr_ADDC();
	}
	
	@Then("^Tap on Next button and verify the navigated screen for payee AADC$")
	public void tap_on_Next_button_and_verify_the_navigated_screen_for_payee_AADC() {
		Tap_Nxt_Scr_AADC();
	}
	
	@Then("^Tap on Next button and verify the navigated screen for payee AADC1$")
	public void tap_on_Next_button_and_verify_the_navigated_screen_for_payee_AADC1() {
		Tap_Nxt_Scr_AADC1();
	}
	
	@Then("^Tap on Next button and verify the navigated screen for payee DEWA$")
	public void tap_on_Next_button_and_verify_the_navigated_screen_for_payee_DEWA() {
		Tap_Nxt_Scr_DEWA();
	}
	
	@Then("^Tap on Next button and verify the navigated screen for payee DEWA1$")
	public void tap_on_Next_button_and_verify_the_navigated_screen_for_payee_DEWA1() {
		Tap_Nxt_Scr_DEWA1();
	}

	@Then("^Verify the screen redirected to successfully account payment beneficiary added screen$")
	public void verify_the_screen_redirected_to_successfully_account_payment_beneficiary_added_screen() {
		appiumHelpers.waitForVisibilityOfElement(CNF_IMG);
	}
	
	@Then("^Tap confrim details button and verify the cofirm finger print popup appears1$")
	public void tap_confrim_details_button_and_verify_the_cofirm_finger_print_popup_appears1() {
	   Verify_Fing_Pop();
	}
	
	@Then("^Tap on Next button and verify validation message appears$")
	public void tap_confrim_details_button_and_verify_message_validation() {
	   Verify_validation();
	}
	
	@Then("^Tap on next button and verify the validation message$")
	public void tap_on_next_button_and_verify_the_validation_message1() {
		Verify_validation_Gsm();
	}
	
	@Then("^Tap on next button and verify the validation message1$")
	public void tap_on_next_button_and_verify_the_validation_message2() {
		Verify_validation_Gsm1();
	}
	
	@Then("^Tap on next button and verify the validation message2$")
	public void tap_on_next_button_and_verify_the_validation_message3() {
		Verify_validation_Gsm2();
	}
	
	@Then("^Tap on next button and verify the validation message3$")
	public void tap_on_next_button_and_verify_the_validation_message4() {
		Verify_validation_Gsm3();
	}
	
	@Then("^Tap on next button and verify the validation message4$")
	public void tap_on_next_button_and_verify_the_validation_message5() {
		Verify_validation_Gsm4();
	}
	
	@Then("^Tap on Next button and verify validation message appears for dup consumer$")
	public void tap_confrim_details_button_and_verify_message_validation_dup_cons() {
	   Verify_validation_dup_con();
	}
	
	@Then("^Tap on Next button and verify validation message appears for dup nick$")
	public void tap_confrim_details_button_and_verify_message_validation_dup_nick() {
	   Verify_validation_dup_nick();
	}
	
	@Then("^Select the service provider Etisalat$")
	public void select_the_service_provider_Etisalat() {
		clickOnElement(SELECT_SERVICE);
		clickOnElement(ETISALAT);
	}

	@Then("^Select the service type of etisalat$")
	public void select_the_service_type_of_etisalat() {
		clickOnElement(SER_TYPE);
		clickOnElement(SER_GSM);
	}
	
	@Then("^Select the service type of etisalat as WASEL$")
	public void select_the_service_type_of_etisalat_WASEL() {
		clickOnElement(SER_TYPE);
		clickOnElement(SER_WASEL);
	}
	
	@Then("^Select the service type of etisalat as Landline$")
	public void select_the_service_type_of_etisalat_Landline() {
		clickOnElement(SER_TYPE);
		clickOnElement(SER_LAND);
	}
	
	@Then("^Select the service type of etisalat as Al SHAMIL$")
	public void select_the_service_type_of_etisalat_SHAMIL() {
		clickOnElement(SER_TYPE);
		clickOnElement(SHAMIL);
	}

	@Then("^Enter the consumer number less than 9 digits$")
	public void enter_the_consumer_number_less_than_digits() {
		enterText(CON_NUMB, Pay_Cons_GSM_8);
		driver.hideKeyboard();
	}

	@Then("^Enter the nick name of Landline$")
	public void enter_the_nick_name_of_Landline() throws Throwable {
		enterText(CON_NICK, Pay_nick_Landline);
		driver.hideKeyboard();
	}
	
	@Then("^Enter the nick name of Landline1$")
	public void enter_the_nick_name_of_Landline1() throws Throwable {
		enterText(CON_NICK, Pay_nick_Landline1);
		//driver.hideKeyboard();
	}
	
	@Then("^Enter the nick name of WASEL$")
	public void enter_the_nick_name_of_WASEL() throws Throwable {
		enterText(CON_NICK, Pay_nick_wasel);
		driver.hideKeyboard();
	}
	
	@Then("^Enter the nick name of Al SHAMIL$")
	public void enter_the_nick_name_of_SHAMIL() throws Throwable {
		enterText(CON_NICK, Pay_nick_SHAMIL);
		driver.hideKeyboard();
	}
	
	@Then("^Enter the nick name of etisalat$")
	public void enter_the_nick_name_of_etisalat() throws Throwable {
		enterText(CON_NICK, Pay_nick_gsm);
		driver.hideKeyboard();
	}

	@Then("^Tap the next button and verify the navigated screen for payee GSM$")
	public void tap_on_next_button_and_verify_the_validation_message() throws Throwable {
		Verify_Gsm_Details();
	}
	
	@Then("^Tap the next button and verify the navigated screen for payee WASEL$")
	public void tap_on_next_button_and_verify_the_validation_message_WASEL() throws Throwable {
		Verify_WASEL_Details();
	}
	
	@Then("^Tap the next button and verify the navigated screen for payee Landline$")
	public void tap_on_next_button_and_verify_the_validation_message_Landline() throws Throwable {
		Verify_Landline_Details();
	}
	
	@Then("^Tap the next button and verify the navigated screen for payee Landline1$")
	public void tap_on_next_button_and_verify_the_validation_message_Landline1() throws Throwable {
		Verify_Landline_Details1();
	}
	
	@Then("^Tap the next button and verify the navigated screen for payee Al SHAMIL$")
	public void tap_on_next_button_and_verify_the_validation_message_SHAMIL() throws Throwable {
		Verify_SHAMIL_Details();
	}

	@Then("^Enter the consumer number more than 10 digits$")
	public void enter_the_consumer_number_more_than_digits() {
		driver.findElement(CON_NUMB).clear();
		enterText(CON_NUMB, Pay_Cons_GSM_11);
		driver.hideKeyboard();
	}

	@Then("^enter the valid consumer number$")
	public void enter_the_valid_consumer_number(){
		driver.findElement(CON_NUMB).clear();
		enterText(CON_NUMB, Pay_Cons_GSM);
		driver.hideKeyboard();
	}
	
	@Then("^enter the valid consumer number WASEL$")
	public void enter_the_valid_consumer_number_wasel(){
		driver.findElement(CON_NUMB).clear();
		enterText(CON_NUMB, Pay_Cons_WASEL);
		driver.hideKeyboard();
	}
	
	@Then("^enter the valid consumer number Landline$")
	public void enter_the_valid_consumer_number_Landline(){
		driver.findElement(CON_NUMB).clear();
		enterText(CON_NUMB, Pay_Cons_Landline);
		driver.hideKeyboard();
	}
	
	@Then("^enter the valid consumer number Landline1$")
	public void enter_the_valid_consumer_number_Landline1(){
		driver.findElement(CON_NUMB).clear();
		enterText(CON_NUMB, Pay_Cons_Landline1);
		//driver.hideKeyboard();
	}
	
	@Then("^enter the valid consumer number Al SHAMIL$")
	public void enter_the_valid_consumer_number_ASHAMIL(){
		driver.findElement(CON_NUMB).clear();
		enterText(CON_NUMB, Pay_Cons_SHAMIL);
		driver.hideKeyboard();
	}

	
}
