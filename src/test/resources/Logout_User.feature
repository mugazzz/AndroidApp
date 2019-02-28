@logout @sprint7
Feature: Title of your feature
  I want to use this template for my feature file

  @logout1
  Scenario: Verify the logout option is available for the user
      Given Verify the login check account
	 		And Verify the user redirected to Dashboard screen successfully
      Then Tap more option and open the menu bar
      And Verify the logout option
      
@logout2
  Scenario: Verify the logout cofirmation popup appears
      Given Verify the login check account
	 And Verify the user redirected to Dashboard screen successfully
      Then Tap more option and open the menu bar
      And Verify the logout option
      Then Tap on logout option
      And Verify the logout confirmation popup appears
      
@logout2
 Scenario: Check the user not get logout, while cancel the confirmation
    Given Verify the login check account
	 And Verify the user redirected to Dashboard screen successfully
      Then Tap more option and open the menu bar
      And Verify the logout option
      Then Tap on logout option
      And Verify the logout confirmation popup appears
      Then Tap No to cancel the cofirmation
      And Verify the user not get logout
      
@logout3
  Scenario: Verify the user are allowed to logout by confirming the popup
     Given Verify the login check account
	 And Verify the user redirected to Dashboard screen successfully
      Then Tap more option and open the menu bar
      And Verify the logout option
      Then Tap on logout option
     	And Verify the logout confirmation popup appears
      Then Tap yes for the confirmation
      And Verify the screen redirected to login screen
    
@logout3
Scenario: Verify the user are allowed to logout and login the user
   Given Verify the login check account
	 And Verify the user redirected to Dashboard screen successfully
     Then Tap more option and open the menu bar
     And Verify the logout option
     Then Tap on logout option
     Then Tap yes for the confirmation
     And Verify the screen redirected to login screen
     Then Enter the Login PIN
		And Verify the user redirected to Dashboard screen successfully