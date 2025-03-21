Feature: login functionally facebook

Scenario: login test with invalid credentials facebook
					When User should enter the "<username>" and "<password>"
					And User should click the login button

Examples: 
      | username  | password | 
      | frederick@test.com |     Test123! |
      | gerald@test.com |     Testing123! | 
      | mani@test.com |     Testingmani123! | 