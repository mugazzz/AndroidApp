$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration_Cred_Card.feature");
formatter.feature({
  "line": 2,
  "name": "Registration process using Credit Card",
  "description": "I should be able to register using my Credit card and Credit card pin",
  "id": "registration-process-using-credit-card",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@reg_cred_card"
    }
  ]
});
formatter.before({
  "duration": 9848556815,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device",
  "description": "",
  "id": "registration-process-using-credit-card;registration-process-should-allow-user-to-activate-biometric-login---biometrics-features-are-enabled-and-set-for-the-device",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@reg_cred_card3"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#\tGiven Verify the screen redirected to landing page"
    },
    {
      "line": 35,
      "value": "#\tAnd Verify the homescreen button Register using card number"
    },
    {
      "line": 36,
      "value": "#\tWhen Tap on Register using card number button and navigate to registration screen"
    },
    {
      "line": 37,
      "value": "#\tThen Enter the Active Credit Card number"
    },
    {
      "line": 38,
      "value": "#\tAnd Enter the Active Credict Card PIN number"
    },
    {
      "line": 39,
      "value": "#\tThen Verify the card details are validated on fly and navigate to OTP screen"
    }
  ],
  "line": 40,
  "name": "Get the OTP from the third party app",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Enter the OTP and confirm the screen navigates to you are all set! screen",
  "keyword": "And "
});
formatter.match({
  "location": "Reg_Use_Credit_Card_Steps.get_the_OTP_from_the_third_party_app()"
});
formatter.result({
  "duration": 55349216393,
  "error_message": "org.openqa.selenium.NoSuchSessionException: A session is either terminated or not started\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027Als-MacBook-Pro.local\u0027, ip: \u0027172.16.9.143\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_102\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {VERSION: 8.0.0, appActivity: com.ahb.mb.dev.AlHilalBank, appPackage: com.ahb.mb.dev, databaseEnabled: false, desired: {VERSION: 8.0.0, appActivity: com.ahb.mb.dev.AlHilalBank, appPackage: com.ahb.mb.dev, deviceName: ce12171ca29fc41504, platformName: android}, deviceManufacturer: samsung, deviceModel: SM-G955F, deviceName: ce12171ca29fc41504, deviceScreenSize: 1440x2960, deviceUDID: ce12171ca29fc41504, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, platform: LINUX, platformName: LINUX, platformVersion: 8.0.0, takesScreenshot: true, warnings: {}, webStorageEnabled: false}\nSession ID: 2d0d9b7e-634a-47ff-a68b-33f931934ca7\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.HorizontalScrollView[@index\u003d\u00271\u0027]/android.support.v7.widget.RecyclerView[@index\u003d\u00270\u0027]/android.widget.LinearLayout[@index\u003d\u00270\u0027]/android.widget.FrameLayout[@index\u003d\u00271\u0027]/android.widget.TextView[@index\u003d\u00270\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:129)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat alhilal.androidapp.pages.Reg_Use_Credit_Card_Page.Third_PartyApp(Reg_Use_Credit_Card_Page.java:93)\n\tat alhilal.androidapp.step_definitions.Reg_Use_Credit_Card_Steps.get_the_OTP_from_the_third_party_app(Reg_Use_Credit_Card_Steps.java:48)\n\tat ✽.Then Get the OTP from the third party app(Registration_Cred_Card.feature:40)\n",
  "status": "failed"
});
formatter.match({
  "location": "Reg_Use_Credit_Card_Steps.enter_the_OTP_and_confirm_the_screen_navigates_to_you_are_all_set_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 8956433,
  "error_message": "io.appium.java_client.NoSuchContextException: A session is either terminated or not started\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027Als-MacBook-Pro.local\u0027, ip: \u0027172.16.9.143\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_102\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {VERSION: 8.0.0, appActivity: com.ahb.mb.dev.AlHilalBank, appPackage: com.ahb.mb.dev, databaseEnabled: false, desired: {VERSION: 8.0.0, appActivity: com.ahb.mb.dev.AlHilalBank, appPackage: com.ahb.mb.dev, deviceName: ce12171ca29fc41504, platformName: android}, deviceManufacturer: samsung, deviceModel: SM-G955F, deviceName: ce12171ca29fc41504, deviceScreenSize: 1440x2960, deviceUDID: ce12171ca29fc41504, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, platform: LINUX, platformName: LINUX, platformVersion: 8.0.0, takesScreenshot: true, warnings: {}, webStorageEnabled: false}\nSession ID: 2d0d9b7e-634a-47ff-a68b-33f931934ca7\n\tat io.appium.java_client.AppiumDriver.context(AppiumDriver.java:201)\n\tat alhilal.androidapp.utils.Hooks.closeDriver(Hooks.java:23)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:283)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:173)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:153)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:128)\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)\nCaused by: org.openqa.selenium.NoSuchSessionException: A session is either terminated or not started\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027Als-MacBook-Pro.local\u0027, ip: \u0027172.16.9.143\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_102\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {VERSION: 8.0.0, appActivity: com.ahb.mb.dev.AlHilalBank, appPackage: com.ahb.mb.dev, databaseEnabled: false, desired: {VERSION: 8.0.0, appActivity: com.ahb.mb.dev.AlHilalBank, appPackage: com.ahb.mb.dev, deviceName: ce12171ca29fc41504, platformName: android}, deviceManufacturer: samsung, deviceModel: SM-G955F, deviceName: ce12171ca29fc41504, deviceScreenSize: 1440x2960, deviceUDID: ce12171ca29fc41504, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, platform: LINUX, platformName: LINUX, platformVersion: 8.0.0, takesScreenshot: true, warnings: {}, webStorageEnabled: false}\nSession ID: 2d0d9b7e-634a-47ff-a68b-33f931934ca7\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:129)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\n\tat io.appium.java_client.AppiumDriver.context(AppiumDriver.java:198)\n\t... 39 more\n",
  "status": "failed"
});
});