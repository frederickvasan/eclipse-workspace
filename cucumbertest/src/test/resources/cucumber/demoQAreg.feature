Feature: DemoQA  Registration Page

  Scenario: Register with valid data from Excel
    Given User is on the registration page
    When User enters registration details from Excel row "1"
    Then Registration should be successful