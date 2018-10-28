package alhilal.androidapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("VERSION", "8.0.0"); 
    	capabilities.setCapability("deviceName","ce12171ca29fc41504");
    	capabilities.setCapability("platformName","Android");
       capabilities.setCapability("appPackage", "com.ahb.mb.dev");
    // This package name of your app (you can get it from apk info app)
    	capabilities.setCapability("appActivity","com.ahb.mb.dev.AlHilalBank"); // This is Launcher activity of your app (you can get it from apk info app)
    //Create RemoteWebDriver instance and connect to the Appium server
     //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
       RemoteWebDriver driver1 = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }
    
}
