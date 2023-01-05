Feature: Validate different functions in Tree

  Scenario: Validate get started function for Tree
    Given user should be in homepage logged in url "https://dsportalapp.herokuapp.com/home"
    When user clicks on "Get started" button under Tree
    Then user should be in Tree page

  Scenario: Validate "Overview of Trees" link
    When user clicks on the link "Overview of Trees"
    Then user should be redirected to "Overview of Trees" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Tree") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Terminologies" link
    When user clicks on the link "Terminologies"
    Then user should be redirected to "Terminologies" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Terminologies") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Types of Trees" link
    When user clicks on the link "Types of Trees"
    Then user should be redirected to "Types of Trees" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Types of Trees") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Tree Traversals" link
    When user clicks on the link "Tree Traversals"
    Then user should be redirected to "Tree Traversals" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Tree Traversals") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Traversals-Illustration" link
    When user clicks on the link "Traversals-Illustration"
    Then user should be redirected to "Traversals-Illustration" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Traversals-Illustration") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Binary Trees" link
    When user clicks on the link "Binary Trees"
    Then user should be redirected to "Binary Trees" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Binary Trees") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Types of Binary Trees" link
    When user clicks on the link "Types of Binary Trees"
    Then user should be redirected to "Types of Binary Trees" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Types of Binary Trees") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Implementation in Python" link
    When user clicks on the link "Implementation in Python"
    Then user should be redirected to "Implementation in Python" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Types of Binary Trees") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Binary Tree Traversals" link
    When user clicks on the link "Binary Tree Traversals"
    Then user should be redirected to "Binary Tree Traversals" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Binary Tree Traversals") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Implementation of Binary Trees" link
    When user clicks on the link "Implementation of Binary Trees"
    Then user should be redirected to "Implementation of Binary Trees" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Implementation of Binary Trees") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back
    
    Scenario: Vaidate "Applications of Binary trees" link
    When user clicks on the link "Applications of Binary trees"
    Then user should be redirected to "Applications of Binary trees" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Applications of Binary trees") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back
    
    Scenario: Vaidate "Binary Search Trees" link
    When user clicks on the link "Binary Search Trees"
    Then user should be redirected to "Binary Search Trees" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Binary Search Trees") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "Implementation Of BST" link
    When user clicks on the link "Implementation Of BST"
    Then user should be redirected to "Implementation Of BST" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Implementation Of BST") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Practice Questions" link
    When user clicks on Tree "Practice Questions"
    Then user should be redirected to "Practice Questions" page
    And user should be able to navigate back from Tree to homepage
