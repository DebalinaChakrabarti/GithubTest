

Feature: DS Algo Portal

Scenario: DS Algo Portal
    Given User launch Chrome Browser
    And  User opens URL "https://dsportalapp.herokuapp.com"
    Then User should Land In DS Algo portal page
    When User click on Get Started 
    Then User should be redirected to homepage
    And  Page title should be "NumpyNinja"
    And  User should see six panes with different data structures
    Given User opens Home Page
    When User click on Data Structures drop down
    Then User should see six different data structure entries in that drop down
    When User click any data structures item from the drop down without Sign in
    Then It should alert the user with the message "You are not logged in"
    When User click on Get Started below the data structure
    Then It should alert the user with the message "You are not logged in"
    When User click on Sign in
    Then User should be redirected to Sign in page
    And  Page title will be "Login"
    When User click on Register
    Then User should be redirected to Register form
    And  Page title will be "Registration"
     