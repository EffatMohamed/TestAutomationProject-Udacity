@Smoke
Feature: Logged user could select different Categories

  Background: user logged successfully
    Given user go to login page
    When user login with valid username and password
    And user press on login button
    Then user login to the system successfully

  Scenario: user could select different categories
    Given user click on the main category: Electronics
    When user select sub-category:Camera & Photo
    Then user navigate to the subcategories page
    And user select Jewelry section
    And user is able add Jewerly items ti his cart