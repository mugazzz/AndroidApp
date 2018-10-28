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
  "duration": 8425543900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Register usign Credit Card and Credit Card pin - Active Card",
  "description": "",
  "id": "registration-process-using-credit-card;register-usign-credit-card-and-credit-card-pin---active-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@reg_cred_card0"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Verify the homescreen button Register using card number",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Tap on Register using card number button and navigate to registration screen",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter the Active Credit Card number",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter the Active Credict Card PIN number",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify the card details are validated on fly",
  "keyword": "Then "
});
formatter.match({
  "location": "NonReg_HomeScreen_Steps.verify_the_homescreen_button_Register_using_card_number()"
});
formatter.result({
  "duration": 2908284967,
  "error_message": "java.lang.AssertionError: The Registration using card details button is displayedis not as expected\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat alhilal.androidapp.utils.AppiumHelpers.assertTrue(AppiumHelpers.java:60)\n\tat alhilal.androidapp.pages.NonReg_HomeScreenpage.VerifyRegbtn(NonReg_HomeScreenpage.java:9)\n\tat alhilal.androidapp.step_definitions.NonReg_HomeScreen_Steps.verify_the_homescreen_button_Register_using_card_number(NonReg_HomeScreen_Steps.java:11)\n\tat ✽.Given Verify the homescreen button Register using card number(Registration_Cred_Card.feature:7)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 5124506253,
  "status": "passed"
});
});