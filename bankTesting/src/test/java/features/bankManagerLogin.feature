Feature: bankMangerlogin
  bankMangerlogin

  @bankMangerlogin
  Scenario: 
    Given User is on Login Page of the application
    When User logs in as Bank Manager
    
    And User clicks on Add Customer button on Main page
    And User enters first Name, last Name, post Code 
    And User clicks on Add Customer Submit button on Main page
     And User clicks on Open Account button on Main page
     And User Selects customer and curreny from dropDown on Main page
     And User clicks on Process button on Main page 
     
      And User clicks on Customers button on Main page
      And USer searchs the account Details on Main page