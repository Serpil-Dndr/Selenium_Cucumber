Feature: US1006 How to use configuration properties file
  #  To reach any value from configuration.properties file we need to use parameters.Scenario:
#  Then in the method we use that parameter to get the value from configuration.properties file
  Scenario: TC07 User goes to Amazon and test that has been reached amazon.com
    Given User goes to "amazonURL" page
    Then Test that URL has "amazon" word
    Then Closes the page

  Scenario: TC08 User goes to WiseQuarter and test that has been reached amazon.com
    Given User goes to "wqURL" page
    Then Test that URL has "wisequarter" word
    Then Closes the page

  Scenario: TC09 User goes to FaceBook and test that has been reached amazon.com
    Given User goes to "fbURL" page
    Then Test that URL has "facebook" word
    Then Closes the page



