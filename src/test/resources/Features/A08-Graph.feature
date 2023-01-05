Feature: Validate different functions in Graph

  Scenario: Validate get started function for Graph
    Given user should be in homepage logged in url "https://dsportalapp.herokuapp.com/home"
    When user clicks on "Get started" button under Graph
    Then user should be in Graph page

  Scenario: Validate "Graph" link
    When user clicks on the link "Graph"
    Then user should be redirected to "Graph" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Graph") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Graph Representations" link
    When user clicks on the link "Graph Representations"
    Then user should be redirected to "Graph Representations" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Graph Representations") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Practice Questions" link
    When user clicks on Graph "Practice Questions"
    Then user should be redirected to "Practice Questions" page
    And user should be able to navigate back from Graph to homepage
