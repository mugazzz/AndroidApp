package alhilal.androidapp.utils;

import org.openqa.selenium.By;

public class Locators {
	
	public static final By PROGRESS_BAR = By.className("android.widget.ProgressBar");
	
	
	//Splash Screen
	public static final By SPLASH_VIDEO = By.className("android.widget.VideoView");
	
	//Registration screen
	
	public static final By Landing_Screen_Logo = By.id("com.ahb.mb.dev:id/imgLogo");
	public static final By REG_CARD_BTN = By.xpath("//android.widget.Button[@text='Register using card number']");
	public static final By REG_CARD_BTNID = By.id("btnLetsgetStarted");
	public static final By CONACT_US = By.xpath("//android.widget.TextView[@text='Contact Us']");
	public static final By BRANCH_LOCATOR = By.xpath("//android.widget.TextView[@text='ATM / Branch Locator']");
	public static final By REG_CUS_LINK = By.xpath("//android.widget.Button[@text='Or register using your customer number']");
	public static final By ARAB_BTN = By.id("btnArabic");
	public static final By AREG_CARD_BTN = By.xpath("//android.widget.Button[@text='التسجيل عن طريق رقم بطاقتك']");
	public static final By ACONACT_US = By.xpath("//android.widget.TextView[@text='اتصل بنا']");
	public static final By ABRANCH_LOCATOR = By.xpath("//android.widget.TextView[@text='أجهزة الصراف الآلي | الفروع']");
	public static final By AREG_CUS_LINK = By.xpath("//android.widget.Button[@text='أو عن طريق رقم المتعامل']");
	public static final By ENG_BTN = By.xpath("//android.widget.Button[@text='English']");
	public static final By REG_CUS_NO_LINK = By.id("btnRegisterUsingAccountNumber");
	
	//Card Registration screen
	public static final By REG_CARD_HD = By.id("lblHeading");
	public static final By REG_CARD_NO = By.id("tbxCardNo1");
	public static final By REG_CARD_PN = By.id("flxPinDetails");
	public static final By AREG_CARD_NO = By.xpath("//android.widget.TextView[@text='رقم البطاقة']");
	public static final By AREG_CARD_HD = By.xpath("//android.widget.TextView[@text='التسجيل']");
	public static final By AREG_CARD_PN = By.xpath("//android.widget.TextView[@text='رمز البطاقة']");
	public static final By AREG_CARD_RG = By.xpath("//android.widget.Button[@text='أو عن طريق رقم المتعامل']");
	public static final By HEAD_BACK = By.id("btnBack");
	
	//Customer Registration screen
	public static final By REG_CUS_NO_LB = By.id("lblAccountNo");
	public static final By REG_CUS_NO_FD = By.id("tbxAccountNo");
	public static final By REG_SMS_PN_FD = By.id("flxSmsNumber");
	public static final By REG_CUS_TPIN_TAB = By.id("btnPin");
	public static final By REG_CUS_TPIN_FD = By.id("tbxTpinNo");
	public static final By REG_CUS_TPIN_NT = By.id("btnNext");

	public static final By AREG_CUS_NO = By.xpath("//android.widget.TextView[@text='رقم المتعامل']");
	public static final By AREG_CUS_HD = By.xpath("//android.widget.TextView[@text='التسجيل']");
	public static final By AREG_CUS_SMS = By.xpath("//android.widget.Button[@text='رمز خدمة الرسائل النصية  ']");
	public static final By AREG_CUS_PIN = By.xpath("//android.widget.Button[@text='رمز خدمة الهاتف ']");
	public static final By AREG_CUS_ACC = By.id("tbxAccountNo");
	public static final By AREG_CUS_SMSN = By.id("flxSmsNumber");
	public static final By AREG_CUS_RG = By.xpath("//android.widget.Button[@text='التسجيل عن طريق رقم البطاقة']");
	
	//OTP Screen
	public static final By OTP_HD = By.id("lblOTPMessage");
	public static final By OPT_FIELD = By.className("android.widget.EditText");
	public static final By RESEND_OTP = By.id("btnResendCode");
	
	
	//All set screen
	public static final By CRE_LOGIN_PIN_LB = By.id("lblCreatePin");
	public static final By CRE_LOGIN_PIN_FD = By.id("flxTextPin");
	public static final By CRE_LOGIN_REPIN_FD = By.id("flxRePinText");
	public static final By CRE_LOGIN_PIN_CF = By.id("btnConfirm");
	public static final By ALL_SET = By.xpath("//android.widget.TextView[@text='You are all set!']");
	public static final By ENABLE_FINGERPRINTS =By.id("btnEnable");
	public static final By SKIP_FINGERPRINT = By.id("lblSkip");
	
	//Home Screen - Registered User
	public static final By FINGERPRINTS_POPUP =By.id("flxContainer");
	public static final By FINGERPRINTS_POPUP_CANCEL =By.id("lblCancel");
	public static final By REG_HOME_LOGIN = By.xpath("//android.widget.TextView[@text='Login PIN']");
	public static final By REG_HOME_USE_FING = By.xpath("//android.widget.TextView[@text='Or use Fingerprints for login']");
	public static final By REG_HOME_FORGOT_PIN = By.xpath("//android.widget.Button[@text='Forgot Login PIN']");
	public static final By REG_HOME_CHANGE_USER = By.xpath("//android.widget.Button[@text='Change User']");
	public static final By REG_HOME_BRANCH_LOCATOR = By.xpath("//android.widget.TextView[@text='ATM / Branch Locator']");
	public static final By REG_HOME_CONTACT_US = By.xpath("//android.widget.TextView[@text='Contact Us']");
	public static final By REG_HOME_ENG_LANG = By.xpath("//android.widget.Button[@text='English']");
	public static final By REG_HOME_ENG_LNG = By.id("btnEnglishLogin");
	
	public static final By REG_HOME_ARB_LNG = By.id("btnArabicLogin");
	public static final By AREG_HOME_LOGIN = By.xpath("//android.widget.TextView[@text='رمز تسجيل الدخول']");
	public static final By AREG_HOME_USE_FING = By.xpath("//android.widget.TextView[@text='Or use Fingerprints for login']");
	public static final By AREG_HOME_FORGOT_PIN = By.xpath("//android.widget.Button[@text='نسيت رمز تسجيل الدخول']");
	public static final By AREG_HOME_CHANGE_USER = By.xpath("//android.widget.Button[@text='تغيير المستخدم']");
	public static final By AREG_HOME_BRANCH_LOCATOR = By.xpath("//android.widget.TextView[@text='أجهزة الصراف الآلي | الفروع']");
	public static final By AREG_HOME_CONTACT_US = By.xpath("//android.widget.TextView[@text='اتصل بنا']");
	
	
	
	//SQL Client
	/*public static final By CONFIGBTN = By.id("fab_new");
	public static final By SMSIP = By.id("tv_url");
	public static final By QUERYTAB = By.xpath("//android.support.v7.app.ActionBar$Tab[2]");
	public static final By QueryFD = By.id("et_query");
	public static final By Exbtn = By.id("btn_execute");
	public static final By selectopt = By.id("text1");
	public static final By VENDOR_SELECT = By.xpath("//android.widget.CheckedTextView[@text='MS SQL']");
	public static final By GET_QUERY = By.xpath("//android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[0]//android.widget.FrameLayout[1]//android.widget.TextView[0]");
	public static final By HOST_NAME = By.id("et_host");
	public static final By PORT = By.id("et_port");
	public static final By USER_NAME = By.id("et_user");
	public static final By PASSWORD = By.id("et_pass");
	public static final By HOST_SAVE = By.id("btn_save");*/
	
	//Dashboard Screen
	public static final By DASHBOARD_HEADING = By.id("lblWelcomeBack");
	public static final By MINIMIZE_CHART = By.id("imgChartSizeToggle");
	public static final By ACCOUNT_LABEL = By.xpath("//android.widget.TextView[@text='My Accounts']");
	public static final By AACCOUNT_LABEL = By.xpath("//android.widget.TextView[@text='My accounts']");
	public static final By ACT_CURRENT_ACC = By.xpath("//android.widget.TextView[@text='AE29 0530 0000 2404 1984 027']");
	
	//Current Account Screen
	public static final By HEAD_CHECK = By.id("lblHeading");
	public static final By CHEQUE_VIEW = By.xpath("//android.widget.Button[@text='Cheques View']");
	public static final By HEAD_CHEQUE = By.xpath("//android.widget.TextView[@text='Cheque List']");
	public static final By IMAGE_INFO =By.id("flxAccounts");
	
	//Cheque List
	public static final By APPLY_FILTER = By.id("imgFilter");
	public static final By CHEQUE_NO  = By.id("lblAccountName");
	public static final By CHEQUE_AMT = By.id("lblAccountBalValue");
	public static final By CHEQUE_STATUS = By.id("lblTransactionDate");
	public static final By CHEQUE_DATE = By.id("lblAccountBal");
	
	
	//Advanced Search
	public static final By ADV_SER_HD = By.xpath("//android.widget.TextView[@text='Advanced Search']");
	public static final By TIME_RANGE = By.id("flxTimeRangeWrapper");
	public static final By CUSTOM_PERIOD = By.xpath("//android.widget.TextView[@text='Custom Period']");
	public static final By START_LAB = By.id("lblStartDate");
	//public static final By START_DATE = By.xpath("//android.widget.ScrollView[1]/android.view.ViewGroup[0]/android.view.ViewGroup[1]/android.view.ViewGroup[0]/android.view.ViewGroup[1]/android.view.ViewGroup[0]/android.widget.LinearLayout[2]/android.widget.LinearLayout[0]");
	public static final By START_DATE = By.xpath("//android.widget.TextView[@text='mm/dd/yyyy']");
	public static final By STA_YEAR = By.id("date_picker_header_year");
	public static final By STA_YEAR_PIC = By.xpath("//android.widget.TextView[@text='2015']");
	public static final By START_OK = By.id("button1");
	public static final By SEARCH_BTN = By.id("btnSearch");
	public static final By STA_YEARs = By.id("Filter is not working fine");
	public static final By ADD_RANGE = By.id("lblAddRangeTitleTwo");
	public static final By REMOVE_RANGE = By.id("lblAddRangeTitleOne");
	public static final By CHEQ_FROM = By.id("txtCheckNumbersFrom");
	public static final By CHEQ_TO = By.id("txtCheckNumbersTo");
	public static final By AMOUNT_FROM = By.id("txtAmountFrom");
	public static final By AMOUNT_TO = By.id("txtAmountTo");
	
	
	//Login Screen
	public static final By LOGIN_PIN_FD = By.id("flxTbxPin");
	
	
	
}
