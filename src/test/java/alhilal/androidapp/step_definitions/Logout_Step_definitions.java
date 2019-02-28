package alhilal.androidapp.step_definitions;



import alhilal.androidapp.pages.Logout_Page;
import cucumber.api.java.en.Then;

public class Logout_Step_definitions extends Logout_Page{
	
	@Then("^Tap more option and open the menu bar$")
	public void tap_more_option_and_open_the_menu_bar() throws Throwable {
	   Tap_More();
	}

	@Then("^Verify the logout option$")
	public void verify_the_logout_option() throws Throwable {
		Verify_Logout_Option();
	}

	@Then("^Tap on logout option$")
	public void tap_on_logout_option() throws Throwable {
	   Logout_User();
	}

	@Then("^Verify the screen redirected to login screen$")
	public void verify_the_screen_redirected_to_login_screen() throws Throwable {
	  Verify_Login_Screen();
	}
	
	@Then("^Verify the logout confirmation popup appears$")
	public void verify_the_logout_confirmation_popup_appears() throws Throwable {
	    Verify_Confirm_Popup();
	}

	@Then("^Tap No to cancel the cofirmation$")
	public void tap_No_to_cancel_the_cofirmation() throws Throwable {
	   Tap_No();
	}

	@Then("^Verify the user not get logout$")
	public void verify_the_user_not_get_logout() throws Throwable {
	   Verify_Not_Logout();
	}

	@Then("^Tap yes for the confirmation$")
	public void tap_yes_for_the_confirmation() throws Throwable {
	  Tap_Yes();
	}



}
