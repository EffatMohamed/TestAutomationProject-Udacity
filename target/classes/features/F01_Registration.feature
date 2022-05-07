@Smoke
Feature: user should be able to sign up with new account successfully

  Scenario: user should be able to sign up with valid credentials successfully

    Given user click on register link
    When user fills your personal details with valid data
    And user fills your password field with valid data
    And user clicks on register button
    Then user could sign up to his home page successfully and success message is displayed

