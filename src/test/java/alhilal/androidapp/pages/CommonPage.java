package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;

import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;

import java.time.Duration;
import alhilal.androidapp.utils.AppiumHelpers;
import alhilal.androidapp.utils.ConfigDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;


public class CommonPage extends ConfigDriver {

    protected AppiumHelpers appiumHelpers = new AppiumHelpers();

    public void clickOnElement(By element) {
        appiumHelpers.waitForVisibilityOfElement(element);
        driver.findElement(element).click();
    }

    public void scrollDown(By locator) {
        MobileElement slider = driver.findElement(locator);
        Dimension size = slider.getSize();
        TouchAction scroll = new TouchAction(driver).press(ElementOption.element(slider, size.width / 2, size.height / 2 + size.height / 6))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(ElementOption.element(slider, size.width / 2, size.height / 2)).release();
        scroll.perform();
    }

    public void navigateBack() {
        driver.navigate().back();
    }
    
    public void enterText(By idLocator, String keys) {
        driver.findElement(idLocator).sendKeys(keys);
    }
    
    public void clearText(By text) {
        driver.findElement(text).clear();
    }
    
    public void relaunchApp() {
        driver.launchApp();
    }

    public void waitForProgressBarToDismiss() {
        try {
            appiumHelpers.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (elementExists(PROGRESS_BAR)) {
            appiumHelpers.waitForInVisibilityOfElement(PROGRESS_BAR);
        }
    }
    
    public boolean elementExists(By locator) {
        appiumHelpers.implicitWait(2);
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } finally {
            appiumHelpers.implicitWait(IMPLICIT_WAIT_TIME);
        }

    }
    
    public boolean elemenDoesnotExists(By locator) {
        appiumHelpers.implicitWait(2);
        try {
            driver.findElement(locator);
            return false;
        } catch (NoSuchElementException e) {
            return true;
        } finally {
            appiumHelpers.implicitWait(IMPLICIT_WAIT_TIME);
        }

    }
    
    public void Verify_Validation_Message(String Message){
    		waitForProgressBarToDismiss();
    		String xmlFormat = driver.getPageSource();
    		assertThat(xmlFormat, CoreMatchers.containsString(Message));
    	}

}
