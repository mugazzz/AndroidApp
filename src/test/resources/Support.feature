@Support @sprint7
Feature: Check support modules
  I should able to edit and view support modules

 @Support0 @Support_35 @reset
  Scenario: I should able to edit the nicknames of my active devices
   Given Verify the login check
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on more options icon
	 Then Tap on Settings option
	 And Select Active devices option
	 Then Select the device to edit nick name
	 Then Tap on edit link
	 And Rename the nickname
	 Then Tap confirm and verify the saved data
	 
	 @Support1 @Support_36 @reset
  Scenario: I should able to edit the nicknames of my active devices - duplicate nic
	Given Verify the login check
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on more options icon
	 Then Tap on Settings option
	 And Select Active devices option
	 Then Select the device to edit nick name2
	 Then Tap on edit link
	 And Rename the nickname
	 Then Tap confirm and verify the validation for duplicate nickname
	 
	 @Support2 @Support_37 @reset
  Scenario: I should able to edit the nicknames of my active devices - Click back icon
 Given Verify the login check
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on more options icon
	 Then Tap on Settings option
	 And Select Active devices option
	 Then Select the device to edit nick name
	 Then Tap on edit link
	 And Rename the nickname1
	 Then Tap header back and verify the nick name is not saved
	 
	  @Support3 @Support_25 @reset
  Scenario: I should able to change my mobile banking PIN using OTP
   Given Verify the login check
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on more options icon
	 Then Tap on Settings option
	 Then Tap on Login PIN change option
	 And Enter the Current Pin
	 Then Enter the new Pin
	 And Enter the confirm new pin
	 Then change pin button
	 Then Get the OTP from the third party app and enter the OTP2
	 Then Verify the successful message appears
	
	 	@Support4 @Support_ @reset
  Scenario: I should able to change my mobile banking PIN using incorrect current pin
   Given Verify the login check
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on more options icon
	 Then Tap on Settings option
	 Then Tap on Login PIN change option
	 And Enter the incorrect Current Pin
	 Then Enter the new Pin
	 And Enter the confirm new pin
	 Then Tap change pin button
	 Then Verify the incorrect current pin appears
	 
	 @Support5 @Support_ @reset
  Scenario: I should able to change my mobile banking PIN using incorrect new pin
   Given Verify the login check
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on more options icon
	 Then Tap on Settings option
	 Then Tap on Login PIN change option
	 And Enter the Current Pin
	 Then Enter the incorrect new Pin
	 And Enter the confirm new pin1
	 And Verify the pin mismatch validation
	 
	 @Support6 @Support_
  Scenario: I should able to change my mobile banking PIN using cancel Bio metric popup
   Given Verify the login check with Bio card
   	And Close and relaunch the app
   	Then Login by cancel the login popup
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on more options icon
	 Then Tap on Settings option
	 Then Tap on Login PIN change option
	 And Enter the Current Pin
	 Then Enter the new Pin
	 And Enter the confirm new pin1
	 Then Tap change pin button
	 Then Tap on Cancel finger print popup and navigate to OTP screen
#	 Then Get the OTP from the third party app and enter the OTP1
#	 Then Verify the successful message appears
	 
		
		
		
	 
	 
	 