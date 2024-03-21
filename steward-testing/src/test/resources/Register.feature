Feature: Register scenarios

  @HEAAP003-115
  Scenario: Elements on the page
    Given the user is on the "Authentication" page
    When the user enters 123456 code
    Then the user is redirected to the "Register your account" page
    And the user sees "First name field"
    And the user sees "Last name field"
    And the user sees "Email field"
    And the user sees "Password field"
    And the user sees "Confirm password field"
    And the user sees "Terms and Conditions checkbox"
    And the user sees "Register button"

  @HEAAP003-130
  Scenario: Enter valid personal information
    Given the user is on the "Register your account" page
    When the user fills "First name" field with "Test" value
    And the user fills "Last name" field with "Test" value
    And the user fills "Email" field with "test.test@email.com" value
    And the user fills "Password" field with "Password0#" value
    And the user fills "Confirm password" field with "Password0#" value
    And the user ticks the checkbox with Terms and Conditions
    Then the user sees Register button is enabled

#    fails because of the bug HEAAP003-242
  @HEAAP003-131
  Scenario: Invalid First name and Last name
    Given the user is on the "Register your account" page
    When the user fills First name and Last name fields with numeric characters
    Then the user sees error messages "First name not valid" and "Last name not valid"

  @HEAAP003-170
  Scenario: User taps Register button
    Given the user is on the "Register your account" page
    And all the fields were filled with valid data
    And the user ticks the checkbox with Terms and Conditions
    And the user sees Register button is enabled
    When the user presses the "Register" button
    Then the user is redirected to the "Login" page
