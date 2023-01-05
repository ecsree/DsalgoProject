Feature: Validate different functions in Data Structures

  Scenario: Validate get started function for Data Structures
    Given user should be in homepage logged in url "https://dsportalapp.herokuapp.com/home"
    When user clicks on "Get started" button under Data Structures
    Then user should be in Data Structures page

  Scenario: Validate "Time Complexity" link
    When user clicks on the link "Time Complexity"
    Then user should be redirected to "Time Complexity" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Data Structure") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back
    
    Scenario: Validate "Practice Questions" link
    When user clicks on Data Structures "Practice Questions"
    Then user should be redirected to "Practice Questions" page
    And user should be able to navigate back from Data Structures to homepage