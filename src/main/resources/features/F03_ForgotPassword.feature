@Smoke
Feature: User could reset his/her password successfully

  Scenario: user is able to reset his password
    Given user click on login button
    And user clicks on ForgotPassword button
    When user enters his valid email
    And user clicks on Recover button
    Then success message appears to notify the user that all details are sent to his email address