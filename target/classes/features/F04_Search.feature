@Smoke
Feature: user could search for any product on the website

  Background: user is able to login successfully
    Given user go to login page
    When user login with valid username and password
    And user press on login button
    Then user login to the system successfully

  Scenario: user could search for product using product name

    Given user click on search field
    When user search with name of product
    Then user could find relative results

