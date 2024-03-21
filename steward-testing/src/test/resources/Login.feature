Feature: Login scenarios

  Scenario: Login after registration
    Given the user is on the "Login after registration" page
    When the user fills "Email" field from Login page with "test.test@email.com" value
    And the user fills "Password" field from Login page with "Password0#" value
    And the user presses the "Login" button
    Then the user sees Welcome message
