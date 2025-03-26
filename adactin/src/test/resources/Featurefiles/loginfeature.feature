@hotelbookingreg
Feature: login functionally adactinhotel


@loginvalid
Scenario: login test with valid credentials adactinhotel
					Given user should be in the adactinhotel login
					When User should enter the Username and Password
					And User should click the login button
					Then User should be able to login
					
	@logininvalid
	Scenario: Unsuccessful login with invalid credentials
             Given User launches the Adactin Hotel App
            When User enters username "invalidUser" and password "wrongPassword"
            And Clicks on the login button
            Then User should see an error message
  
  @Searchhotels          
 	Scenario: Search Hotels 
             Given User launches the Adactin Hotel App
             Given User login using Valid username and password  and clicks login button
             When user search for hotels in the Search Hotel 
            And Clicks on the search button
            Then Select Hotel page to be displayed
    
    @hotelbooking        
  	Scenario: Hotel Booked
             Given User launches the Adactin Hotel App
             Given User login using Valid username and password  and clicks login button
             Given  user search for hotels in the Search Hotel 
            Given Clicks on the search button
            When user clicks the select the hotel and click continue
            And User able to book a hotel 
            Then User Logs out of the wesite