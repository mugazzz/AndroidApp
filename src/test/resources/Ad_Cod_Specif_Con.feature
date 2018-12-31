@Add_Code @sprint4
Feature: Shown an input field for additional codes for specific countries
  I should be shown an input field for additional codes for specific countries

  @Add_Code0 @Transfer_104 @reset
  Scenario: Able to see an input field for additional codes for specific countries - US
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Tap on add beneficiary option and navigate to add beneficiary screen
		Then Choose other bank options
		And Tap on account number and SWIFT link and navigate to enter account number screen
		Then Enter the account number and swift code for US
		And Tap on Next button and navigate to contry code
		Then Verify fields Fed wire & ABA are displayed
		
	@Add_Code1 @Transfer_105 @reset
  Scenario: Able to see an input field for additional codes for specific countries - UK
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Tap on add beneficiary option and navigate to add beneficiary screen
		Then Choose other bank options
		And Tap on account number and SWIFT link and navigate to enter account number screen
		Then Enter the account number and swift code for UK
		And Tap on Next button and navigate to contry code
		Then Verify fields UK are displayed
		
	@Add_Code2 @Transfer_106 @reset
  Scenario: Able to see an input field for additional codes for specific countries - India
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Tap on add beneficiary option and navigate to add beneficiary screen
		Then Choose other bank options
		And Tap on account number and SWIFT link and navigate to enter account number screen
		Then Enter the account number and swift code for IN
		And Tap on Next button and navigate to contry code
		Then Verify fields IN are displayed
		
	@Add_Code3 @Transfer_107 @reset
  Scenario: Able to see an input field for additional codes for specific countries - Canada
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Tap on add beneficiary option and navigate to add beneficiary screen
		Then Choose other bank options
		And Tap on account number and SWIFT link and navigate to enter account number screen
		Then Enter the account number and swift code for CA
		And Tap on Next button and navigate to contry code
		Then Verify fields CA are displayed
		
	@Add_Code4 @Transfer_108 @reset
  Scenario: Able to see an input field for additional codes for specific countries - Australia
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Tap on add beneficiary option and navigate to add beneficiary screen
		Then Choose other bank options
		And Tap on account number and SWIFT link and navigate to enter account number screen
		Then Enter the account number and swift code for AU
		And Tap on Next button and navigate to contry code
		Then Verify fields AU are displayed