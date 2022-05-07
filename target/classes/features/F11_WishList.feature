@Smoke
Feature: user could be able to add products to the wishlist


  Background: user login with valid credentials
    Given user go to login page
    When user login with valid username and password
    And user press on login button
    Then user login to the system successfully



    Scenario: user add products to wishlist successfully
      Given user click on wishlist for a specific product
      And user add another element to wishlist
      When user goes to Wishlist
      And count number of quantity


