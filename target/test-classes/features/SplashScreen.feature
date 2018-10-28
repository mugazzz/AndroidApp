@splash
Feature: Splash Screen

@splash0
Scenario: Splash screen is displayed on lunching the fresh app
	Given I am launching the fresh app
	Then Verify the screen redirected to landing page

@splash1
Scenario: Splash screen is not displayed when app is running in the background and activated again
	Given Moving the app to device background
	Then Restore the app the app from background
	And Verify the splash screen is displayed