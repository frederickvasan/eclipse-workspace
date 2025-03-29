Feature: Validating Api Request method

Scenario: Validating api GET request for Queryparam
								Given User should give the baseuri and request object for Queryparam
								When User should add the header and queryparam data
								And User should get the response object for "GET" request method for Queryparam
								Then User should print the responsebody and validate with expected status code 200 for Queryparam