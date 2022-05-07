@Smoke
Feature: Logged user could select different tags

  Background: user is able to search for certain item
    Given user click on search field
    When user search with name of product
    Then user could find relative results

  Scenario: user is able to select different tags when searching for a certain item

    Given use select advanced search
    And user select Apparel Category List
    And user click on search in description
    When user clicks on submit"search" button
    Then user is able to click on shoes tag
    And user clicks on awesome tag
