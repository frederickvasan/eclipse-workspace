Feature: login functionally facebook or Instagram or Flipkart

Scenario: login test with invalid credentials facebook or Instagram or Flipkart
					Given user should be in the facebook login
					When User should enter the Username and Password
					And User should click the login button
					Then User should verify the error message for the invalid credentials