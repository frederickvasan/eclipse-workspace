@Jsonproject
Feature: Validating Api Request method

@JsonGETquery
Scenario: Validating api GET request for Queryparam
								Given User should give the baseuri and request object for Queryparam
								When User should add the header and queryparam data
								And User should get the response object for "GET" request method for Queryparam
								Then User should print the responsebody and validate with expected status code 200 for Queryparam

@JsonGETPathparam								
	Scenario: Validatling api GET request for Pathparam
                Given User should give the baseuri and request object for Pathparam
                When User should add the header and pathparam data
                And User should get the response object for "GET" request method for Pathparam
                Then User should print the responsebody and validate with expected status code 200 for Pathparam
                
 @JsonPOST               
 Scenario: Validatling api POST request
                Given User should give the baseuri and request object
                When User should add the header 
                And User should be able to "POST" the data given 
                Then User should print the responsebody and validate with expected status code 201 for Posting a data

@JsonPUT                
 Scenario: Validatling api PUT request
                Given User should give the baseuri and request object
                When User should add the header 
                And User should be able to "PUT" the data given and give the addpath
                Then User should print the responsebody and validate with expected status code 200 for Posting a data
 
 @JsonDELETE               
  Scenario: Validatling api DELETE request
                Given User should give the baseuri and request object
                When User should add the header 
                And User should be able to "DELETE" the data given and give the Queryparam
                Then User should print the responsebody and validate with expected status code 204 for Posting a data
