@Smoke
Feature: Logged user could filter with color

  Background: user logged successfully
    Given user go to login page
    When user login with valid username and password
    And user press on login button
    Then user login to the system successfully

  Scenario: user is able to filter with color
    Given user clicks on Apparel category
    When user clicks on subcategory shoes
    And user filter with red
    And user click on the first item
    Then user could view the full picture of the red shoes
    And user could able to add the red shoes to the cart
    And success operation by checking the color element