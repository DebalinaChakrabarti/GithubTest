
@tag
Feature: Graph 
Background: 
    Given user launch chorme browser
 And user opens URl "https://dsportalapp.herokuapp.com"
  When User click on Get Started 
 When  user clicks on Get Started below Graph 
   
Then it should redirected to Graph Page
 
 
 
  Scenario: Graph page 
    ###Given  clicks  Get Started button in Graph then  it should be directed to Graph 
    Given user click Graph button and  user should be directed to Graph Page
    Then  click Try Here link and   should be redirected to a page having an tryEditor with  Run button 
    And run the code from Excel 
    
  Scenario: Graph Representations
    Given  user clicks Graph Representations button and user should  directed to Graph Representations Page
    Then  user clicks Try Here button
    And should redirected to  page having an tryEditor with Run button to test
    And get  code from excel and run
    Then user will click on Practice Questions button and  user should be redirected to Practice page
    