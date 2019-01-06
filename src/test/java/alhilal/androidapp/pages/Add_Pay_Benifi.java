package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

public class Add_Pay_Benifi extends CommonPage{
	
	public void  Tap_Pay_Bill() {
		clickOnElement(PAY_BILL);
		appiumHelpers.waitForVisibilityOfElement(FLX_PAYEE);
	}
	
	public void Tap_Make_Payment() {
		clickOnElement(PAY_MANAGE);
		appiumHelpers.waitForVisibilityOfElement(ADD_PAYEE);
	}
	
	public void Add_Payee() {
		clickOnElement(ADD_PAYEE);
		appiumHelpers.waitForVisibilityOfElement(SELECT_SERVICE);
	}
	
	public void Tap_Nxt_Scr_SALIK() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(SALIK1, Pay_Cons, Pay_nick);
		clickOnElement(CTN);
		
	}
	
	public void Tap_Nxt_Scr_ADDC() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(ADDC1, Pay_Cons1, Pay_nick1);
		clickOnElement(CTN);
		
	}
	
	public void Verify_Details(String service_LB, String consumer_LB, String Nick_LB) {
		String Service = driver.findElement(SER_PRO_VAL).getText();
		System.out.println(Service);
		assert Service.equals(service_LB) : "SERVICE IS EQUAL";
		String Consumer = driver.findElement(CONS_LB_VAL).getText();
		System.out.println(Consumer);
		assert Consumer.equals(consumer_LB) : "Consumer IS EQUAL";
		String Nick = driver.findElement(NICK_LB_VAL).getText();
		System.out.println(Nick);
		assert Nick.equals(Nick_LB) : "Nick IS EQUAL";
	}
	

}
