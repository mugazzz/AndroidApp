package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.Incorrect_Cons;
import static alhilal.androidapp.utils.Locators.*;

import org.openqa.selenium.By;

public class Pay_One_Mul_Util_Page extends CommonPage{
	
	public void Tap_Element(By locator) {
		clickOnElement(locator);
	}
	
	public void Verify_Out() {
		String Out = driver.findElement(Out_Stand).getText();
		System.out.println("OutStanding Amount: "+Out);
	}
	
	public void Tap_All_Pay() {
		clickOnElement(Pay_all);
		appiumHelpers.waitForVisibilityOfElement(Out_Stand);
	}
	
	public void  Tap_Confirm() {
		clickOnElement(Continue);
		appiumHelpers.waitForVisibilityOfElement(CONF_BUT);
	}
	
	public void Sel_card() {
		clickOnElement(FROM_ACC_DATA1);
		clickOnElement(CARD_C);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT1);
	}
	
	public void Validation_Message() {
		Verify_Validation_Message(Incorrect_Cons);
	}
}
