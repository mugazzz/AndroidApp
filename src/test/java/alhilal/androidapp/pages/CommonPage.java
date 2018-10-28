package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static alhilal.androidapp.utils.Locators.*;

import alhilal.androidapp.utils.AppiumHelpers;
import alhilal.androidapp.utils.ConfigDriver;


public class CommonPage extends ConfigDriver {

    protected AppiumHelpers appiumHelpers = new AppiumHelpers();

    public void clickOnElement(By element) {
        appiumHelpers.waitForVisibilityOfElement(element);
        driver.findElement(element).click();
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

}
