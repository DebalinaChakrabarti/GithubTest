@tag
Feature: DS Algo Portal and Home Page
  I want to use this template for my feature file

  @tag1
  Scenario: DS Algo Portal
    Given The user opens DS Algo portal link
    Then The user should land in DS Algo portal page
 
  @tag2
  Scenario: DS Algo Portal Home
    Given The user opens DS Algo portal link again
    When The user clicks the 'Get Started' button
    Then The user should be redirected to homepage

  @tag3
  Scenario: DS Algo Home Data Structure Drop Down
    Given The user opens Home Page
    When The user clicks 'Data Structures' drop down
    Then The User should see 6 different data structure entries in that dropdown

