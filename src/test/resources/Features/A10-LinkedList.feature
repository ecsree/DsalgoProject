Feature: Validate different functions in Linked List

  Scenario: Validate get started function for Linked List
    Given user should be in homepage logged in url "https://dsportalapp.herokuapp.com/home"
    When user clicks on "Get started" button under Linked List
    Then user should be in Linked List page

  Scenario: Validate "Introduction" link
    When user clicks on the link "Introduction"
    Then user should be redirected to "Introduction" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Linked List") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Creating Linked LIst" link
    When user clicks on the link "Creating Linked LIst"
    Then user should be redirected to "Creating Linked LIst" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Creating Linked LIst") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Types of Linked List" link
    When user clicks on the link "Types of Linked List"
    Then user should be redirected to "Types of Linked List" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Types of Linked List") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Implement Linked List in Python" link
    When user clicks on the link "Implement Linked List in Python"
    Then user should be redirected to "Implement Linked List in Python" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Implement Linked List in Python") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Traversal" link
    When user clicks on the link "Traversal"
    Then user should be redirected to "Traversal" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Traversal") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Insertion" link
    When user clicks on the link "Insertion"
    Then user should be redirected to "Insertion" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Insertion") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Deletion" link
    When user clicks on the link "Deletion"
    Then user should be redirected to "Deletion" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Deletion") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Practice Questions" link
    When user clicks on Linked List "Practice Questions"
    Then user should be redirected to "Practice Questions" page
    And user should be able to navigate back from Linked List to homepage
