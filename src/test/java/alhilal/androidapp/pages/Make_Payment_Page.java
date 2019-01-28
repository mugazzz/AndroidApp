package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class Make_Payment_Page  extends CommonPage
{
	public void Tap_Any_Payee()
	{
	
		clickOnElement(PAYEE);
		appiumHelpers.waitForVisibilityOfElement(Payment_PageHeader);
		
	}
	
	public void selectAccount()
	{
		clickOnElement(Select_FromAcc);
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(188, 597)).perform();
		
	}
	
	public void enterValidAmount()
	{
		enterText(Pay_amount, Payment_Amount_Valid );
		driver.findElement(By.id("Hide")).click();
	}
	public void enterInvalidAmount()
	{
		enterText(Pay_amount, Payment_Amount_InValid );
		driver.findElement(By.id("Hide")).click();
	}
	
	
	public void clickNextPayment()
	{
		appiumHelpers.assertFalse(elementExists(Invalid_Validation), "Limits: Min 10.00 AED");
		clickOnElement(NXT);
	}
	
	public void checkValidation()
	{
		appiumHelpers.assertTrue(elementExists(Invalid_Validation), "No validation occurs");
	}
	
	public void confirmPayment()
	{
		String amountPaid=driver.findElement(Total_Amount).getText();
		String amount=amountPaid.substring(0, 5);
		System.out.println("Total amount to be paid: "+amount);
		assert amount.equals(Payment_Amount_Valid) : "Amount is not same";
				
		String fromAccount=driver.findElement(From_Account).getText();
		System.out.println("From My Account: "+fromAccount);
		
		String toPayee=driver.findElement(To_Payee).getText();
		System.out.println("To the Payee: "+toPayee);
		
		clickOnElement(confirmPay);
		
	}
	
	public void checkStatus()
	{
		String sts= driver.findElement(status).getText();
		System.out.println(sts);
		appiumHelpers.assertTwoStringsEqual(sts, "Payments are completed successfully");
	}
	
	public void Verify_Login_check_tran_950000() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_user(Act_Cust_No9500000, Act_SMS_PN);
			 //Register_using_Credit_Card();
		 }
		 else {
			 System.out.println("User already logged in");
			 enterText(LOGIN_PIN_FD, Enter_Pin);
		 }
	}
	
	public void Verify_Login_check_tran_960000() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_user(Act_Cust_No9600000, Act_SMS_PN);
			 //Register_using_Credit_Card();
		 }
		 else {
			 System.out.println("User already logged in");
			 enterText(LOGIN_PIN_FD, Enter_Pin);
		 }
	}

}
