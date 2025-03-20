@regressionfeature
Feature: login functionally facebook

@Reg
Scenario: login test with invalid credentials facebook
					Given user should be in the facebook login
					When User should enter the Username and Password
					And User should click the login button
					Then User should verify the error message for the invalid credentials
					
@sanity 					
Scenario: login test with invalid credentials facebook1
					Given user should be in the facebook login1
					When User should enter the Username and Password1
					And User should click the login button1
					Then User should verify the error message for the invalid credentials1
		
@smoke					
Scenario: login test with invalid credentials facebook2
					Given user should be in the facebook login2
					When User should enter the Username and Password2
					And User should click the login button2
					Then User should verify the error message for the invalid credentials2
	
@function				
Scenario: login test with invalid credentials facebook3
					Given user should be in the facebook login3
					When User should enter the "<username>" and "<password>"
					And User should click the login button3
					Then User should verify the error message for the invalid credentials3
					
					
Examples: 
      | username  | password | 
      | frederick@test.com |     Test123! |
      | gerald@test.com |     Testing123! | 
      | mani@test.com |     Testingmani123! | 
