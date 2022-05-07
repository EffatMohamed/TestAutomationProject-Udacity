@Smoke
Feature: Logged User could switch between currencies US-Euro

  Background: user logged successfully
    Given user go to login page
    When user login with valid username and password
    And user press on login button
    Then user login to the system successfully

  Scenario: user could change the currency to be Euro

    Given user click on currencies button
    When user select Euro
    Then user can see all prices in Euro