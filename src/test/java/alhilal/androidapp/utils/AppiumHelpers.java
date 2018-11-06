package alhilal.androidapp.utils;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumHelpers {
	
	private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public AppiumHelpers() {
        driver = ConfigDriver.driver;
        wait = ConfigDriver.wait;
    }

    /**
     * @param locator
     */
    public void waitForVisibilityOfElement(By locator) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
    }

    /**
     * @param locator
     */
    public void waitForClickableElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    }

    /**
     * @param locator
     */
    public void waitForInVisibilityOfElement(By locator) {
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(locator)));
    }

    /**
     * @param time
     */
    public void implicitWait(long time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }


    public void assertTwoStringsEqual(String Actual, String Expected) {
        Assert.assertEquals("The two strings are not same", Actual, Expected);
    }


    public void assertTrue(Boolean value, String element) {
        Assert.assertTrue("The " + element + "is not as expected", value);
    }

    public void assertFalse(Boolean value, String element) {
        Assert.assertFalse("The " + element + "is as expected", value);
    }


    public void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public void assertTwoStringArrayEqual(String[] Actual, String[] Expected) {
        Assert.assertArrayEquals("The array's are not equal", Expected, Actual);
    }

    public void assertTwoStringsNotEqual(String oldValue, String newValue) {
        Assert.assertNotEquals("The values are same", oldValue, newValue);
    }

}
