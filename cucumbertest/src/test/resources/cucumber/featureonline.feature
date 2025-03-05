
Feature: login functionally facebook or Instagram

  Scenario Outline: login test with invalid credentials facebook or Instagram 
          Given user should be in the facebook or Instagram login
					When User should enter the "<username>" and "<password>"
					And User should click the login button
					Then User should verify the error message for the invalid credentials

    Examples: 
      | username  | password | 
      | frederick@test.com |     Test123! |
      | gerald@test.com |     Testing123! | 
      | mani@test.com |     Testingmani123! | 
