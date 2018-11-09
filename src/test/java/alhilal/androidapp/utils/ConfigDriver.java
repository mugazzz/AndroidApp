package alhilal.androidapp.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ConfigDriver {
	
	    public static AppiumDriver<MobileElement> driver;
	    public static WebDriver driver2;
	    public static WebDriverWait wait;
	    private File appPath;

	    public ConfigDriver() {
	        appPath = getApplicationPath();
	    }

	    public void setUp(Scenario scenario) throws MalformedURLException {

	        /**
	         wip to fetch the OS details in device name and platform version dynamically.
	         */
	    	
	  
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ce12171ca29fc41504");
	        capabilities.setCapability("appPackage", "com.ahb.mb.dev");
	        capabilities.setCapability("appActivity", "com.ahb.mb.dev.AlHilalBank");
	        capabilities.setCapability(MobileCapabilityType.APP, appPath);
	        if (scenario.getSourceTagNames().contains("@reset")) {
	            //capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");
	            capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
	        } else {
	            capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
	            capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
	        }

	        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	        wait = new WebDriverWait(driver, 20);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }


	    // Closing the driver
	    public void tearDown() {
	        try {
	            driver.quit();
	            driver = null;
	            wait = null;
	        } catch (Exception ignored) {
	        }
	    }

	    private File getApplicationPath() {
	        String apkPattern = ".apk";
	        File classpathRoot = new File(System.getProperty("user.dir"));
	        File appDir = new File(classpathRoot, "src/test/build");
	        File[] app = appDir.listFiles();
	        for (File item : app) {
	            if (!(item.isHidden())) {
	                if (item.getName().endsWith(apkPattern)) {
	                    appPath = item.getAbsoluteFile();
	                    return appPath;
	                }
	            }
	        }
	        return null;
	    }

}
