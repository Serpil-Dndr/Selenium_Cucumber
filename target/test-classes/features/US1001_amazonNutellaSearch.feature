Feature:  US1001 User will search for Nutella in Amazon
  Scenario: TC01 User will search Nutella
    Given User goes to amazon homepage
    Then  User searches for Nutella in search box
    And    Test that result text contains Nutella word
    Then  Closes the page


