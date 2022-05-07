@Smoke
Feature: Logged user could add different products to compare list

  Background: user can login and search for product
    Given user go to login page
    When user login with valid username and password
    And user press on login button
    Then user login to the system successfully

    Given user click on search field
    When user search with name of product

    Scenario:user is able to add different products to compare list then compare between them
      When user add the first product to compare list
      Then success message appears that the product is already added to the compare list
      And user add the second product to compare list
      And success message appears that the second product is already added to the compare list
      And user could see the items in the compare list
