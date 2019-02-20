package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

public class Edit_Del_Payee_Page extends CommonPage{

	public void Tap_Edit_Pay() {
		clickOnElement(Edit_Payee);
		appiumHelpers.waitForVisibilityOfElement(Reg_Payee);
		
	}
	
	public void Tap_Edit_benif() {
		clickOnElement(Edit_Benifi);
		appiumHelpers.waitForVisibilityOfElement(Reg_Benif_card);
		
	}
	
	public void Select_Payee_Edit() {
		clickOnElement(Reg_Pay_Refren);
		appiumHelpers.waitForVisibilityOfElement(Del_Payee);
	}
	
	public void Select_Benfi_Edit() {
		clickOnElement(Reg_Benif_card);
		appiumHelpers.waitForVisibilityOfElement(Del_Payee);
	}
	
	public void Tap_Edit_Nam() {
		clickOnElement(Edit_Payee_link);
		appiumHelpers.waitForVisibilityOfElement(Edit_Payee_Text);
	}
	
	public void Edit_Nic() {
		driver.findElement(Edit_Payee_Text).clear();
		enterText(Edit_Payee_Text, Edit_Payee_name);
//		driver.hideKeyboard();
		hideKeyboard();
	}
	
	public void Tap_Cnt_Ver() {
		clickOnElement(Save_Edit);
		Verify_Validation_Message(Edit_Nick_Val);
	}
	
	public void Tap_Cnt_Ver1() {
		clickOnElement(Save_BTN);
		Verify_Validation_Message(Edit_Beni_Val);
	}
	
	public void Verify_Edit() {
		String nick = driver.findElement(Nick_Name_E).getText();
		assert nick.equals(Edit_Payee_name): "Edit nick name is not saved";
	}
	
	public void Verify_Edit1() {
		String nick = driver.findElement(Edit_Bin_Name).getText();
		assert nick.equals(Edit_Payee_name): "Edit nick name is not saved";
	}
	
	public void Tap_Delete() {
		clickOnElement(Del_Payee);
		appiumHelpers.waitForVisibilityOfElement(CAN_OK);
		clickOnElement(CAN_OK);
	}
	
}
