package alhilal.androidapp.utils;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends ConfigDriver {

    @Before
    public void startDriver(Scenario scenario) throws MalformedURLException {
        setUp(scenario);
    }


    @After
    public void closeDriver(Scenario scenario) {
       // if (scenario.isFailed()) {
            driver.context(AppStrings.NATIVE_CONTEXT);
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
        //}
        tearDown();
    }


}
