package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

import alhilal.androidapp.pages.Support_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Support_Steps extends Support_Page{
	@Then("^Tap on more options icon$")
	public void tap_on_more_options_icon() throws Throwable {
	   Tap_More();
	}

	@Then("^Tap on Settings option$")
	public void tap_on_Settings_option() throws Throwable {
	 Tap_Settings();
	}

	@Then("^Select Active devices option$")
	public void select_Active_devices_option() throws Throwable {
	  Tap_Active_Device();
	}

	@Then("^Select the device to edit nick name$")
	public void select_the_device_to_edit_nick_name() throws Throwable {
	 Tap_Act_Dev_Edit();
	}
	
	@Then("^Select the device to edit nick name2$")
	public void select_the_device_to_edit_nick_name2() throws Throwable {
	 Tap_Act_Dev_Edit2();
	}
	
	@Then("^Select the device to edit nick name1$")
	public void select_the_device_to_edit_nick_name1() throws Throwable {
	 Tap_Act_Dev_Edit1();
	}

	@Then("^Tap on edit link$")
	public void tap_on_edit_link() throws Throwable {
		Tap_Edit_Link();
	}

	@Then("^Rename the nickname$")
	public void rename_the_nickname() throws Throwable {
		Ent_Nick_Name();
	}
	
	@Then("^Rename the nickname1$")
	public void rename_the_nickname1() throws Throwable {
		Ent_Nick_Name1();
	}
	

	@Then("^Tap confirm and verify the saved data$")
	public void tap_confirm_and_verify_the_saved_data() throws Throwable {
		Verify_Saved();
	}
	
	@Then("^Tap confirm and verify the validation for duplicate nickname$")
	public void dupli_name() throws Throwable {
		Verify_Saved1();
	}

	@Then("^Tap header back and verify the nick name is not saved$")
	public void Not_Save() throws Throwable {
		Verify_Not_Saved();
	}
	
	@Then("^Tap on Login PIN change option$")
	public void tap_on_Login_PIN_change_option() throws Throwable {
		Tap_Login_Pin();
	}

	@Then("^Enter the Current Pin$")
	public void enter_the_Current_Pin() throws Throwable {
		enterText(ENT_CUR_PIN, Enter_Pin);
	}
	
	@Then("^Enter the incorrect Current Pin$")
	public void enter_the_incorrect_Current_Pin() throws Throwable {
		enterText(ENT_CUR_PIN, Renter_Pin);
	}

	@Then("^Enter the new Pin$")
	public void enter_the_new_Pin() throws Throwable {
		enterText(ENT_NEW_PIN, Enter_Pin);
	}
	
	@Then("^Enter the incorrect new Pin$")
	public void enter_the_incorrect_new_Pin() throws Throwable {
		enterText(ENT_NEW_PIN, Renter_Pin);
	}

	@Then("^Enter the confirm new pin$")
	public void enter_the_confirm_new_pin() throws Throwable {
		enterText(ENT_RE_PIN, Enter_Pin);
		driver.hideKeyboard();
	}
	
	@Then("^Enter the confirm new pin1$")
	public void enter_the_confirm_new_pin1() throws Throwable {
		enterText(ENT_RE_PIN, Enter_Pin);
	}

	@Then("^change pin button$")
	public void change_pin_button() throws Throwable {
		Tap_Change_Pin();
	}
	
	@Then("^Tap change pin button$")
	public void Tap_change_pin_button() throws Throwable {
		Tap_Change_Pin1();
	}

	@Then("^Verify the successful message appears$")
	public void verify_the_successful_message_appears() throws Throwable {
		Verify_Validation_Message(PIN_SUCE);
	}
	
	@Then("^Verify the incorrect current pin appears$")
	public void verify_incorrect_message_appears() throws Throwable {
		Verify_Validation_Message(INCOR_SUCC);
	}
	
	@Then("^Verify the pin mismatch validation$")
	public void verify_pin_mismatch() throws Throwable {
		String xmlFormat = driver.getPageSource();
		assertThat(xmlFormat, CoreMatchers.containsString(MIS_PIN));
	}
	
	@Then("^Verify the login check with Bio card$")
	public void Bio_Card() throws Throwable {
		Register_using_Card_Bio(Act_Debit_Card_No, Act_Credit_Card_Pin);
	}
	
	@Given("^Login by cancel the login popup$")
	public void Login_Cancel_Login_popup() {
		Verify_Login_check_Cancel();
	}


}
