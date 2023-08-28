Feature: US1007 Positive Login Test
  Scenario: TC001 Positive test with valid username
    Given User goes to "qdUrl" page
    Then   User click on qdhomepage login button
    And     user enters an " to emailTextBox
    And     user enters password to passwordTexBox
    Then   user click on loginPage login button
    And     test that user is able to log in


