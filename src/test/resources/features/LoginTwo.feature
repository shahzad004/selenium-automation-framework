Feature: Login Functionality

  Scenario Outline: Successfull Login using different credentials
    Given The user is on login page
    When The user Enters valid username "<username>" and password "<password>"
    Then User should be navigated to dashboard

    Examples:
      | username      | password      |
      | validUsername | validpassword |
      | validUsername | validpassword |

  Scenario Outline: Unsucessfull Login using different invalid credentials
    Given The user is on login page
    When The user Enters invalid username "<username>" and password "<password>"
    Then User should see invlaid login message "<invalid_login_message>"

    Examples:
      | username        | password        | invalid_login_message          |
      | invalidUsername | invalidUsername | Incorrect username or password |
      | invalidUsername | invalidUsername | Incorrect username or password |

