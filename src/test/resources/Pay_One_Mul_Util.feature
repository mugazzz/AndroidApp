@pay_one_mul @sprint6
Feature: Pay for one or multiple utilities
  I should be able to pay for one or multiple utilities

	@pay_one_mul @Payment_8
  Scenario: I should be able to pay for utilities_Single Payment-Pay for AADC
  	Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Select AADC utility for payment
		Then Verify the outstanding balance amount
		Then Tap on Pay All button and navigate to payment screen
		And Tap on from account and select the current account1
    Then Tap confirm payment button
    And Verify the Payment Confirmation screen
    
    
    
    
		
		
		
