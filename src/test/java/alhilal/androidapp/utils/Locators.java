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
	public static final By FINANCES_LABEL = By.xpath("//android.widget.TextView[@text='My Finances']");
	public static final By AACCOUNT_LABEL = By.xpath("//android.widget.TextView[@text='My accounts']");
	public static final By ACT_CURRENT_ACC = By.xpath("//android.widget.TextView[@text='AE29 0530 0000 2404 1984 027']");
	public static final By ACT_SAVING_ACC = By.xpath("//android.widget.TextView[@text='AE73 0530 0000 2404 1984 011']");
	public static final By ACT_SAVING_ACC1 = By.xpath("//android.widget.TextView[@text='AE68 0530 0000 2404 1984 004']");
	public static final By CARD_LABEL = By.xpath("//android.widget.TextView[@text='My Cards']");
	public static final By VISA_GOLD = By.xpath("//android.widget.TextView[@text='VISA GOLD UJRAH']");
	public static final By CURRENT_ACC_LST = By.xpath("//android.widget.TextView[@text='Current Account']");
	public static final By ACT_BALANCE_VAL = By.id("lblAccountBalValue");
	public static final By GO_BACK = By.id("btnBack");
	public static final By MY_FINANCE_CARD = By.xpath("//android.widget.TextView[@text='Goods Murabaha']");
	public static final By DEPOSIT_LABEL = By.xpath("//android.widget.TextView[@text='My Deposits']");
	public static final By DEPOSIT_ACC = By.xpath("//android.widget.TextView[@text='One Year Term Deposit']");
	public static final By ACT_CH = By.id("segAccounts_1_6_flxAccountsNoImage_flxMain_lblBankName");
	public static final By TRANF_TAB = By.id("flxTransfer");
	
	//Current Account Screen
	public static final By HEAD_CHECK = By.id("lblHeading");
	public static final By CHEQUE_VIEW = By.xpath("//android.widget.Button[@text='Cheques View']");
	public static final By HEAD_CHEQUE = By.xpath("//android.widget.TextView[@text='Cheque List']");
	public static final By IMAGE_INFO =By.id("flxAccounts");
	public static final By ACCO_NUMBER =By.id("lblAccountNumber");
	public static final By CARD_BAL =By.id("lblBalanceAmount");
	
	//Cheque List
	public static final By APPLY_FILTER = By.id("imgFilter");
	public static final By CHEQUE_NO  = By.id("lblAccountName");
	public static final By CHEQUE_AMT = By.id("lblAccountBalValue");
	public static final By CHEQUE_STATUS = By.id("lblTransactionDate");
	public static final By CHEQUE_DATE = By.id("lblAccountBal");
	public static final By CHEQUE_INDIVIDUAL = By.id("flxTransactionsManage");
	
	//Cheque Details
	public static final By CHEQ_HD = By.xpath("//android.widget.TextView[@text='Cheque Details']");
	public static final By CHEQ_IMG = By.id("imgCheckFront");
	
	//Advanced Search
	public static final By ADV_SER_HD = By.xpath("//android.widget.TextView[@text='Advanced Search']");
	public static final By TIME_RANGE = By.id("flxTimeRangeWrapper");
	public static final By CUSTOM_PERIOD = By.xpath("//android.widget.TextView[@text='Custom Period']");
	public static final By START_LAB = By.id("lblStartDate");
	//public static final By START_DATE = By.xpath("//android.widget.ScrollView[1]/android.view.ViewGroup[0]/android.view.ViewGroup[1]/android.view.ViewGroup[0]/android.view.ViewGroup[1]/android.view.ViewGroup[0]/android.widget.LinearLayout[2]/android.widget.LinearLayout[0]");
	public static final By START_DATE = By.xpath("//android.widget.TextView[@text='mm/dd/yyyy']");
	public static final By STA_YEAR = By.id("date_picker_header_year");
	public static final By STA_YEAR_PIC = By.xpath("//android.widget.TextView[@text='2015']");
	public static final By STA_YEAR_PIC1 = By.xpath("//android.widget.TextView[@text='2017']");
	public static final By START_OK = By.id("button1");
	public static final By SEARCH_BTN = By.id("btnSearch");
	public static final By STA_YEARs = By.id("Filter is not working fine");
	public static final By ADD_RANGE = By.id("lblAddRangeTitleTwo");
	public static final By REMOVE_RANGE = By.id("lblAddRangeTitleOne");
	public static final By CHEQ_FROM = By.id("txtCheckNumbersFrom");
	public static final By CHEQ_TO = By.id("txtCheckNumbersTo");
	public static final By AMOUNT_FROM = By.id("txtAmountFrom");
	public static final By AMOUNT_TO = By.id("txtAmountTo");
	public static final By END_DATE = By.id("calEndDate");
	public static final By START_DATE_ONLY = By.id("calStartDate");
	
	//Cards Detail
	public static final By CARD_SLIDE = By.id("flxAHBCards");
	public static final By AVL_CRD_LMT_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By AVL_CRD_LMT_VL = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By OUT_STANDING_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By OUT_STANDING_VL = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By CARD_NUMBER = By.id("lblCardNumber");
	public static final By CARD_HOLD_NAME = By.xpath("//android.support.v4.view.ViewPager[@index='0']/android.widget.ScrollView[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']");
	public static final By INFO_BTN = By.id("imgInfo");
	public static final By BILL_PAYMENT = By.id("btnBillPayment");
	
	
	//Additional Card Details:
	public static final By ADD_CARD_HD = By.xpath("//android.widget.TextView[@text='Card details']");
	public static final By CARD_NUM = By.id("lblCurrentAccountValue");
	public static final By ACC_AMOUNT = By.id("lblAmount");
	public static final By AVL_CRD_LMT_LB_A = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By AVL_CRD_LMT_VL_A = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By OUT_STANDING_LB_A = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='0']");
	public static final By OUT_STANDING_VL_A = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']");
	public static final By STAT_BAL_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='0']");
	public static final By STAT_BAL_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']");
	public static final By STAT_DATE_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
	public static final By STAT_DATE_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='1']");
	public static final By MIN_AMT_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='3']/android.widget.TextView[@index='0']");
	public static final By MIN_AMT_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='3']/android.widget.TextView[@index='1']");
	public static final By CARD_OWNER_A_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='5']/android.widget.TextView[@index='0']");
	public static final By CARD_OWNER_A_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='5']/android.widget.TextView[@index='1']");
	public static final By CARD_STATUS_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='6']/android.widget.TextView[@index='0']");
	public static final By CARD_STATUS_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='6']/android.widget.TextView[@index='1']");
	public static final By TOT_CARD_LMT_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='7']/android.widget.TextView[@index='0']");
	public static final By TOT_CARD_LMT_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='7']/android.widget.TextView[@index='1']");
	
	//Login Screen
	public static final By LOGIN_PIN_FD = By.id("flxTbxPin");
	
	//Account details Screen
	public static final By ACC_DETAIL = By.xpath("//android.widget.TextView[@text='Account details']");
	public static final By FIN_DETAIL = By.xpath("//android.widget.TextView[@text='Finance details']");
	public static final By ACC_AMT = By.id("lblAmount");
	public static final By IBAN = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@text='IBAN']");
	public static final By IBANV = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By Account_Number_D = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='1']/android.widget.TextView[@text='Account Number']");
	public static final By Account_Number_D_V = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']");
	public static final By SCodeD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='2']/android.widget.TextView[@text='SWIFT Code']");
	public static final By SCodeD_V = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='1']");
	public static final By Account_holderD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='3']/android.widget.TextView[@text='Account holder']");
	public static final By Account_holderD_v = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='3']/android.widget.TextView[@index='1']");
	public static final By Account_holder_CIF = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='4']/android.widget.TextView[@text='Account holder CIF']");
	public static final By Account_holder_CIF_v = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='4']/android.widget.TextView[@index='1']");
	public static final By Branch = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='5']/android.widget.TextView[@text='Branch']");
	public static final By BranchV = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='5']/android.widget.TextView[@index='1']");
	public static final By LINKEDDEBIT = By.id("lblLinkedDebitCards");
	public static final By LINKD1 = By.xpath("//android.widget.ScrollView[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='3']/android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By LINKD1V = By.xpath("//android.widget.ScrollView[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='3']/android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	
	//Finance detail screen
	public static final By FIN_SLIDE = By.id("flxAccounts");
	public static final By NXT_PY_AM_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By NXT_PY_AM_VL = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By NXT_PY_DATE_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By NXT_PY_DATE_VL = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By FIN_TYPE = By.id("lblAccounts");
	public static final By FIN_ACC_NUM = By.id("lblAccountNumber");
	public static final By FIN_OUT_BAL_LB = By.id("lblAvailableBalance");
	public static final By FIN_OUT_BAL_VL = By.id("lblBalanceAmount");
	
	//Finance Addition Screen
	public static final By FIN_TYPE_A = By.id("lblCurrentAccount");
	public static final By FIN_OUT_BAL_VL_A = By.id("lblAmount");
	public static final By FIN_NXT_PY_AMT_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By FIN_NXT_PY_AMT_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By FIN_NXT_PY_DT_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='0']");
	public static final By FIN_NXT_PY_DT_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']");
	public static final By FIN_RM_PY_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
	public static final By FIN_RM_PY_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='1']");
	public static final By FIN_RE_PY_AC_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='3']/android.widget.TextView[@index='0']");
	public static final By FIN_RE_PY_AC_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='3']/android.widget.TextView[@index='1']");
	public static final By FIN_CON_NM_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='4']/android.widget.TextView[@index='0']");
	public static final By FIN_CON_NM_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='4']/android.widget.TextView[@index='1']");
	public static final By FIN_CON_DT_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='5']/android.widget.TextView[@index='0']");
	public static final By FIN_CON_DT_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='5']/android.widget.TextView[@index='1']");
	public static final By FIN_OV_DU_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='6']/android.widget.TextView[@index='0']");
	public static final By FIN_OV_DU_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.view.ViewGroup[@index='6']/android.widget.TextView[@index='1']");
	
	//Deposit details screen
	public static final By DEPOSIT_TYPE = By.id("lblAccounts");
	public static final By DEPOSIT_AC_NO = By.id("lblAccountNumber");
	public static final By DEPOSIT_AV_BAL_LB = By.id("lblAvailableBalance");
	public static final By DEPOSIT_AV_BAL_AMT = By.id("lblBalanceAmount");
	public static final By DEP_EPR_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By DEP_EPR_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By DEP_TN_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By DEP_TN_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By DEP_MT_DT_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='3']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By DEP_MT_DT_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='3']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	public static final By DEP_PF_AC_LB = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='4']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
	public static final By DEP_PF_AC_FD = By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='4']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']");
	
	
	//Tranfers
	public static final By TRANF_TO_OTHERS = By.id("lblPayAPerson");
	public static final By ADD_BENIF = By.id("lblAddBeneficiary");
	public static final By OTHER_BANK = By.id("lblOtherBank");
	public static final By ENT_IBAN = By.id("tbxIban");
	public static final By NXT_BTN = By.id("btnNext");
	public static final By FUL_NAME = By.id("tbxFullName");
	public static final By NICK_NAME = By.id("tbxNickName");
	public static final By BEN_NAME = By.id("lblBenName");
	public static final By BEN_NAME_DATA = By.id("lblBenNameData");
	public static final By CONT_DATA = By.id("lblCountryData");
	public static final By ACC_NUMBER = By.id("lblAccount");
	public static final By ACC_NUMBER_DA = By.id("lblAccountData");
	public static final By BANK_DATA = By.id("lblBankNameData");
	public static final By BRANCH_DATA = By.id("lblBranchData");
	public static final By NICK_DATA = By.id("lblNickNameData");
	public static final By EDIT_BEN = By.id("btnEdit");
	public static final By SUCCESS_PAGE = By.id("SucessPage");
	public static final By MAKE_TRANSFER = By.id("btnConfirm");
	public static final By GOTOACC = By.id("lblNavigate");
	public static final By ACCANDSWIFT = By.id("btnAccountNumberAndSwift");
	public static final By ACC_NUM = By.id("tbxAccountNumber");
	public static final By SWIF_COD = By.id("tbxSwiftCode");
	public static final By CONT_HD = By.id("lblABCDCodeHeading");
	public static final By CONT_COD = By.id("tbxABCDCode");
	public static final By CONT_SKIP = By.id("btnNext");
	public static final By CONT_SWIFT = By.id("lblSwift");
	public static final By CONT_SWIFT_DA = By.id("lblSwiftData");
	
	//Transfer Amount
	public static final By THIRD_ACC = By.id("lblPurpose");
	public static final By LOC_THIRD_ACC = By.xpath("//android.widget.TextView[@text='AE47 0500 0000 0002 6392 828']");
	public static final By FROM_ACC = By.id("lblFromAccount1");
	public static final By FROM_ACC_DATA = By.id("lbxFromAccountData");
	public static final By TRAN_AMT = By.id("tbxTransferAmount");
	public static final By AVAI_AMT = By.id("lblAvailableAmount");
	public static final By IND_AMT = By.id("lblIndicativeAmount");
	public static final By SEL_CUR = By.id("lbxCurrency");
	public static final By CUR_ACC_AMT = By.xpath("//android.widget.CheckedTextView[@text='Current Account 1212115018']");
	public static final By CUR_ACC_AMT1 = By.xpath("//android.widget.CheckedTextView[@text='Current Account 9677570022']");
	public static final By SAV_ACC_AMT = By.xpath("//android.widget.CheckedTextView[@text='Saving Account 1212115003']");
	public static final By SEL_CHAR = By.id("lbxChargesData");
	public static final By SEL_REASON = By.id("lbxReasonData");
	public static final By SEL_REASONS = By.xpath("//android.widget.CheckedTextView[@text='Charitable Contributions']");
	public static final By REMARK = By.id("txtAreaRemarks");
	public static final By SEL_ME = By.xpath("//android.widget.CheckedTextView[@text='Me']");
	public static final By CONF_BUT = By.id("btnConfirm");
	public static final By SEL_AED = By.xpath("//android.widget.CheckedTextView[@text='AED']");
	
	//Transfer Details
	public static final By FLX_CONF = By.id("flxConfirmationMain");
	public static final By DEBIT_AMT = By.id("lblFromAccountValue");
	public static final By REMAIN_AMT = By.id("lblBank");
	public static final By REAS_CFN = By.id("lblReasonForTransferValue");
	public static final By CHAR_BY = By.id("lblApplicableChargesValue");
	public static final By REM_CFN = By.id("lblRemarksValue");
	public static final By CUR_ACC = By.xpath("//android.widget.TextView[@text='1212 1150 18']");
	public static final By SAV_ACC = By.xpath("//android.widget.TextView[@text='1212 1150 03']");
	public static final By ZERO_CUR_ACC = By.xpath("//android.widget.CheckedTextView[@text='Current Account 1212115002']");
	public static final By ZERO_SAV_ACC = By.xpath("//android.widget.CheckedTextView[@text='Saving Account 1212115003']");
	public static final By INAC_SAV_ACC = By.xpath("//android.widget.CheckedTextView[@text='Saving Account 1212115003']");
	public static final By INAC_CUR_ACC = By.xpath("//android.widget.CheckedTextView[@text='Current Account 1212115002']");
	public static final By CONT_BUT = By.id("btnContinue");
	
	//Successful Screen
	public static final By REF_NUM = By.id("lblNumberHeader");
	public static final By BEN_ACC = By.xpath("//android.widget.TextView[@text='Beneficiary account: GB85 NWBK 6021 4774 2491 50']");
	public static final By AMT_CNF = By.xpath("//android.widget.TextView[@text='Amount: 1.00 AED']");
	public static final By CNF_DATE = By.id("lblDateHeader");
	
	
}
