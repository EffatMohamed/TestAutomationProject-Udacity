@Smoke
Feature: Create successful Order
  Background: user is able to add many items to his shooping cart
    Given user go to login page
    When user login with valid username and password
    And user press on login button
    Then user login to the system successfully

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

 Scenario: user is able to complete his order successfully
   When user is able to accept terms and conditions
   And user is able to click on Checkout
   And user is able to select country
   And user is able to enter the city successfully
   And user is able to enter the address successfully
   And user isa able tp Enter His ZIP code successfully
   And user is able to Enter the phone number successfully and continue the process
   And user is able to fill address
   And user able to select paymentMethods
   Then user can confirm the order
   And  success Message Appears that the order is already completed successfully



