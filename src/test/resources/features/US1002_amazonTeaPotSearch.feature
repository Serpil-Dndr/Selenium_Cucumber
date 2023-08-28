Feature: Us 1002 Tea Pot search
  Scenario: TC02 User will search tea pot in amazon
    Given User goes to amazon homepage
    Then   User searches for tea pot in  search box
    And     Test that result text contains TeaPot  word
    Then    Closes the page
