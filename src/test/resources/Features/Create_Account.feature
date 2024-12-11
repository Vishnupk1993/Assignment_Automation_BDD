Feature:  Account Creation for magneto
  
  Scenario Outline: Account Creation
    Given User Enters the URL
    Then User Lands on the Homepage
    And User lands on the Account creation page and create new account with "<FirstName>" and "<LastName>" and "<Email>" and "<Password>" and "<ConfirmPassword>"
    And User Navigates to My Account Page and Validate the success message
    And user Logout from Application
    Then User close the browser
    
    Examples:
      | FirstName | LastName | Email                 | Password   | ConfirmPassword |
      | demotest  | Demo4    | demotest4@yopmail.com | qwerty@123 | qwerty@123      |
		