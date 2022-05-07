@Smoke
Feature:Logged user could add different products to Shopping cart
  Background: user is able to login successfully
    Given user go to login page
    When user login with valid username and password
    And user press on login button
    Then user login to the system successfully

  Scenario: user is able to add different products to his cart

    Given user clicks on The Apparel category
    When user clicks on subcategory clothes
    And user adds products from clothes category
    And User ENter Req. text
    And user add the Tshirt to his cart
    And user click on Digital downloads
    And user click ON DD Photo
    And user Add DD photo TO The cart
    And user click ON Shopping CArt
    Then user is able to update the quantity
    And user is able to remove items from cart
    And user could confirm update cart

