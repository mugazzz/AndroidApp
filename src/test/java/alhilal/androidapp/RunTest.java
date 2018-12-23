package alhilal.androidapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.service.local.AppiumDriverLocalService;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports/html-report", "rerun:target/rerun.txt"},
		features="src/test/resources", tags="@Transfer_94")

public class RunTest{
//private static AppiumDriverLocalService service;
//
//@BeforeClass
//public static void startAppiumServer() {
//    service = AppiumDriverLocalService.buildDefaultService();
//    service.start();
//}
//
//@AfterClass
//public static void stopAppiumServer() {
//    service.stop();
//}
}
