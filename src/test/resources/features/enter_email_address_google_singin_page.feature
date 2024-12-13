@googleEnterEmail
Feature: Enter email on google signin page

  Scenario: User should be able to enter their email address
    Given User is on google dashboardd
    When I will click on google signIn buttond
    Then I should see Use your Google Account text on signin paged
    When I enter an email address
    And I click on next button
    Then I should see welcome text