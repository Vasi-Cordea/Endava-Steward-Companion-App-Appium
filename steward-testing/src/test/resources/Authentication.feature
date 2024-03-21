Feature: Authentication scenarios

  @HEAAP003-134
  Scenario: 6-digit activation code
    Given the user is on the "Authentication" page
    When the user presses the "Authentication code" button
    Then a digit only keyboard is made available for typing in the code