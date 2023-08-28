Feature: US1008 Negative Login Test
  Scenario: TC11 Negative test with valid email and invalid password
    Given User goes to "qdUrl" page
    Then   User click on qdhomepage login button
    And     user enters an "qdValidUserName" to emailTextBox
    And     user enters "qdInvalidUserName" to passwordTexBox
    Then   user click on loginPage login button
    And     test that user could not  able to log in
    And     closes the page

  Scenario: TC11 Negative test with  invalid email and valid password
    Given User goes to "qdUrl" page
    Then   User click on qdhomepage login button
    And     user enters an "qdInvalidUserName" to emailTextBox
    And     user enters "qdValidPassword " to passwordTexBox
    Then   user click on loginPage login button
    And     test that user could not  able to log in
    And     closes the page

  Scenario: TC11 Negative test with  invalid email and invalid password
    Given User goes to "qdUrl" page
    Then   User click on qdhomepage login button
    And     user enters an "qdInvalidUserName" to emailTextBox
    And     user enters "qdInvalidPassword " to passwordTexBox
    Then   user click on loginPage login button
    And     test that user could not  able to log in
    And     closes the page