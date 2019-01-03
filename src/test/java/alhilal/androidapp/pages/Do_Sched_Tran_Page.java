package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import org.openqa.selenium.By;

public class Do_Sched_Tran_Page extends CommonPage{
	
	public void Submit_Sch() {
		clickOnElement(SUB_SCHED);
		appiumHelpers.waitForVisibilityOfElement(SCHED_HD);
	}
	
	
	public void  Select_date() {
		clickOnElement(DATE_NXT);
		clickOnElement(SEL_DATE);
	}
	
	public void Submit_Verify() {
		clickOnElement(DATE_CTN);
		appiumHelpers.waitForVisibilityOfElement(DEBIT_AMT);
	}
	
	public void Tap_Edit_Tran() {
		clickOnElement(EDIT_SCHED);
		appiumHelpers.waitForVisibilityOfElement(EDIT_SCHED_HD);
	}
	
	public void Verify_Listed_Scheduled_Transfer() {
		appiumHelpers.assertTrue(elementExists(ACC_NAM), "Scheduled transfers are listed");
		appiumHelpers.assertTrue(elementExists(SCHED_MODE), "Scheduled transfers mode is listed");
		appiumHelpers.assertTrue(elementExists(TRANF_AMT), "Scheduled transfers amount is listed");
		appiumHelpers.assertTrue(elementExists(TRAN_DATE), "Scheduled transfers date is listed");
	}
	
	public void Verify_Listed_Scheduled_Transfer(By locator) {
		appiumHelpers.assertTrue(elementExists(ACC_NAM), "Scheduled transfers are listed");
		appiumHelpers.assertTrue(elementExists(locator), "Scheduled transfers yearly mode is listed");
		//String Selected_Mode = driver.findElement(SCHED_MODE).getText();
		//assert Selected_Mode.equals(Tran_Mode): "Yearly Mode is not working";		
		appiumHelpers.assertTrue(elementExists(TRANF_AMT), "Scheduled transfers amount is listed");
		appiumHelpers.assertTrue(elementExists(TRAN_DATE), "Scheduled transfers date is listed");
	}
	
	public void Verify_Listed_Scheduled_Account_Transfer(By locator) {
		appiumHelpers.assertTrue(elementExists(locator), "Scheduled transfers are listed");
		appiumHelpers.assertTrue(elementExists(SCHED_MODE), "Scheduled transfers yearly mode is listed");
		//String Selected_Mode = driver.findElement(SCHED_MODE).getText();
		//assert Selected_Mode.equals(Tran_Mode): "Yearly Mode is not working";		
		appiumHelpers.assertTrue(elementExists(TRANF_AMT), "Scheduled transfers amount is listed");
		appiumHelpers.assertTrue(elementExists(TRAN_DATE), "Scheduled transfers date is listed");
	}
	
	public void Return_Dash() {
		clickOnElement(CONF_BUT);
		appiumHelpers.waitForVisibilityOfElement(ACC_NAM);
	}
}
