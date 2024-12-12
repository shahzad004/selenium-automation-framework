@googleSignIn
Feature: Navigate to google signIn page

  Scenario: User should be able to navigate to google sign in page
    Given User is on google dashboard
    When I will click on google signIn button
    Then I should see Use your Google Account text on signin page