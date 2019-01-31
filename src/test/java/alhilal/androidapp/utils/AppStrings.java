package alhilal.androidapp.utils;

import org.openqa.selenium.By;

public class AppStrings {
	
	 //Waits
	    public static final int IMPLICIT_WAIT_TIME = 30;
	    
	    public static final String NATIVE_CONTEXT = "NATIVE_APP";
	    public static final String customerNo = "1234567";
	    public static final String customerSms = "123456";
    
    //Credit Card Registration
	    //public static final String Act_Credit_Card_No = "4584610162170809";
	    public static final String Act_Credit_Card_No = "4714845567915712"; 
//	    public static final String Act_Credit_Card_No_Specific = "4584610105853560";
//	    public static final String Act_Credit_Card_Pin_Specific = "1234";
	    public static final String Exp_Credit_Card_No = "4584610168800037";
	    public static final String Inactive_Credit_Card_No = "4584610169749803";
	    public static final String Inactive_Credit_Card_Pin = "2345";
	    public static final String Act_Credit_Card_No_Pin = "4584610163073101"; 
	    public static final String Act_Credit_Card_Inact_Pin = "4714847770083320";
	    public static final String Act_Credit_Card_Inact_Pin_Inact = "3456";
	    public static final String Inval_Credit_Card_No = "4584610167454560";
	    public static final String Incor_Credit_Card_No = "4584610105853561";
	    public static final String Act_Credit_Card_Pin = "1234";
	    public static final String Act_Credit_Card_Pin_Inact = "3456";
	    public static final String Inval_Credit_Card_Pin = "1239";
	    public static final String Incor_Credit_Card_Pin = "1236";
    
	//Debit Card Registration
	    public static final String Act_Debit_Card_No = "4714845567915712"; 
	    public static final String Act_Debit_Card_Pin = "1234";
	    public static final String Inactive_Debit_Card_No = "4714847609904308";
	    public static final String Inactive_Debit_Card_Pin = "5678";
	    public static final String Incor_Debit_Card_No = "4714847770083320";
	    public static final String Incor_Debit_Card_Pin = "456";
	    public static final String Act_Debit_Card_No_Pin = "4714845584467705";
	    public static final String Act_Debit_Card_Inact_Pin = "4714847770083320";
	    public static final String Act_Debit_Card_Inact_Pin_Inact = "4567";
	    public static final String Exp_Debit_Card_No = "4192360100391810";
	    public static final String Inval_Debit_Card_Pin = "4569";
	    
	//Customer Number Registration
	    public static final String Act_Cust_No3 = "4041984";
	    public static final String Act_Cust_No = "7799712";
	    public static final String Act_Cust_No1 = "9677570";
	    public static final String Act_Cust_No2 = "5000436";
	    public static final String Act_Cust_No_Acc = "7799712";
	    public static final String Act_SMS_PN = "123456";
	    public static final String Act_Cust_No_Spec_Card = "7799712";
	    public static final String Act_Cust_No_Card = "9090903";
	    public static final String Act_SMS_PN_Spec_Card = "123456";
	    public static final String Act_Cust_No_Spec_No_bill = "7799712";
	    public static final String Act_SMS_PN_Spec_No_bill = "123456";
	    public static final String Act_Cust_No_Spec_Acc = "4041984";
	    public static final String Act_SMS_PN_Spec_Acc = "123456";
	    public static final String Act_Cust_No_Spec_Dep = "4446919";
	    public static final String Act_SMS_PN_Spec_Dep = "123456";
	    public static final String Act_Cust_No_Spec_Fin = "9090903";
	    public static final String Act_SMS_PN_No_Spec_Fin = "123456";
	    public static final String Inact_Cust_No = "6700067";
	    public static final String Cust_No_with_No_Pin = "6556425";
	    public static final String Cust_No_with_No_SPin = "4041980";
	    public static final String Incorr_Cust_No = "404198";
	    public static final String Incorr_SMS_PN = "12345";
	    public static final String Inact_SMS_PN_Cus = "1622882";
	    public static final String Inact_TPN_Cus = "2125533";
	    public static final String Inact_SMS_PN = "123455";
	    public static final String Invalid_SMS_PN = "123595";
	    public static final String Act_TPIN_PN = "12345";
	    public static final String Incorr_TPN = "12345";
	    public static final String Act_Cust_No_TPIN_SMS= "9500000";
	    public static final String Act_Cust_No_1000k= "9600000";
	    
	    
	    
	//Set PIN Screen
	    public static final String Enter_Pin = "1234";
	    public static final String Inc_Enter_Pin = "123";
	    public static final String Renter_Pin = "4321";
	    
    //Validation Messages
	    public static final String Inactive_crad_Validation_Message = "The card you are using is either expired, blocked or inactive.  Please use another card or use another option to register.";
	    
	    public static final String Incorrect_Cheque_Number = "No records available";
	    public static final String Greater_Amount ="To amount must be greater than from amount";
	    public static final String Inactive_CIF_Validation_Message = "The combination of CIF/SMS-PIN entered is incorrect. Please try again or use another option to register";
	    public static final String Check_Filter_Validation ="To cheque number must be greater than from cheque number";
	    public static final String Inactive_CIF_Validation_Message_InvSMS = "The combination of CIF/SMS-PIN entered is incorrect. Please try again or use another option to register";
	    public static final String Inactive_CIF_Validation_Message_InvTPIN = "The combination of CIF/T-PIN entered is incorrect. Please try again or use another option to register";
	    public static final String Inactive_CIF_Validation_Message1 = "The combination of CIF/SMS-PIN entered is incorrect. Please try again or use another option to register";
	    public static final String Inactive_CIF_Validation_Message_T = "The Account number is incorrect";
	    public static final String Inactive_CIF_Validation_Message_T1 = "The combination of CIF/T-PIN entered is incorrect.Please try again or use another option to register";
	    public static final String Inactive_CIF_Validation_Message_T2 = "something went wrong, please try after some time. If problem continues please contact support.";
	    
	    public static final String Inactive_CIF_Validation_Message_R = "something went wrong, please try after some time. If problem continues please contact support.";
	    public static final String Pin_notSet_notActive_Validation_Message2 = "You have entered an invalid Al Hilal Bank card number";
	    public static final String Pin_notSet_notActive_Validation_Message = "Something went wrong, please try again after some time";
	    public static final String Pin_notSet_notActive_Validation_Message3 = "Something went wrong, please try again after some time";
	    public static final String Pin_notSet_notActive_Validation_Message1 = "The card you are using is either expired, blocked or inactive.  Please use another card or use another option to register.";
	    public static final String Expired_Card_Validation_Message = "The card you are using is either expired, blocked or inactive.  Please use another card or use another option to register.";
	    public static final String Invalid_Card_Validation_Message = "The card you are using is either expired, blocked or inactive.  Please use another card or use another option to register.";
	    public static final String Card_block_Validation_Message = "The card you are using is either expired, blocked or inactive.  Please use another card or use another option to register.";
	    //public static final String Query = "select tabdata from ibpushmessages order by recddatetime desc;";
	    public static final String Invalid_Pin_Validation = "Incorrect login PIN. Please try again";
	    public static final String Pin_Blocked_Message = "Your Login PIN has been blocked due to exceeding incorrect entries. Please click forgot PIN to reset";
	    public static final String WEBVIEW_CONTEXT = "WEBVIEW";
	    public static final String OTP_Validation = "The One Time Password you entered is incorrect. Please try again or click re-send OTP to receive a new one";
	    public static final String INVALID_SWIFT = "You have entered an invalid SWIFT Code";
	    public static final String INVALID_IBAN = "You have entered an invalid IBAN";
	    public static final String DUP_NICK = "The given nick name is already associated with the user";
	    public static final String DUP_IBAN = "The beneficiary you are trying to add, already exists";
	    public static final String Inactive_CIF_Validation_Message_R1 = "The combination of CIF/SMS-PIN entered is incorrect. Please try again or use another option to register";
	    public static final String Act_Nick_Val = "Device nickname changed";
	    public static final String Dup_Nick_Val = "You already have a device registered with the same nickname";
	    public static final String PIN_SUCE = "Login PIN has been changed successfully";
	    public static final String INCOR_SUCC = "Current PIN entered is incorrect. Please try again or change your Login PIN using the";
	    public static final String MIS_PIN = "Login PINs entered do not match";
	    public static final By FING_CANCEL = By.id("lblCancel");
	    
	    
	//Web Application for OTP  
	    public static final String OTPweb = "https://10.10.137.153:8445/SMS/LoginAction.do";
	    public static final String web_username = "administrator";
	    public static final String web_password = "password1";
    
	//Advanced Search Screen
	    public static final String Cheque_from = "20";
	    public static final String Cheque_from_incorrect = "100000";
	    public static final String Cheque_to = "35";
	    public static final String Cheque_to_1 = "9";
	    public static final String Cheque_from_1 = "18";
	    public static final String Amount_from = "2000";
	    public static final String Amount_from_1 = "37000";
	    public static final String Amount_to = "50000";
	    public static final String Amount_to_1 = "35000";
	    
	    
	//Transfers section
	    public static final String iban = "GB85NWBK60214774249150";
	    public static final String inc_iban = "GB85NWBK60214774249152";
	    public static final String iban1 = "GB85 NWBK 6021 4774 2491 50";
	    public static final String iban2 = "NEW YORK,NY";
	    public static final String iban_ahb = "AE95 0530 0000 2404 1984 003";
	    public static final String Full_Name = "Automation";
	    public static final String Nick_Name = "Tester";
	    public static final String Full_Name1 = "Automation1";
	    public static final String Nick_Name1 = "Tester1";
	    public static final String Contry = "Great Britain";
	    public static final String Contry1 = "United States of America";
	    public static final String Bank_Name = "NATIONAL WESTMINSTER BANK PLC";
	    public static final String Bank_Name1 = "BANK OF AMERICA, N.A.";
	    public static final String Bank_Name_ahb = "AL Hilal Bank";
	    public static final String Acc_Num = "898061194426";
	    public static final String Swif_Code = "BOFAUS3NXXX";
	    public static final String Incor_Swif_Code = "BOFAUS3NXXY";
	    public static final String Con_Tm = "US";
	    public static final String AHB_ACC = "4041984003";
	    public static final String AHB_ACC1 = "4041 9840 03";
	    public static final String Full_Name_AHB = "AHBAutomation";
	    		
	  //Support
	    public static final String Nick_Na = "ZZZ";
	    public static final String Nick_Na1 = "ZZZ1";
	    
	  //Transfers
	    public static final String Tran_amt = "1.00";
	    public static final String Remark = "Remark Testing";
	    
	  

}