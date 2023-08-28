Feature: US 1003 Flower Search
  Scenario TC003 User will search flower in amazon
    Given User goes to amazon homepage
    Then   User searches for flower in  search box
    And     Test that result text contains flower  word
    Then    Closes the page
