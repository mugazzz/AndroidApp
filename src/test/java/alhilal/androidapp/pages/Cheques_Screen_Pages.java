package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;

public class Cheques_Screen_Pages extends CommonPage{
	
	public void Minimize_Chart(){
		clickOnElement(MINIMIZE_CHART);
	}
	
	public void Check_For_Accounts() {
		appiumHelpers.waitForVisibilityOfElement(ACCOUNT_LABEL);
		appiumHelpers.assertTrue(elementExists(ACCOUNT_LABEL), "Account is available");
	}
	
	public void Tap_Current_Account() throws InterruptedException {
		scrollDown(ACT_SAVING_ACC1);
		appiumHelpers.waitForVisibilityOfElement(ACT_CURRENT_ACC);
		clickOnElement(ACT_CURRENT_ACC);
	}
	
	public void  Tap_Cheque_View() {
		//appiumHelpers.waitForVisibilityOfElement(AACCOUNT_LABEL);
		waitForProgressBarToDismiss();
		clickOnElement(CHEQUE_VIEW);
		appiumHelpers.waitForVisibilityOfElement(HEAD_CHEQUE);
		
	}
	
	public void Tap_Filter_Icon() {
		clickOnElement(APPLY_FILTER);
		appiumHelpers.waitForVisibilityOfElement(ADV_SER_HD);
	}
	
	public void Tap_Time_Range() {
		clickOnElement(TIME_RANGE);
		appiumHelpers.waitForVisibilityOfElement(CUSTOM_PERIOD);
	}
	
	public void Select_CustomPeriod() {
		clickOnElement(CUSTOM_PERIOD);
		appiumHelpers.waitForVisibilityOfElement(START_LAB);
	}
	
	public void Select_Start_Date() {
		clickOnElement(START_DATE);
		clickOnElement(STA_YEAR);
		clickOnElement(STA_YEAR_PIC);
		clickOnElement(START_OK);
	}
	
	public void Select_End_Date() {
		clickOnElement(START_DATE);
		clickOnElement(START_OK);
	}
	
	public void Apply_Filter() {
		clickOnElement(SEARCH_BTN);
		appiumHelpers.waitForVisibilityOfElement(HEAD_CHEQUE);
	}
	
	public void Verify_Search_Result() {
		List<MobileElement> elements1 = driver.findElements(By.id("lblAccountBal"));
		for(MobileElement link : elements1)
		{
		  String Date = link.getText();
		  System.out.println("List dates: "+Date);
		  String Year = Date.substring(6, 8);
		  int ActualYear = Integer.parseInt(Year);
		  System.out.println("Actual Year: " + ActualYear);
		  assert ActualYear<=18 && ActualYear>=15 : "Fitler using date is not working fine";
		}
		elementExists(CHEQUE_NO);
		elementExists(CHEQUE_AMT);
		elementExists(CHEQUE_STATUS);
	}
	
	public void Tap_Add_Range() {
		clickOnElement(ADD_RANGE);
	}
	
	public void Add_Cheque_numbers() {
		appiumHelpers.waitForVisibilityOfElement(CHEQ_FROM);
		enterText(CHEQ_FROM, Cheque_from);
		enterText(CHEQ_TO, Cheque_to);
		driver.hideKeyboard();
	}
	
	public void Add_To_Cheque_numbers() {
		appiumHelpers.waitForVisibilityOfElement(CHEQ_TO);
		enterText(CHEQ_TO, Cheque_to_1);
		driver.hideKeyboard();
	}
	
	public void Add_From_Cheque_numbers() {
		appiumHelpers.waitForVisibilityOfElement(CHEQ_FROM);
		enterText(CHEQ_FROM, Cheque_from_1);
		driver.hideKeyboard();
	}
	
	public void Verify_Search_Result_Check_Number() {
		List<MobileElement> elements = driver.findElements(By.id("lblAccountName"));
		for(MobileElement link : elements)
		{
		  String cheq_no = link.getText();
		  System.out.println("List cheque no: "+cheq_no);
		  int Actual_cheq_no = Integer.parseInt(cheq_no);
		  int Cheque_fromn = Integer.parseInt(Cheque_from);
		  int Cheque_ton = Integer.parseInt(Cheque_to);
		  assert Actual_cheq_no >= Cheque_fromn || Actual_cheq_no <= Cheque_ton : "Fitler using Cheque number is not working fine";
		}
		elementExists(CHEQUE_DATE);
		elementExists(CHEQUE_AMT);
		elementExists(CHEQUE_STATUS);
	}
	
	public void Verify_Range_buttons() {
		clickOnElement(REMOVE_RANGE);
		appiumHelpers.waitForVisibilityOfElement(AMOUNT_FROM);
		appiumHelpers.waitForVisibilityOfElement(AMOUNT_TO);
		clickOnElement(REMOVE_RANGE);
		elemenDoesnotExists(AMOUNT_TO);
		elementExists(REMOVE_RANGE);	
	}
	
	public void Verify_Range_buttons_Cheque() {
		clickOnElement(ADD_RANGE);
		appiumHelpers.waitForVisibilityOfElement(CHEQ_FROM);
		appiumHelpers.waitForVisibilityOfElement(CHEQ_TO);
		clickOnElement(ADD_RANGE);
		elemenDoesnotExists(CHEQ_TO);
		elementExists(ADD_RANGE);	
	}
	
	public void Add_Amount_Values() {
		appiumHelpers.waitForVisibilityOfElement(AMOUNT_FROM);
		enterText(AMOUNT_FROM, Amount_from);
		enterText(AMOUNT_TO, Amount_to);
		driver.hideKeyboard();
	}
	
	public void Add_Amount_Values_Max_min() {
		appiumHelpers.waitForVisibilityOfElement(AMOUNT_FROM);
		enterText(AMOUNT_FROM, Amount_to);
		enterText(AMOUNT_TO, Amount_from);
		driver.hideKeyboard();
		clickOnElement(SEARCH_BTN);
	}
	
	public void Verify_Search_Result_Amount_Values() {
		List<MobileElement> elements2 = driver.findElements(By.id("lblAccountBalValue"));
		for(MobileElement link : elements2)
		{
		  String Amt_no = link.getText();
		  System.out.println("List cheque no: "+Amt_no);
		  int Amount_fromn = Integer.parseInt(Amount_from);
		  int Amount_ton = Integer.parseInt(Amount_to);
		  try {
			  int Actual_amt_no = Integer.parseInt(Amt_no);
			  assert Actual_amt_no >= Amount_fromn || Actual_amt_no <= Amount_ton : "Fitler using amount values is not working fine";
		  	}catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		}
		elementExists(CHEQUE_DATE);
		elementExists(CHEQUE_NO);
		elementExists(CHEQUE_STATUS);
	}
	
	public void Tap_Add_Range_Amount() {
		clickOnElement(REMOVE_RANGE);
	}
	
	public void Verify_Search_Result_all_Values() {
		
		//For Date Filter
				List<MobileElement> elements1 = driver.findElements(By.id("lblAccountBal"));
				for(MobileElement link : elements1)
				{
				  String Date = link.getText();
				  System.out.println("List dates: "+Date);
				  String Year = Date.substring(6, 8);
				  int ActualYear = Integer.parseInt(Year);
				  System.out.println("Actual Year: " + ActualYear);
				  assert ActualYear<=18 && ActualYear>=15 : "Fitler using date is not working fine";
				}
		
		//For Amount value filter
				List<MobileElement> elements2 = driver.findElements(By.id("lblAccountBalValue"));
				for(MobileElement link : elements2)
				{
				  String Amt_no = link.getText();
				  System.out.println("List cheque no: "+Amt_no);
				  int Amount_fromn = Integer.parseInt(Amount_from);
				  int Amount_ton = Integer.parseInt(Amount_to);
				  try {
					  int Actual_amt_no = Integer.parseInt(Amt_no);
					  assert Actual_amt_no >= Amount_fromn || Actual_amt_no <= Amount_ton : "Fitler using amount values is not working fine";
				  	}catch (NumberFormatException e) {
				  		System.out.println("not a number");
				  	}
				}
		
		//For Cheque number
				List<MobileElement> elements = driver.findElements(By.id("lblAccountName"));
				for(MobileElement link : elements)
				{
				  String cheq_no = link.getText();
				  System.out.println("List cheque no: "+cheq_no);
				  int Actual_cheq_no = Integer.parseInt(cheq_no);
				  int Cheque_fromn = Integer.parseInt(Cheque_from);
				  int Cheque_ton = Integer.parseInt(Cheque_to);
				  assert Actual_cheq_no >= Cheque_fromn || Actual_cheq_no <= Cheque_ton : "Fitler using Cheque number is not working fine";
				}
				elementExists(CHEQUE_DATE);
				elementExists(CHEQUE_AMT);
				elementExists(CHEQUE_STATUS);
			}
	
	public void Verify_Search_Result_date_and_cheque_Values() {
		
		//For Date Filter
				List<MobileElement> elements1 = driver.findElements(By.id("lblAccountBal"));
				for(MobileElement link : elements1)
				{
				  String Date = link.getText();
				  System.out.println("List dates: "+Date);
				  String Year = Date.substring(6, 8);
				  int ActualYear = Integer.parseInt(Year);
				  System.out.println("Actual Year: " + ActualYear);
				  assert ActualYear<=18 && ActualYear>=15 : "Fitler using date is not working fine";
				}
				
		//For Cheque number
				List<MobileElement> elements = driver.findElements(By.id("lblAccountName"));
				for(MobileElement link : elements)
				{
				  String cheq_no = link.getText();
				  System.out.println("List cheque no: "+cheq_no);
				  int Actual_cheq_no = Integer.parseInt(cheq_no);
				  int Cheque_fromn = Integer.parseInt(Cheque_from);
				  int Cheque_ton = Integer.parseInt(Cheque_to);
				  assert Actual_cheq_no >= Cheque_fromn || Actual_cheq_no <= Cheque_ton : "Fitler using Cheque number is not working fine";
				}
				elementExists(CHEQUE_DATE);
				elementExists(CHEQUE_AMT);
				elementExists(CHEQUE_STATUS);
	}
	
	public void Verify_Search_Result_dates_amounts_Values() {
		
		//For Date Filter
				List<MobileElement> elements1 = driver.findElements(By.id("lblAccountBal"));
				for(MobileElement link : elements1)
				{
				  String Date = link.getText();
				  System.out.println("List dates: "+Date);
				  String Year = Date.substring(6, 8);
				  int ActualYear = Integer.parseInt(Year);
				  System.out.println("Actual Year: " + ActualYear);
				  assert ActualYear<=18 && ActualYear>=15 : "Fitler using date is not working fine";
				}
				
		//For Amount value filter
				List<MobileElement> elements2 = driver.findElements(By.id("lblAccountBalValue"));
				for(MobileElement link : elements2)
				{
				  String Amt_no = link.getText();
				  System.out.println("List cheque no: "+Amt_no);
				  int Amount_fromn = Integer.parseInt(Amount_from);
				  int Amount_ton = Integer.parseInt(Amount_to);
				  try {
					  int Actual_amt_no = Integer.parseInt(Amt_no);
					  assert Actual_amt_no >= Amount_fromn || Actual_amt_no <= Amount_ton : "Fitler using amount values is not working fine";
				  	}catch (NumberFormatException e) {
				  		System.out.println("not a number");
				  	}
				}
				elementExists(CHEQUE_DATE);
				elementExists(CHEQUE_AMT);
				elementExists(CHEQUE_STATUS);
		
	}
	
	public void Verify_Search_Result_cheque_amounts_Values(){
		//For Cheque number
			List<MobileElement> elements = driver.findElements(By.id("lblAccountName"));
			for(MobileElement link : elements)
			{
			  String cheq_no = link.getText();
			  System.out.println("List cheque no: "+cheq_no);
			  int Actual_cheq_no = Integer.parseInt(cheq_no);
			  int Cheque_fromn = Integer.parseInt(Cheque_from);
			  int Cheque_ton = Integer.parseInt(Cheque_to);
			  assert Actual_cheq_no >= Cheque_fromn || Actual_cheq_no <= Cheque_ton : "Fitler using Cheque number is not working fine";
			}
			
		//For Amount value filter
			List<MobileElement> elements2 = driver.findElements(By.id("lblAccountBalValue"));
			for(MobileElement link : elements2)
			{
			  String Amt_no = link.getText();
			  System.out.println("List cheque no: "+Amt_no);
			  int Amount_fromn = Integer.parseInt(Amount_from);
			  int Amount_ton = Integer.parseInt(Amount_to);
			  try {
				  int Actual_amt_no = Integer.parseInt(Amt_no);
				  assert Actual_amt_no >= Amount_fromn || Actual_amt_no <= Amount_ton : "Fitler using amount values is not working fine";
			  	}catch (NumberFormatException e) {
			  		System.out.println("not a number");
			  	}
			}
			elementExists(CHEQUE_DATE);
			elementExists(CHEQUE_AMT);
			elementExists(CHEQUE_STATUS);
		
	}
	
	public void Verify_Select_From_Date_Future() {
	        LocalDate date = LocalDate.now();
	        date = date.plusDays(1);
	        String nextDate = date.toString();
	        System.out.println(nextDate);
	        String tommorrow = nextDate.substring(8, 10);
	        System.out.println(tommorrow);
	        clickOnElement(START_DATE);
	        String xpath = "//android.view.View[@text='"+tommorrow+"']"; 
	        MobileElement tommrw = driver.findElement(By.xpath(xpath));
	        boolean i = tommrw.isEnabled();
	        System.out.println("Status of date :"+i);
	        assert i=true : " Future date is enabled";
	   
	}
	
	public void Verify_To_Date_Disabled() {
		clickOnElement(START_DATE);
		LocalDate date = LocalDate.now();
        date = date.minusDays(1);
        String nextDate = date.toString();
        System.out.println(nextDate);
        String tommorrow = nextDate.substring(8, 10);
        System.out.println(tommorrow);
        String xpath = "//android.view.View[@text='"+tommorrow+"']"; 
        MobileElement tommrw = driver.findElement(By.xpath(xpath));
        boolean i = tommrw.isEnabled();
        System.out.println("Status of date :"+i);
        assert i=true : "User able to select To date lesser than From date";
	}
	
	public void Add_max_min_inv_Cheque_numbers() {
		appiumHelpers.waitForVisibilityOfElement(CHEQ_FROM);
		enterText(CHEQ_FROM, Cheque_to);
		enterText(CHEQ_TO, Cheque_from);
		driver.hideKeyboard();
		clickOnElement(SEARCH_BTN);
	}
	
	public void Ente_incorrect_Cheque_number() {
		appiumHelpers.waitForVisibilityOfElement(CHEQ_FROM);
		enterText(CHEQ_FROM, Cheque_from_incorrect);
		driver.hideKeyboard();
		clickOnElement(SEARCH_BTN);
	}
	
	public void Select_Only_End_Date() {
		clickOnElement(END_DATE);
		clickOnElement(STA_YEAR);
		clickOnElement(STA_YEAR_PIC);
		clickOnElement(START_OK);
	}
	
	public void Select_Only_Start_Date() {
		clickOnElement(START_DATE_ONLY);
		clickOnElement(STA_YEAR);
		clickOnElement(STA_YEAR_PIC);
		clickOnElement(START_OK);
	}
	
	public void Verify_Search_Result_For_End() {
	List<MobileElement> elements1 = driver.findElements(By.id("lblAccountBal"));
	for(MobileElement link : elements1)
	{
	  String Date = link.getText();
	  System.out.println("List dates: "+Date);
	  String Year = Date.substring(6, 8);
	  int ActualYear = Integer.parseInt(Year);
	  System.out.println("Actual Year: " + ActualYear);
	  assert ActualYear<=15 : "Fitler using date is not working fine";
	}
	elementExists(CHEQUE_NO);
	elementExists(CHEQUE_AMT);
	elementExists(CHEQUE_STATUS);
	}
	
	public void Add_Only_To_Amount_Values() {
		appiumHelpers.waitForVisibilityOfElement(AMOUNT_TO);
		enterText(AMOUNT_TO, Amount_to_1);
		driver.hideKeyboard();
	}
	
	public void Add_Only_From_Amount_Values() {
		appiumHelpers.waitForVisibilityOfElement(AMOUNT_FROM);
		enterText(AMOUNT_FROM, Amount_from_1);
		driver.hideKeyboard();
	}
	
	public void Verify_Search_Result_For_start() {
		List<MobileElement> elements1 = driver.findElements(By.id("lblAccountBal"));
		for(MobileElement link : elements1)
		{
		  String Date = link.getText();
		  System.out.println("List dates: "+Date);
		  String Year = Date.substring(6, 8);
		  int ActualYear = Integer.parseInt(Year);
		  System.out.println("Actual Year: " + ActualYear);
		  assert ActualYear>=17 : "Fitler using date is not working fine";
		}
		elementExists(CHEQUE_NO);
		elementExists(CHEQUE_AMT);
		elementExists(CHEQUE_STATUS);	
	}
	
	public void Verify_Search_Result_for_to_Amount_Values() {
		List<MobileElement> elements2 = driver.findElements(By.id("lblAccountBalValue"));
		for(MobileElement link : elements2)
		{
		  String Amt_no = link.getText();
		  System.out.println("List cheque no: "+Amt_no);
		  int Amount_ton = Integer.parseInt(Amount_to_1);
		  try {
			  int Actual_amt_no = Integer.parseInt(Amt_no);
			  assert Actual_amt_no <= Amount_ton : "Fitler using amount values is not working fine";
		  	}catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		}
		elementExists(CHEQUE_DATE);
		elementExists(CHEQUE_NO);
		elementExists(CHEQUE_STATUS);
	}
	
	public void Verify_Search_Result_for_from_Amount_Values() {
		List<MobileElement> elements2 = driver.findElements(By.id("lblAccountBalValue"));
		for(MobileElement link : elements2)
		{
		  String Amt_no = link.getText();
		  System.out.println("List cheque no: "+Amt_no);
		  int Amount_ton = Integer.parseInt(Amount_from_1);
		  try {
			  int Actual_amt_no = Integer.parseInt(Amt_no);
			  assert Actual_amt_no >= Amount_ton : "Fitler using amount values is not working fine";
		  	}catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		}
		elementExists(CHEQUE_DATE);
		elementExists(CHEQUE_NO);
		elementExists(CHEQUE_STATUS);
	}
	
	public void Verify_Search_for_to_Check_Number() {
		List<MobileElement> elements = driver.findElements(By.id("lblAccountName"));
		for(MobileElement link : elements)
		{
		  String cheq_no = link.getText();
		  System.out.println("List cheque no: "+cheq_no);
		  int Actual_cheq_no = Integer.parseInt(cheq_no);
		  int Cheque_ton = Integer.parseInt(Cheque_to_1);
		  assert Actual_cheq_no <= Cheque_ton : "Fitler using Cheque number is not working fine";
		}
		elementExists(CHEQUE_DATE);
		elementExists(CHEQUE_AMT);
		elementExists(CHEQUE_STATUS);
	}
	
	public void Verify_Search_for_From_Check_Number() {
		List<MobileElement> elements = driver.findElements(By.id("lblAccountName"));
		for(MobileElement link : elements)
		{
		  String cheq_no = link.getText();
		  System.out.println("List cheque no: "+cheq_no);
		  int Actual_cheq_no = Integer.parseInt(cheq_no);
		  int Cheque_ton = Integer.parseInt(Cheque_from_1);
		  assert Actual_cheq_no >= Cheque_ton : "Fitler using Cheque number is not working fine";
		}
		elementExists(CHEQUE_DATE);
		elementExists(CHEQUE_AMT);
		elementExists(CHEQUE_STATUS);
	}
	
	public void Tap_On_Specific_Cheque() {
		appiumHelpers.waitForVisibilityOfElement(CHEQUE_INDIVIDUAL);
		clickOnElement(CHEQUE_INDIVIDUAL);
		appiumHelpers.waitForVisibilityOfElement(CHEQ_HD);
	}
	
	public void Verify_cheque_image() {
		clickOnElement(CHEQ_IMG);
	}
}
