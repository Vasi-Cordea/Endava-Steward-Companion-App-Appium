Feature: MyProfile Scenarios

  Background:
    Given the user is on the Home page

  Scenario: Check page elements
    Given the user is on the "Home" tab from the Home page
    When the user clicks on the "Profile" button
    Then the user is on the "My profile" tab from the Home page
    And the user sees the following personal information: Name, Last Name, Email, Password, Date of Birth, Gender, Country and Ethnicity
    And the user sees the "Change password" button
    And the user sees the "Log out" button