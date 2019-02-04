package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.Locators.*;

import org.openqa.selenium.By;

import alhilal.androidapp.pages.Pay_One_Mul_Util_Page;
import cucumber.api.java.en.Then;


public class Pay_One_Mul_Util_Step extends Pay_One_Mul_Util_Page{

	@Then("^Select AADC utility for payment$")
	public void select_AADC_utility_for_payment() throws Throwable {
		Tap_Element(Sel_AADC);
	}
	
	@Then("^Select AADC utility for payment1$")
	public void select_AADC_utility_for_payment1() throws Throwable {
		scrollDown(Sel_DEWA);
		Tap_Element(Sel_AADC1);
	}
	
	@Then("^Select ADDC utility for payment2$")
	public void select_ADDC_utility_for_payment2() throws Throwable {
		scrollDown(Sel_DEWA);
		Tap_Element(Sel_ADDC2);
	}

	@Then("^Select ADDC utility for payment$")
	public void select_ADDC_utility_for_payment() throws Throwable {
		Tap_Element(Sel_ADDC);
	}
	
	@Then("^Select ADDC utility for payment1$")
	public void select_ADDC_utility_for_payment1() throws Throwable {
		scrollDown(Sel_DEWA);
		Tap_Element(Sel_ADDC1);
	}
	
	@Then("^Select DEWA utility for payment$")
	public void select_DEWA_utility_for_payment() throws Throwable {
		Tap_Element(Sel_DEWA);
	}
	
	@Then("^Select DEWA utility for payment1$")
	public void select_DEWA_utility_for_payment1() throws Throwable {
		scrollDown(Sel_DEWA);
		Tap_Element(Sel_DEWA1);
	}
	
	@Then("^Select Shamil utility for payment$")
	public void select_Shamil_utility_for_payment() throws Throwable {
		Tap_Element(Sel_Shamil);
	}
	
	@Then("^Select GSM utility for payment$")
	public void select_GSM_utility_for_payment() throws Throwable {
		Tap_Element(GSM);
	}
	
	@Then("^Select GSM and SHAMIL utility for payment$")
	public void select_GSM_utility_for_payment1() throws Throwable {
		Tap_Element(GSM2);
		Tap_Element(Sel_Shamil);
	}
	
	@Then("^Select more than five utilities for payment$")
	public void select_GSM_utility_for_payme() throws Throwable {
		Tap_Element(GSM);
		Tap_Element(Sel_Shamil);
		Tap_Element(GSM2);
		scrollDown(GSM2);
		Tap_Element(Sel_Shamil2);
		Tap_Element(GSM3);
		Tap_Element(Sel_Shamil3);
		scrollDown(GSM3);
		Tap_Element(GSM4);
	}
	
	@Then("^Select Shamil utility for payment1$")
	public void select_Shamil_utility_for_payment1() throws Throwable {
		scrollDown(Sel_DEWA);
		Tap_Element(Sel_Shamil1);
	}
	
	@Then("^Select Salik utility for payment$")
	public void select_Salik_utility_for_payment() throws Throwable {
		Tap_Element(Sel_Salik);
	}
	
	@Then("^Select Salik utility for payment1$")
	public void select_Salik_utility_for_payment1() throws Throwable {
		scrollDown(Sel_DEWA);
		Tap_Element(Sel_Salik1);
	}
	
	@Then("^Select Salik utility for payment2$")
	public void select_Salik_utility_for_payment2() throws Throwable {
		scrollDown(Sel_DEWA);
		Tap_Element(Sel_Salik2);
	}
	
	@Then("^Verify the outstanding balance amount$")
	public void verify_the_outstanding_balance_amount() throws Throwable {
	 Verify_Out();
	}

	@Then("^Tap on Pay All button and navigate to payment screen$")
	public void tap_on_Pay_All_button_and_navigate_to_payment_screen() throws Throwable {
	 Tap_All_Pay();
	}

	@Then("^Tap confirm payment button$")
	public void tap_confirm_payment_button() throws Throwable {
	 Tap_Confirm();
	}

	@Then("^Verify the Payment Confirmation screen$")
	public void verify_the_Payment_Confirmation_screen() throws Throwable {
		appiumHelpers.waitForVisibilityOfElement(Sucess_mess);
	}
	
	@Then("^Verify the Payment Confirmation screen pay$")
	public void verify_the_Payment_Confirmation_screen_pay() throws Throwable {
		appiumHelpers.waitForVisibilityOfElement(Sucess_messp);
	}
	
	@Then("^Tap on from account and select the card$")
	public void tap_on_from_account_and_select_the_card() throws Throwable {
		Sel_card();
	}
	
	@Then("^Verify the Validation message appears for multiple payments$")
	public void Validation_message_appears_for_multiple_payments() throws Throwable {
		Mul_Validation_Message();
	}

}
