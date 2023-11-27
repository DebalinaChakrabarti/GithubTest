@tag
Feature: Tree 
Background: common Steps
 Given User launch Chrome Browser
    And  User opens URL "https://dsportalapp.herokuapp.com"
    When User click on Get Started 

# And user clicks on sign in
# Then user enters "Username" and "Password"
 #And user click on login 
 When user click on Get Started button below the Tree   
Then it should redirected to Tree Page
   


  Scenario: Overview Of Trees
    Given   user is in the Tree page after logged in
     When  user clicks Overview of Trees button
     Then  user should be directed to Overview of Trees Page
     Then  User click TryHere button and redirected to TryEditor and click on run when it enter data from Excel 
   
  
 
  Scenario: Terminologies
  Given The user is in the Tree page after logged in 
  When The user clicks Terminologies button
  Then The user should be directed to Terminologies Page
  Then The user clicks Try Here link and The user should be redirected to a page having an tryEditor with a Run button 
  And take data from excel and Run them
   
  Scenario: Types of Trees
  Given The user is in the Tree page after logged in 
  When User click on Types of Trees button
  Then The user should be directed to Types of Trees Page
 And  click Try Here button then The user should be connecte to  tryEditor and run code from Excel sheet and click Run button
  
 
  Scenario: Tree Traversals
  Given The user is in the Tree page after logged in
  When The user clicks Tree Traversals button
  Then The user should be directed to Tree Traversals Page
  Then clicks Try Here  and it will redirected to a page having an tryEditor with a Run to test
  Then  enter code and Run code 
   
   Scenario: Traversals-Illustration
  Given user is in the Tree page after logged in
  When  user clicks Traversals-Illustration button
  Then  user should be directed to Traversals-Illustration Page
  Then  user try Try Here link and to a page tryEditor to run it with the excel code and click run
  
  

Scenario: Types Treesof Binary
Given The user is in the Tree page after logged in
When The user clicks Binary Trees button
Then The user should be directed to Types Treesof Binary  Page
When  user clicks Try Here button then it  should  redirected to  tryEditor with a Run button to code verification from excel sheet 
And click run button

Scenario: Implementation in Python 
Given  user is in the Tree page after logged in
When  user clicks Implementation in Python button
Then  user should be directed to Implementation in Python Page
Then  user run the code from Excel code into TryEditor when user clicks on Try Here button  


Scenario: Binary Tree Traversals
Given The user is in the Tree page after logged in
When The user clicks Binary Tree Traversals button
Then The user should be directed to Binary Tree Traversals Page
Given  the code from excel to tryEditor   when the user click on Try Here button  and run the excel code but clicking on run button         


Scenario: Implementation of Binary Trees
Given The user is in the Tree page after logged in
When The user clicks Implementation of Binary Trees button
Then The user should be directed to Implementation of Binary Trees Page
When user click Try Here button and user is in  tryEditor  page and implement a code from Excel
And run by run button

Scenario: Applications of Binary trees 
Given The user is in the Tree page after logged in
When The user clicks Applications of Binary trees button
Then The user should be directed to Applications of Binary trees Page
When user is in  tryEditor page after clicking Try Here button  
Then user  apply the code from excel and run it by run button 

Scenario: Binary Search Trees
Given The user is in the Tree page after logged in
When The user clicks Binary Search Trees button
Then The user should be directed to Binary Search Trees Page
Given the code from excel sheet to Run on tryEditor page when user click on Try Here button 
Then user clicks on run button

Scenario: IMplentation of Bst
Given The user is in the Tree page after logged in
When The user clicks Implementation Of BST button
Then The user should be directed to Implementation Of BST Page
When the user click on Try Here then it will enter to tryEditor page and takes a code from excel and run it by run button

Scenario: Practice Questions
Given The user is in the Tree page after logged in
When user will click on Practice Questions button
Then The user should be redirected to Practice page
