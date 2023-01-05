Feature: Validate different functions in Array

  Scenario: Validate get started function for Array
    Given user should be in homepage logged in url "https://dsportalapp.herokuapp.com/home"
    When user clicks on "Get started" button under Array
    Then user should be in Array page

  Scenario: Validate "Arrays in Python" link
    When user clicks on the link "Arrays in Python"
    Then user should be redirected to "Arrays in Python" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Array") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Arrays Using List" link
    When user clicks on the link "Arrays Using List"
    Then user should be redirected to "Arrays Using List" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Arrays Using List") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Basic Operations in Lists" link
    When user clicks on the link "Basic Operations in Lists"
    Then user should be redirected to "Basic Operations in Lists" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Basic Operations in Lists") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Applications of Array" link
    When user clicks on the link "Applications of Array"
    Then user should be redirected to "Applications of Array" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Applications of Array") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Practice Questions" link
    When user clicks on Array "Practice Questions"
    Then user should be redirected to "Practice Questions" page
    And user should be able to navigate back from Array to homepage
