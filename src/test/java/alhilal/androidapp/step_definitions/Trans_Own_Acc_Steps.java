package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.Locators.*;

import alhilal.androidapp.pages.Trans_Own_Acc_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Trans_Own_Acc_Steps extends Trans_Own_Acc_Page{
	
	@Then("^Select the saving account in usd$")
	public void select_the_saving_account_in_usd() throws Throwable {
	   Select_Saving_usd();
	}
	
	@Then("^Select the current account in usd$")
	public void select_the_current_account_in_usd() throws Throwable {
	   Select_Current_usd();
	}
	
	@Then("^Select the card in usd$")
	public void select_the_card_in_usd() throws Throwable {
		Select_Card_usd();
	}

	@Then("^Tap on from account and select the current account$")
	public void tap_on_from_account_and_select_the_current_account() throws Throwable {
		Select_From_Current();
	}
	
	@Then("^Tap on from account and select the current account1$")
	public void tap_on_from_account_and_select_the_current_account1() throws Throwable {
		Select_From_Current1();
	}

	@Then("^Verify the available balance amount appears$")
	public void verify_the_available_balance_amount_appears() throws Throwable {
		Verify_Amount();
	}

	@When("^Enter the amount$")
	public void enter_the_amount() throws Throwable {
		Enter_Amount();
	}

	@When("^Change the currency and verify the listed currencies$")
	public void change_the_currency_and_verify_the_listed_currencies() throws Throwable {
		Verify_Currency();
	}
	
	@When("^Change the currency and verify the listed currencies1$")
	public void change_the_currency_and_verify_the_listed_currencies1() throws Throwable {
		Verify_Currency1();
	}

	@Then("^Verify the indicative amount appears$")
	public void verify_the_indicative_amount_appears() throws Throwable {
		appiumHelpers.waitForVisibilityOfElement(INDICATIVE);
	}

	@Then("^Enter the remarks$")
	public void enter_the_remarks() throws Throwable {
		Enter_Remark();
	}

	@Then("^Click on next and verify the screen redirect to transfers details screen$")
	public void click_on_next_and_verify_the_screen_redirect_to_transfers_details_screen() throws Throwable {
		clickOnElement(CONF_BUT);
		appiumHelpers.waitForVisibilityOfElement(FLX_CONF);
	}

	@Then("^Tap confirm button and verify the screen redirected to successfully transfered screen$")
	public void tap_confirm_button_and_verify_the_screen_redirected_to_successfully_transfered_screen() throws Throwable {
		Complete_and_Verify();
	}


}
