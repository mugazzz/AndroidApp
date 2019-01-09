package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

public class Edit_Del_Payee_Page extends CommonPage{

	public void Tap_Edit_Pay() {
		clickOnElement(Edit_Payee);
		appiumHelpers.waitForVisibilityOfElement(Reg_Payee);
		
	}
	
	public void Select_Payee_Edit() {
		clickOnElement(Reg_Pay_Refren);
		appiumHelpers.waitForVisibilityOfElement(Del_Payee);
	}
	
	public void Tap_Edit_Nam() {
		clickOnElement(Edit_Payee_link);
		appiumHelpers.waitForVisibilityOfElement(Edit_Payee_Text);
	}
	
	public void Edit_Nic() {
		driver.findElement(Edit_Payee_Text).clear();
		enterText(Edit_Payee_Text, Edit_Payee_name);
		driver.hideKeyboard();
	}
	
	public void Tap_Cnt_Ver() {
		clickOnElement(Save_Edit);
		Verify_Validation_Message(Edit_Nick_Val);
	}
	
	public void Verify_Edit() {
		String nick = driver.findElement(Nick_Name_E).getText();
		assert nick.equals(Edit_Payee_name): "Edit nick name is not saved";
	}
	
	public void Tap_Delete() {
		clickOnElement(Del_Payee);
		appiumHelpers.waitForVisibilityOfElement(Edit_Payee_Text);
	}
	
}
