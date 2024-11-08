Feature: Login


  @SmokeTest
  Scenario Outline: Login with <Invalid Case>
    Given on the login page
    When user input username "<Username>" and password "<Password>"
    And user click on login button
    Then system shows error message "<Message>"

    Examples:
      | Invalid Case      | Username          | Password      | Message                                                                   |
      | Locked Account    | locked_out_user   | secret_sauce  | Epic sadface: Sorry, this user has been locked out.                       |
      | Invalid Account   | invalid_user      | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
      | Blank Credentials |                   |               | Epic sadface: Username is required                                        |

  @RegressionTest
  Scenario: Valid Login
    Given on the login page
    When user input username "standard_user" and password "secret_sauce"
    And user click on login button
    Then system go to inventory page
