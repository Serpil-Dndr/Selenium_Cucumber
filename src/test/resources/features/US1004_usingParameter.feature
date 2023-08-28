Feature:  US1004 Using parameters on test steps
  # If you are planning to use same steps at the beginning of each scenario
# you can use background
# Whatever method is placed under background will be executed first
#    If we want to create a dynamic method we can enter parameters when we create the method
#    we should enter parameter between double quats
#    After preparing the methods names we need to create them in a stepDefinition class
#    To create them there are a few ways
#    1) we can come over it and create the method from popup message
#    2) we can run the test and system will print missing methods on colse so we can get the methods from the console
#    This will create a parameter gate which can receive value from method text
#    so we can change the parameter and use the method
  Background: Before each Scenario this method will be executed
    Given User goes to amazon page
  Scenario: TC04 We will create new methods where we can use parameters


    Then  User searches for "Nutella" in search box
    And    Test that result text contains "Nutella" word
    Then  Closes the page

  Scenario: TC05 We will create new methods where we can use parameters

    Then  User searches for "Apple" in search box
    And    Test that result text contains "Apple" word
    Then  Closes the page

  Scenario: TC06 We will create new methods where we can use parameters

    Then  User searches for "TeaPot" in search box
    And    Test that result text contains "TeaPot" word
    Then  Closes the page

