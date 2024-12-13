@navigation
Feature: Google Navigation

  Scenario: Navigate to Google Store Page
    Given I am on the google page
    When I click on store button
    Then I should see store page