package alhilal.androidapp;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports/html-report", "rerun:target/rerun.txt"},
		features="src/test/resources/features", tags="@reg_cred_card3")

public class RunTest
{
	/*private static AppiumDriverLocalService service;
	public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;
    private File appPath;
	@BeforeClass
	 public static void setUp() throws MalformedURLException {

     
         wip to fetch the OS details in device name and platform version dynamically.
        
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("VERSION", "8.0.0"); 
    	capabilities.setCapability("deviceName","ce12171ca29fc41504");
    	capabilities.setCapability("platformName","Android");
    	capabilities.setCapability("appPackage", "com.ahb.mb.dev");
    	capabilities.setCapability("appActivity", "com.ahb.mb.dev.AlHilalBank");
    	
        /*DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ce12171ca29fc41504");
        capabilities.setCapability("appPackage", "com.ahb.mb.dev");
        capabilities.setCapability("appActivity", "com.ahb.mb.dev.AlHilalBankv");
        capabilities.setCapability(MobileCapabilityType.APP, appPath);
        if (scenario.getSourceTagNames().contains("@reset")) {
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
        } else {
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        }*

        driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public static void startAppiumServer() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @AfterClass
    public static void stopAppiumServer() {
        service.stop();
    }*/
}
