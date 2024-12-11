Feature: User login to magneto
  Scenario Outline: User login to the application
    Given User enter the magneto Login Url
    Then User Navigate to Homepage and click on the Sign In link
    And User Enters the "<Email>" and "<Password>"
    And User click on the Sign in button
    And User navigate to the Homepage


    Examples:
      | Email                 | Password
      | demotest4@yopmail.com | qwerty@123