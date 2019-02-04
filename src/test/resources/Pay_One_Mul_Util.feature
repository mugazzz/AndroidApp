@pay_one_mul @sprint6 @sprint4-6 @payment
Feature: Pay for one or multiple utilities
  I should be able to pay for one or multiple utilities

#	@pay_one_mul0 @Payment_8
#  Scenario: I should be able to pay for utilities_Single Payment-Pay for AADC
#  	Given Verify the login check tran
#		And Verify the user redirected to Dashboard screen successfully
#		Then Tap on the pay bills icon on tab bar
#		And Select AADC utility for payment
#		Then Tap on Pay All button and navigate to payment screen
#		Then Verify the outstanding balance amount
#		And Tap on from account and select the current account3
#    Then Tap confirm payment button
#    And Verify the Payment Confirmation screen
#    
#    @pay_one_mul1 @Payment_7
#  Scenario: I should be able to pay for utilities_Single Payment-Pay for ADDC
#  	Given Verify the login check tran
#		And Verify the user redirected to Dashboard screen successfully
#		Then Tap on the pay bills icon on tab bar
#		And Select ADDC utility for payment
#		Then Tap on Pay All button and navigate to payment screen
#		Then Verify the outstanding balance amount
#		And Tap on from account and select the current account3
#    Then Tap confirm payment button
#    And Verify the Payment Confirmation screen
#    
#    @pay_one_mul2 @Payment_10
#  Scenario: I should be able to pay for utilities_Single Payment-Pay for DEWA
#  	Given Verify the login check tran
#		And Verify the user redirected to Dashboard screen successfully
#		Then Tap on the pay bills icon on tab bar
#		And Select DEWA utility for payment
#		Then Tap on Pay All button and navigate to payment screen
#		Then Verify the outstanding balance amount
#		And Tap on from account and select the current account3
#    Then Tap confirm payment button
#    And Verify the Payment Confirmation screen
#    
#    @pay_one_mul3 @Payment_
#  Scenario: I should be able to pay for utilities_Single Payment-Pay for Salik
#  	Given Verify the login check tran
#		And Verify the user redirected to Dashboard screen successfully
#		Then Tap on the pay bills icon on tab bar
#		And Select Salik utility for payment
#		Then Tap on Pay All button and navigate to payment screen
#		Then Verify the outstanding balance amount
#		And Tap on from account and select the current account3
#    Then Tap confirm payment button
#    And Verify the Payment Confirmation screen

   @pay_one_mul4 @Payment_
  Scenario: I should be able to pay for utilities_Single Payment-Pay for Al Shamil
  		Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Select Shamil utility for payment
		Then Tap on Pay All button and navigate to payment screen
		Then Verify the outstanding balance amount
		And Tap on from account and select the current account4
    	Then Tap confirm payment button
    	And Verify the Payment Confirmation screen pay
    	
   @pay_one_mul5 @Payment_GSM
  Scenario: I should be able to pay for utilities_Single Payment-Pay for GSM
  		Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Select GSM utility for payment
		Then Tap on Pay All button and navigate to payment screen
		Then Verify the outstanding balance amount
		And Tap on from account and select the current account4
    	Then Tap confirm payment button
    	And Verify the Payment Confirmation screen pay
    
    @pay_one_mul6 @Payment_12
  Scenario: I should be able to pay for utilities_Multiple Payments-Pay from Current Account
  	Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Select GSM and SHAMIL utility for payment
    Then Tap on Pay All button and navigate to payment screen
		Then Verify the outstanding balance amount
		And Tap on from account and select the current account4
    Then Tap confirm payment button
    And Verify the Payment Confirmation screen pay
    
    @pay_one_mul6 @Payment_13
  Scenario: I should be able to pay for utilities_Multiple Payments-Pay from Savings Account
  	Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Select GSM and SHAMIL utility for payment
    Then Tap on Pay All button and navigate to payment screen
		Then Verify the outstanding balance amount
		And Tap on from account and select the savings account3
    Then Tap confirm payment button
    And Verify the Payment Confirmation screen pay
    
    @pay_one_mul7 @Payment_14
  Scenario: I should be able to pay for utilities_Multiple Payments-Pay from Card
  	Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Select GSM and SHAMIL utility for payment
    Then Tap on Pay All button and navigate to payment screen
		Then Verify the outstanding balance amount
		And Tap on from account and select the savings account3
    Then Tap confirm payment button
    And Verify the Payment Confirmation screen pay
    
    @pay_one_mul8 @Payment_14
  Scenario: I should be able to pay for utilities_Multiple Payments-Pay from Card
  		Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Select GSM and SHAMIL utility for payment
    Then Tap on Pay All button and navigate to payment screen
		Then Verify the outstanding balance amount
		And Tap on from account and select the savings account3
    Then Tap confirm payment button
    And Verify the Payment Confirmation screen pay
    
    @pay_one_mul9 @Payment_14
  Scenario: I should be able to pay for utilities_Multiple Payments-Pay - Multiple restriction
  	Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Select more than five utilities for payment
    Then Tap on Pay All button and navigate to payment screen
		Then Verify the Validation message appears for multiple payments
		
		
		
