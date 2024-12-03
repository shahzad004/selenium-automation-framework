Feature: Login Functionality

  Scenario: Login using valid credentials
    Given The user is on login page
    When Enters valid username and password
    Then User should be navigated to dashboard

  Scenario: Login using invalid credentials
    Given The user is on login page
    When Enters invalid username and password
    Then User should see invalid username or password message

